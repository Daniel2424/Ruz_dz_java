package ru.mirea.dz9and10;

public interface EmployeePosition {
    default String getJobTitle(){
        return getClass().getSimpleName();
    }
    double calcSalary();
}
