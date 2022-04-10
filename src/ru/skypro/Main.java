package ru.skypro;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

         int [] numbers = new int [3];
         numbers [0] = 1;
         numbers[1] = 2;
         numbers [2] = 3;

            

        for (int i = 0; i < numbers.length; i++) {
            if (i == numbers.length - 1)
                System.out.print(numbers[i]);
            else
                System.out.print(numbers[i] + ", ");
        }

            for (int i1 = numbers.length; i1 > 0; i1--) {

                if (i1 == numbers.length - 1)

                    System.out.println(numbers[i1]);
                else
                System.out.print(numbers[i1] + ", ");

                
            }


        for (int i2 = 0; i2 < numbers.length ; i2++) {
            if (numbers[i2] % 2 != 0) {
                numbers[i2] = numbers[i2] + 1;

            } else if (numbers[i2] % 2 == 0) {
                System.out.println(numbers[i2] + ", ");
            }
        }

        
































    }
}
