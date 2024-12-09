package com.java.project;

interface Patient {
    void show();
}

class PatientInfo implements Patient {
    private String name;
    private String disease;
    private int age;


    // Constructor to initialize patient details
    public PatientInfo(String name, String disease,int age) {
        this.name = name;
        this.disease = disease;
        this.age=age;
    }

    // Implementing the show() method from the interface
    @Override
    public void show() {
        System.out.println("Patient Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Age" + age);
    }

    
}


