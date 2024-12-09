package com.java.project;

 class Doctor {
    String Name;
    int Age;
    int Salary;
     
    public Doctor(String Name, int Age,int Salary){
        this.Name=Name;
        this.Age=Age;
        this.Salary=Salary;

    }
   
}

class Category extends Doctor {
    String Category;

    public Category(String Name, int Age, int Salary, String Category) {
        super(Name, Age, Salary); // Call the Doctor class constructor
        this.Category = Category;
    }
}
