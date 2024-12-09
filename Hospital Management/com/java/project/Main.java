package com.java.project;

public class Main {
    public static void main(String[] args) {
        Category doctor1 = new Category("Dr. Smith", 40, 120000, "Pediatrics");
        System.out.println("Name: " + doctor1.Name);
        System.out.println("Age: " + doctor1.Age);
        System.out.println("Salary: " + doctor1.Salary);
        System.out.println("Category: " + doctor1.Category);

        NameHospital hospital1 = new NameHospital("City Hospital", "A");
        hospital1.displayDetails();

        System.out.println();
        
        Category doctor2 = new Category("Dr. ASH", 40, 120000, "SURGEN");
        System.out.println("Name: " + doctor2.Name);
        System.out.println("Age: " + doctor2.Age);
        System.out.println("Salary: " + doctor2.Salary);
        System.out.println("Category: " + doctor2.Category);
        
        NameHospital hospital2 = new NameHospital("Town Hospital", "B");
        hospital2.displayDetails();

        
        System.out.println();


        Patient P1= new PatientInfo("Ashmit", "Canecer",22);
        P1.show();
         
    }

}
