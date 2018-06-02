package com.rav;

public class employeeMangementSystem {

    // static bining, compile time polimorfism, run time, funtion overloading didn't depend upon the return time

        public static int sum(int a, int b){

            int c = a + b;
            return c;
        }

        public float sum(float a, float b){

            float d = a + b;
            return d;
        }

        public double sum(double a, double b){

            double e = a + b;
            return e;

        }
        public float sum(float a, int b){

            float f = a + b;
            return f;

        }
        public float sum(int a, float b){

            float f = a + b;
            return f;

        }
}
