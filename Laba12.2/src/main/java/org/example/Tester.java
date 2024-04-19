package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;
    public Tester(String name, String surname) {
        this(name, surname, 0);
    }
    public Tester(String name, String surname, int experienceInYears) {
        this(name, surname, experienceInYears, "Intermediate");
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 2000.0);
    }
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public void printInfo() {
        System.out.println("Tester: " + name + " " + surname);
    }
    public void printInfo(String title) {
        System.out.println(title + ": " + name + " " + surname);
    }
    public void printInfo(String title, boolean showSalary) {
        System.out.print(title + ": " + name + " " + surname);
        if (showSalary)
            System.out.println(", Salary: " + salary);
        else
            System.out.println();
    }
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
