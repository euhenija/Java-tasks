package com.company;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {

        // Task 1

        System.out.println("TASK 1: printout username");
        Scanner in = new Scanner(System.in);
        System.out.print("Say your name: ");
        String name = in.nextLine();
        System.out.printf("Hello, %s ! \n", name);

        // Task 2
        System.out.print("TASK 2: Say something to revert: ");
        String rev = in.nextLine();
        int s = rev.length();
        for (int i=s-1; i >=0; i--) {
            System.out.print(rev.charAt(i));
        }
        System.out.print("\n");

        //Task 3
        System.out.print("TASK 3: random numbers \n");
        System.out.print("How many random numbers printout: ");
        int rnd = in.nextInt();
        System.out.print("Enter 1 to print all numbers in the same line or 2 in the next line: ");
        int view = in.nextInt();
        for (int i = 0; i < rnd; i++) {
            Random rnd1 = new Random();
            int number = rnd1.nextInt();
            switch (view){
                case 1: System.out.print(number + " ");
                    break;
                case 2: System.out.println(number + " ");
                    break;
                default: System.out.println("Way of printing out was selected incorrectly!");
                    break; }

        //if (view == 1) {
          //  for (int i = 0; i < rnd; i++) {
            //    Random rnd1 = new Random();
            //    int number = rnd1.nextInt();
            //    System.out.print(number + " ");
           // }
        //}
        //else if(view == 2) {
          //  for (int i = 0; i < rnd; i++) {
         //       Random rnd1 = new Random();
         //       int number = rnd1.nextInt();
         //       System.out.println(number + " ");
         //   }
        }
        //else System.out.println("Way of printing out was selected incorrectly!");
       // System.out.println();



        // Task 4
        System.out.println("TASK 4: enter 2 int numbers, calculate sum and printout result");
        System.out.print("Enter a: ");
        int a = in.nextInt();
        System.out.print("Enter b ");
        int b = in.nextInt();
        int c = a * b;
        System.out.printf("Result a*b = %s ! \n", c);

        //TASK 5
        System.out.println("TASK 5: enter number from 1 to 12 and get month name");
        System.out.print("Enter number from 1 to 12 to get month name: ");
        int month = in.nextInt();
        if (month >= 1 && month <= 12) {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.MONTH, month - 1);
            String g = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
            System.out.printf("Selected month is: %s  \n", g);
        }
        else System.out.println("You have selected incorrect number of month!");
        in.close();
    }
}

