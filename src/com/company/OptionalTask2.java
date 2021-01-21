package com.company;
import java.util.Scanner;
import java.util.Arrays;

//2.Вывести числа в порядке возрастания (убывания) значений их длины.

public class OptionalTask2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers printout: ");
        int quantityOfNumbers = scanner.nextInt();
        System.out.println("Enter "+quantityOfNumbers+" numbers:");
        int [] array = new int [quantityOfNumbers];
        for (int i = 0; i < quantityOfNumbers; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration =false;
            for (int i = 1; i < quantityOfNumbers; i++) {
                int numberLength = String.valueOf(array[i]).length();
                int previousNumberLength = String.valueOf(array[i - 1]).length();
                if (numberLength < previousNumberLength){
                     int temporary = array[i];
                     array[i] = array[i - 1];
                     array[i - 1] = temporary;
                     needIteration =true;
                }
            }
        }

        System.out.println(Arrays.toString(array));










    }
}
