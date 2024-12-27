package com.kg.geometry;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Gyan", 21,2500);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Sagar");
        System.out.println(emp.getEmployeeDetails());
    }
}
