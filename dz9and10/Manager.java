package ru.mirea.dz9and10;

public class Manager extends Employee implements EmployeePosition{

    private double bonus;
    public Manager(String name, String surname, double fixedSalary) {
        super(name, surname, fixedSalary);
        this.bonus = ( 115000 + Math.random() * 25000 ) * 0.05;
    }

    @Override
    public double calcSalary() {
        return fixedSalary + bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name='" + name + '\'' +
                ", Surname='" + surname + '\'' +
                ", fixedSalary=" + fixedSalary +
                '}';
    }
}
