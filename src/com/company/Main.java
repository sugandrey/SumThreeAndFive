package com.company;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        int sumNumbers = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sumNumbers += i;
                System.out.println("Number = " + i);
            }
                if (count == 5) {
                    //System.out.println("SumNumbers = " + sumNumbers); тот же результат
                    //System.out.println("Count = " + count); тот же результат
                    break;
                }
            }
                System.out.println("SumNumbers = " + sumNumbers);
                System.out.println("Count = " + count);
        }
    }

