package com.company.forLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// A java program to check prime numbers
        //let x = number to check

        System.out.println("Please input the Range");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        List<Integer> primeNumbers = new ArrayList<>();
        for (int x = 2; x<=limit;x++){

        boolean isPrime = true;
            for(int factor = 2;factor <=x/2; factor++){
                if ( x % factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(x);
            }

        }
        System.out.println("Prime numbers from 1 to" + limit + "are:");
        for ( int number : primeNumbers ){
            System.out.println(number);
        }
    }
}
