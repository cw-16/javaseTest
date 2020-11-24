#数据类型转换&运算符&方法入门
# 基础题目:

## 第一题
* 编写步骤：
1. 定义类 Test1
2. 定义 main方法
3. 定义两个byte类型变量b1,b2,并分别赋值为10和20.
4. 定义变量b3,保存b1和b2的和,并输出.
5. 定义两个short类型变量s1,s2,并分别赋值为1000和2000.
6. 定义变量s3,保存s1和s2的和,并输出.
7. 定义一个char类型变量c1赋值为'a',一个int类型变量i1赋值为30.
8. 定义变量ch3,保存c1和i1的差,并输出.

## 第二题
* 编写步骤：

  1. 定义类 Test2
  2. 定义 main方法
  3. 定义 int类型变量i1 和 long类型变量l1
  4. 定义变量add,保存i1和l1的和,并输出.
  5. 定义 long类型变量l2 和 float类型变量f2
  6. 定义变量add2,保存l2和f2的和,并输出.
  7. 定义 int类型变量i3 和 double类型变量d3
  8. 定义变量add3,保存i3和d3的和,并输出.
  9. 定义 float类型变量f4 和 double类型变量d4
  10. 定义变量add4,保存f4和d4的和,并输出.

## 第三题
- 编写步骤：
  1. 定义类 Test3
  2. 定义 main方法
  3. 定义char类型变量ch,赋值为'J'
  4. 使用强制转换的方式,将变量ch转换为小写'j',并输出
  5. 定义char类型变量ch2,赋值为'a'
  6. 使用+=的方式,将变量ch2转换为大写'A',并输出
  7. 定义double类型变量d3,int类型变量i3
  8. 定义double变量sum3,保存d3与i3的和,输出sum3的值和sum3去除小数部分的值
  9. 定义double类型变量d4,int类型变量i4
  10. 定义int变量mul4,保存d4和i4乘积的整数部分,并输出

## 第四题
- 编写步骤：

  1. 定义类 Test4
  2. 定义 main方法
  3. 定义两个int类型变量a1和a2,分别赋值10,11,判断变量是否为偶数,拼接输出结果
  4. 定义两个int类型变量a3和a4,分别赋值12,13,判断变量是否为奇数,拼接输出结果

## 第五题
* 编写步骤：
  1. 定义类 Test5
  2. 定义 main方法
  3. 定义一个int类型变量a,变量b,都赋值为20.
  4. 定义boolean类型变量bo , 判断++a 是否被3整除,并且a++ 是否被7整除,将结果赋值给bo
  5. 输出a的值,bo的值.
  6. 定义boolean类型变量bo2 , 判断b++ 是否被3整除,并且++b 是否被7整除,将结果赋值给bo2
  7. 输出b的值,bo2的值.


## 第六题
- 编写步骤：

1. 定义类 Test6
2. 定义 main方法
3. 定义方法printNum,在main方法中调用printNum方法
4. printNum方法中,定义int变量a赋值为9,b也赋值为9
5. printNum方法中,定义int变量num赋值为++a.
6. printNum方法中,定义boolean变量bo,使用三元运算符赋值,当num>=10,赋值为true,否则为false,打印bo的值
7. printNum方法中,定义int变量num2赋值为b++. 
8. printNum方法中,定义boolean变量bo2,使用三元运算符赋值,当num2>=10,赋值为true,否则为false.打印bo2的值

## 第七题
- 编写步骤：

  1. 定义类 Test7
  2. 定义 main方法
  3. 定义方法printNum,在main方法中调用printNum方法
  4. printNum方法中,定义float变量f1赋值12345.01
  5. printNum方法中,定义float变量f2赋值12345.00
  6. printNum方法中,定义float 变量 var1 , 使用三元运算符赋值,当f1大于等于f2时,赋值12456 ,当f1小于f2赋值12456.02
  7. printNum方法中,定义float 变量 var2 , 保存var1 与1024的和.
  8. printNum方法中,同时输出var1,var2的值.


## 第八题
* 编写步骤：

  1. 定义类 Test8
  2. 定义 main方法
  3. 定义printNum方法,在main方法中调用printNum方法
  4. printNum方法中,定义int类型变量i赋值为10,j 赋值为20;
  5. printNum方法中,将 i/5 的商 与 j的和 赋值给j
  6. printNum方法中,定义int类型变量k,将j赋值给k.
  7. printNum方法中,最后同时输出 i, j ,k 的值,查看结果.

## 第九题
- 编写步骤：

  1. 定义类 Test9
  2. 定义 main方法
  3. 定义printString方法
  4. printNum方法中,定义String 类型变量str.
  5. printNum方法中,定义int类型变量num,赋为任意整数值.
  6. printNum方法中,通过三元运算符,判断num为偶数,将"偶数"赋值给str,否则将"奇数"赋值给str
  7. printNum方法中,输出拼接效果

## 第十题
- 编写步骤：

  1. 定义类 Test10
  2. 定义 main方法
  3. 定义add方法,打印两个变量的和
  4. 定义sub方法,打印两个变量的差
  5. 定义mul方法,打印两个变量的积
  6. 定义div方法,打印两个变量的商
  7. 定义remain方法,打印两个变量的余数
  8. main方法中,依次调用add方法,sub方法,mul方法,div方法,remain方法