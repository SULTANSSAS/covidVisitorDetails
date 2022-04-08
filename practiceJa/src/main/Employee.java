package main;

public class Employee {
    private String name;
    private double workedHours;
    private double dedicationScore;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", workedHours=" + workedHours +
                ", dedicationScore=" + dedicationScore +
                '}';
    }

    public double getDedicationScore() {
        return dedicationScore;
    }

    public void setDedicationScore(double dedicationScore) {
        this.dedicationScore = dedicationScore;
    }

    public Employee(String name, double workedHours) {
        this.name = name;
        this.workedHours = workedHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }
// Constructor, Getters and Setters

    public void calculateDedication() {
        dedicationScore = workedHours*1.5;
    }

    public void receiveReward() {
        System.out.println(String
                .format("%s just got a reward for being a dedicated worker!", name));
    }
}