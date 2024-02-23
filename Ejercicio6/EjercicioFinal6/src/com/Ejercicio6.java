package com;

import java.util.Scanner;


public class Ejercicio6 {
	public static void main(String[] args) {
		//Scan  para obtener un dato de entrada por el usuario
		Scanner myScan = new Scanner(System.in);
		System.out.println("Ingresa una palabra o parrafo:");
		
		String original = myScan.nextLine();
		myScan.close();
		//variable String 	
		String reversa = "";
		
		//Convertir  string original a un array de caracteres
		char[] charArray = original.toCharArray();
		
		
		//Se va iterando de reversa para inprimir la palabra al reves
		for (int i=charArray.length-1; i>=0; i--) {
			System.out.print(charArray[i]);
		}
		System.out.println(reversa);
	}

}