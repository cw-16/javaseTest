package com.wang.test03;

public abstract class Poultry {
    private String name;
    private String symptom;
    private String age;
    private String illness;

    public Poultry() {
    }

    public Poultry(String name, String symptom, String age, String illness) {
        this.name = name;
        this.symptom = symptom;
        this.age = age;
        this.illness = illness;
    }

    public abstract void showSymptom();

    public void showMsg(){
        System.out.println("基本信息");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
