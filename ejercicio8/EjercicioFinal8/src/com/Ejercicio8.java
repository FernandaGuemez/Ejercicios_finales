package com;

import java.math.BigInteger;
import java.util.Scanner;

public class Ejercicio8 {


	public static void main(String[] args) {
	    int[] arrayMain = new int[10];
	    int[] arrayOrder = new int[10];

	    Scanner in = new Scanner(System.in);
	  

	    for (int i = 0; i < 10; i++) {
	      System.out.println("Ingresa un numero: ");
	      arrayMain[i] = in.nextInt();
	    }
	    System.out.println("----> Numero array ingresados:");
	    printArrya(arrayMain);
	    int count = 0;
	    for (int num : arrayMain) {
	      if (isPrime(num)) {
	        arrayOrder[count] = num;
	        count++;
	      }
	    }
	    for (int num : arrayMain) {
	      if (!isPrime(num)) {
	        arrayOrder[count] = num;
	        count++;
	      }
	    }

	    System.out.println(
	      "----> Numeros array ingresados ordenados por primos primero:"
	    );
	    printArrya(arrayOrder);

	    in.close();
	  }

	  public static boolean isPrime(int num) {
	    BigInteger numBig = new BigInteger("" + num);
	    return numBig.isProbablePrime(50);
	  }

	  static void printArrya(int[] num) {
	    for (int i = 0; i < 10; i++) {
	      System.out.println(i + " - " + num[i]);
	    }
	  }
	}