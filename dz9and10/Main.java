package ru.mirea.dz9and10;

public class Main {
    public static void main(String[] args)
    {
        Company company = new Company(180, 80, 10);
        System.out.println("Highest salaries:");
        company.print(company.getTopSalaryStaff(10), 1);
        System.out.println();
        //
        System.out.println("Lowest salaries:");
        company.print(company.getLowestSalaryStaff(15), 1);
        System.out.println();
        //
        company.dismiss((company.getSubordinates().size() + company.getTopManagers().size()) - 30);
        System.out.println("Highest salaries:");
        company.print(company.getTopSalaryStaff(10), 1);
        System.out.println();
        //
        System.out.println("Lowest salaries:");
        company.print(company.getLowestSalaryStaff(15), 1);
    }
}
