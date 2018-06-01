package com.rav;


import java.util.Arrays;

public class sample {

    public static void displayArray () {

        //           int a[5] ,b[10]; not permitted
        //          int [] a1,b1,c1;
        int a[] = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < 5; i++) {

            sum = a[i] + a[i] ;
            System.out.println(sum);
        }

        char s = new char[20]
        Arrays.fill(s, '-' );
        String ss = s.

    }

    public static void main(String[] args) {

        displayArray();
//            System.out.println("Expample 1-----");
//
//            for (int i = 0; i < 5; i++) {
//
//                System.out.println(a[i]);
//            }
//
//            System.out.println("Expample 2-----");
//
//            a[2] = 300;
//            a[3] = 400;
//
//            for (int j = 0; j < 5; j++) {
//
//                System.out.println(a[j]);
//            }
//            int c[] = new int[5];           //two way of initializing (first)
//            int b[] = new int[]{1,2,3};     // (second)
//            c[0] = 10;
//            c[1] = 20;


        }


//        employee e = null;         //instant we to initalize other wise it will not work
//        //e.employeeId = 100;         //memory is not allocated.
//        employee e1 = new employee();
//        e1.setValues(10, "rahul", 1245.50);
//        e1.display();

//        Student s1 = new Student();
//        s1.setStudentInformation(1, "Rav", 90, 95, 100);
//        s1.display();
//        Student s2 = new Student();
//        s2.setStudentInformation(2, "Arun", 60, 70, 80);
//        s2.display();

//        e1.employeeId = 10;
//        e1.employeeName = "Name";
//        e1.salary = 2450.50;
//        e1.display();
//
//        employee e2 = new employee();
//        e2.employeeId = 11;
//        e2.employeeName = "Name";
//        e2.salary = 2450.50;
//        e2.display();


//       String a = "Ravneet Singh";
//        for (int j = 0; j < 10; j++) {
//            System.out.println(a);
//        }
       /*
        System.out.println("Sum = " + c);
        System.out.println("Sum = " + a + b + c);
        System.out.println(a + b + c + " Sum");
        System.out.println("Multiplication: " + (float)a * (b * c));
        System.out.println("Division: " + ((a/b)/c));
        System.out.println("Mix: " + ((a + b) * (a%2) / c));
        float x = 10_1.2f;
        int d = 0b1110;  //binary
        int e = 0xff;       //hex
        int f = 077;       //octa
        System.out.println( +f);        //+x + d + e
        */


}