package com.hillel.dzhurynskyi.homework.hm14;

public class FitnessTracker {
   private final String name;
    private final int day;
    private final String month;
    private final int year;
    private final String email;
    private final String phoneNumber;
    private String surname;
    private int weight;
    private int pressure;
    private int stepsPerDay;

    public FitnessTracker(String name, String surname, int day, String month, int year, String email, String phoneNumber, int weight, int pressure, int stepsPerDay) {
        this.name = name;
        this.surname = surname;
        this.day = day;
        this.month = month;
        this.year = year;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsPerDay = stepsPerDay;
    }

    public static void printAccountInfo(FitnessTracker fitnessTracker) {
        System.out.println("Name: " + fitnessTracker.getName() + "\n" +
                "Surname: " + fitnessTracker.getSurname() + "\n" +
                "Birthday: " + fitnessTracker.getDay() + "." + fitnessTracker.getMonth() + "." + fitnessTracker.getYear() + "\n" +
                "Email: " + fitnessTracker.getEmail() + "\n" +
                "Phone: " + fitnessTracker.getPhoneNumber() + "\n" +
                "Weight: " + fitnessTracker.getWeight() + "\n" +
                "Pressure: " + fitnessTracker.getPressure() + "\n" +
                "Steps per day: " + fitnessTracker.getStepsPerDay() + "\n" +
                "Age: " + fitnessTracker.getAge() + "\n");
    }

    public int getAge() {
        return 2020 - year;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }
}
