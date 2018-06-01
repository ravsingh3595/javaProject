package com.rav;

public class Student {

    private int studentId;
    private String studentName;
    private double m1, m2, m3;
    private double total;
    private double percentage;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getM1() {
        return m1;
    }

    public void setM1(double m1) {
        this.m1 = m1;
    }

    public double getM2() {
        return m2;
    }

    public void setM2(double m2) {
        this.m2 = m2;
    }

    public double getM3() {
        return m3;
    }

    public void setM3(double m3) {
        this.m3 = m3;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public void setStudentInformation(int studentId, String studentName, double m1, double m2, double m3){
        this.studentId = studentId;                     //this = address of the current address
        this.studentName = studentName;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    private void totalMarks(){

        this.total = m1 + m2 + m3;

    }
    public void display(){

        totalMarks();
        System.out.format("%d %s %f %f %f %f%n", studentId, studentName, m1, m2, m3, total);
    }

}
