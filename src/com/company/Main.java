package com.company;

public class Main {

    public static void main(String[] args) {

        for(int i = 1; i < 101; i++) {
            if (i % 15 == 0) {
                System.out.println("fuzzbuzz");
            } else if (i % 5 == 0) {
                System.out.println("fuzz");
            } else if (i % 3 == 0) {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("Thank you for checking my program");

    }
}
