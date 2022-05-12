package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	double a[] ={5.1, 3.7, 4.2, -3.5, 6.2, 10.3, -12, 27, 15, 21.6, 7.3, 4.8, 2.9, -6.9, 2};
	boolean isNegative = false;

	double sum = 0;
	int counter =0;
	for (double value : a) {
	    if (value < 0){
	        isNegative = true;
        }

	    if (isNegative){
	        if (value > 0){

            }
	        sum = sum + value;
	        counter++;
        }
    }
        System.out.println("Сумма всех чисел =" + sum);
        System.out.println( " Среднее арефметическое = " +   sum/counter);
    }



        }



