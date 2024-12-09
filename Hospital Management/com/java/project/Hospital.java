package com.java.project;

class Hospital {
    String Ranking;
    public Hospital(String Ranking){
        this.Ranking=Ranking;
        
       

    }
    public void rank(String Ranking){
        if (Ranking == "A"){
            System.out.println("Work AT Top Hospitals in the country");


        }
        else if (Ranking == "B") {
            System.out.println("Work at Best Hospitals in the country but below category A");
            
        
            
        } 
        
        else {
            System.out.println("Work at Tier 3 Hospitals");
            
        }

        


    }

}

class NameHospital extends Hospital {
    String Name;

    // Constructor for NameHospital
    public NameHospital(String Name,String Ranking) {
        

        super(Ranking); // Call the parent class constructor
        this.Name=Name;
    }
        // Display hospital details
        public void displayDetails() {
            System.out.println("Hospital Name: " + Name);
            System.out.println("Hospital Ranking: " + Ranking);
            rank(Ranking); // Call the rank method from the parent class
        }
    
}

