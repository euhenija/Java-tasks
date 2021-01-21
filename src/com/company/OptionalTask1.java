package com.company;

import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {

        int maxLength = 0;
        int minLength = 11;
        int maxLengthNumber = 0;
        int minLengthNumber = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("How many  numbers printout: ");
        int num_elements = scanner.nextInt();
        System.out.println("Enter "+num_elements+" numbers:");
        for (int i = 0; i < num_elements; i++)
        {
           int number = scanner.nextInt();
           int numberLength = String.valueOf(number).length();
           if (numberLength > maxLength) {
               maxLength = numberLength;
               maxLengthNumber = number;}
           if (numberLength <= minLength){
              minLength = numberLength;
              minLengthNumber = number;
           }

        }
        System.out.println("Longest  number is "+ maxLengthNumber+"; its length is "+ maxLength);
        System.out.println("Shortest number is "+ minLengthNumber+"; its length is "+ minLength );
        }

    }

