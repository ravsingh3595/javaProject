package com.rav;

public class employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    public void setValues(int id, String name, double sal){

        employeeId = id;
        employeeName = name;
        salary = sal;

    }
    public void display(){

        System.out.println(employeeId);
        System.out.println(employeeName);
        System.out.println(salary);
    }
}
