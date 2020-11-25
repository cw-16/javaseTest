package com.wang.test03;

public class Duck extends Poultry{

    public Duck() {
    }

    public Duck(String name, String symptom, String age, String illness) {
        super(name, symptom, age, illness);
    }

    @Override
    public void showSymptom() {
        System.out.println(super.getSymptom());
    }
}
