# 练习一：集合框架

## 一、请简述集合框架。

​        集合按照其存储结构可以分为两大类，分别是单列集合java.util.Collection和双列集合java.util.Map。

​        Collection：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，分别是java.util.List和java.util.Set。其中，List的特点是元素有序、元素可重复。Set的特点是元素无序，而且不可重复。List接口的主要实现类有java.util.ArrayList和java.util.LinkedList，Set接口的主要实现类有java.util.HashSet和java.util.TreeSet。

# 练习二：Collection集合统计元素出现次数



一、给定以下代码，请定义方法listTest()统计集合中指定元素出现的次数，如"a": 2,"b": 2,"c" :1, "xxx":0。



```java
Collection<String> list = new ArrayList<>();
			list.add("a");
			list.add("a");
			list.add("b");
			list.add("b");
			list.add("c");
			System.out.println("a:"+listTest(list, "a"));	
			System.out.println("b:"+listTest(list, "b"));	
			System.out.println("c:"+listTest(list, "c"));
			System.out.println("xxx:"+listTest(list, "xxx"));	

```



```java
**public class** CollectionTest01{
   **public static void** main(String[] args) {
     Collection<String> list = **new** ArrayList<>();
     list.add(**"a"**);
     list.add(**"a"**);
     list.add(**"b"**);
     list.add(**"b"**);
     list.add(**"c"**);
     System.**out**.println(**"a:"**+listTest(list, **"a"**));
     System.**out**.println(**"b:"**+listTest(list, **"b"**));
               System.out.println("c:"+listTest(list, "c"));
        System.out.println("xxx:"+listTest(list, "xxx"));
    }

    //定义方法统计集合中指定元素出现的次数
    public static int listTest(Collection<String> list,String s){
        //定义计数器，初始化为0
        int count = 0;
        //增强for遍历集合
        for (String string : list) {
            //判断传入方法的字符与遍历集合的是否一致
            if (s.equals(string)) {
                //如果一致，加1
                count++;
            }
        }
        return count;
    }
}

```



# 练习三：Collection集合数组转集合

## 一、定义一个方法，要求此方法把int数组转成存有相同元素的集合(集合里面的元素是Integer)，并返回。()

```java
public class CollectionTest02 {
    public static void main(String[] args) {
        //定义int数组
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> list = listTest(arr);
        System.out.println(list);
    }

    public static ArrayList<Integer> listTest(int[] arr) {
        //定义集合
        ArrayList<Integer> list = new ArrayList<Integer>();
        //遍历数组，把元素依次添加到集合当中
        for (int a : arr) {
            list.add(a);
        }
        return list;
    }
}

```

# 练习四：Collection集合集合转数组

一、定义一个集合，并把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。（可以使用Object[]数组类型接收转换的数组）

```java
public class CollectionTest03 {
    public static void main(String[] args) {
        //定义集合,添加数据
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(100);
        list.add(200);
        list.add(300);
        //Object[] toArray()转换成一个Object数组
        Object[] obj =  list.toArray();
        // 遍历数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}

```

# 练习五：Collection集合contains()方法使用

一、定义一个方法listTest(ArrayList<String> al, String s),要求使用contains()方法判断al集合里面是否包含s。

```java
public class CollectionTest04 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("itcast");
        list.add("itheima");
        list.add("java");
        System.out.println(listTest(list,"java"));
    }

    public static boolean listTest(ArrayList<String> al, String s) {
        //判断s是否在集合中存在,存在返回true，不存在返回false
        if (al.contains(s)) {
            return true;
        }
       return false;
    }
}

```

# 练习六：Collection集合isEmpty()方法的使用

一、定义一个方法listTest(ArrayList<String> al), 要求使用isEmpty()判断al里面是否有元素。

```java
public class CollectionTest05 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        System.out.println(listTest(list));
    }

    public static boolean listTest(ArrayList<String> al) {
        //判断al集合是否为空,为空返回true，不为空返回false
        if(al.isEmpty()){
            return true;
        }
        return false;
    }
}

```

# 练习七：简述迭代器的实现原理

一、请简述迭代器的实现原理

​        当遍历集合时，首先通过调用集合的iterator()方法获得迭代器对象，然后使用hashNext()方法判断集合中是否存在下一个元素，如果存在，则调用next()方法将元素取出，否则说明已到达了集合末尾，停止遍历元素。

​        Iterator迭代器对象在遍历集合时，内部采用指针的方式来跟踪集合中的元素，在调用Iterator的next()方法之前，迭代器的索引位于第一个元素之前，不指向任何元素，当第一次调用迭代器的next方法后，迭代器的索引会向后移动一位，指向第一个元素并将该元素返回，当再次调用next方法时，迭代器的索引会指向第二个元素并将该元素返回，依此类推，直到hasNext方法返回false，表示到达了集合的末尾，终止对元素的遍历。

# 练习八：Collection集合返回首次出现索引

一、定义一个方法listTest(ArrayList<Integer> al, Integer s)，要求返回s在al里面第一次出现的索引，如果s没出现过返回-1。

```java
public class CollectionTest06 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(listTest(list, 5));
    }

    public static int listTest(ArrayList<Integer> al, Integer s) {
        //遍历集合，获取元素，判断元素是否与s相等，相等返回索引
        for (int i = 0; i < al.size(); i++) {
            if (al.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}
```