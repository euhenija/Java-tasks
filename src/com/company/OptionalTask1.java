package com.company;

import java.util.Scanner;

//1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class OptionalTask1 {
    public static void main(String[] args) {

        int maxLength = 0;
        int minLength = 11;
        int maxLengthNumber = 0;
        int minLengthNumber = 0;


        Scanner scanner = new Scanner(System.in);
        System.out.print("How many  numbers printout: ");
        int amountOfNumbers = scanner.nextInt();
        System.out.println("Enter "+amountOfNumbers+" numbers:");
        for (int i = 0; i < amountOfNumbers; i++)
        {
           int number = scanner.nextInt();
           int numberLength = String.valueOf(Math.abs(number)).length();
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

