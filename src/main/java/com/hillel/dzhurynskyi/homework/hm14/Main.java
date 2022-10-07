package com.hillel.dzhurynskyi.homework.hm14;

public class Main {
    public static void main(String[] args) {
        FitnessTracker first=new FitnessTracker("Den","Hens",20,"10",2003,"hens@gg.com","+224565641412",100,90,15454);
        FitnessTracker second=new FitnessTracker("Walter","White",25,"08",1954,"wwhite@gg.com","+224525366412",75,95,15754);
        FitnessTracker third=new FitnessTracker("Gustavo","Fring",10,"04",1985,"fring@gg.com","+224562321412",65,85,15444);
        System.out.println("Before:");
      FitnessTracker.printAccountInfo(first);
        FitnessTracker.printAccountInfo(second);
        FitnessTracker.printAccountInfo(third);

        first.setPressure(5255);
        first.setSurname("Nensy");
        first.setStepsPerDay(555);

        second.setWeight(85);
        second.setStepsPerDay(120);

        System.out.println("\n\nAfter:");
        FitnessTracker.printAccountInfo(first);
        FitnessTracker.printAccountInfo(second);
        FitnessTracker.printAccountInfo(third);
    }

}
