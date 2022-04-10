package ru.skypro;

import javax.swing.*;
import java.util.Arrays;

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


        double [] fractional = {1.57, 7.654, 9.986};
        for (double f = 0; f < fractional.length; f++) {
            if (f == fractional.length - 1)
                System.out.println(fractional [f]);
            else
                System.out.println(fractional[f] + ", ");

        }

        for (int f1 = fractional.length; f1 > 0; f1--) {
            if (f1 == fractional.length - 1)
                System.out.println(fractional[f1]);
            else
                System.out.println(fractional[f1] + ", ");


            int [] myLine = new int[4];
            myLine[0] = 6;
            myLine[1] = 8;
            myLine[2] = 10;
            myLine[3] = 12;
            for (int m = 0; m < myLine.length; m++) {
                System.out.println(myLine[m] + ", ");

                for (int m1 = myLine.length; m1 > 0; m1--) {
                    System.out.println(myLine[m1]);

                }


            }



        }




































    }
}
