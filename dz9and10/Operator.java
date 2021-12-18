package ru.mirea.dz9and10;

public class Operator extends Employee implements EmployeePosition{


    public Operator(String firstName, String secondName, double fixedSalary) {
        super(firstName, secondName, fixedSalary);
    }

    @Override
    public double calcSalary() {
        return this.fixedSalary;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", fixedSalary=" + fixedSalary +
                '}';
    }
}
