package com.jamey.bank_try;

public class Child extends Father {
    private boolean graduate;

    public Child(int age, String name) {
        super(age, name);
        this.getMessage();
    }

    public boolean isGraduate() {
        return graduate;
    }

    public void setGraduate(boolean graduate) {
        this.graduate = graduate;
    }
    public void getMessage() {
        System.out.println("name= " + super.getName());
    }
}
