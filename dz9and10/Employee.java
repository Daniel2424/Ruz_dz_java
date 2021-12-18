package ru.mirea.dz9and10;

public class Employee {
    protected String name, surname;
    protected double fixedSalary;

    public Employee(String name, String surname, double fixedSalary) {
        this.name = name;
        this.surname = surname;
        this.fixedSalary = fixedSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fixedSalary=" + fixedSalary +
                '}';
    }
}
