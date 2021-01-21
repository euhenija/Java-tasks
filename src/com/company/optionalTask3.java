package com.company;
import java.util.Scanner;


//3.     Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

public class optionalTask3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers printout: ");
        int quantityOfNumbers = scanner.nextInt();
        System.out.println("Enter "+quantityOfNumbers+" numbers:");
        int [] array = new int [quantityOfNumbers];
        for (int i = 0; i < quantityOfNumbers; i++){
            array[i] = scanner.nextInt();
        }
        int sumLength =0;


// calculating average length
        for (int i = 0; i < quantityOfNumbers; i++) {
            int numberLength = String.valueOf(Math.abs(array[i])).length();
            sumLength += numberLength;
        }
        int averageLength = sumLength/quantityOfNumbers;
        System.out.println("Average length is; "+ averageLength);


// print numbers which length is less than average length
        for (int i = 0; i < quantityOfNumbers; i++) {
            int numberLength = String.valueOf(Math.abs(array[i])).length();
            if (numberLength < averageLength)
                System.out.println("Length of number "+ array[i]+" is " + numberLength+" what is less than average");

        }
    }
}


