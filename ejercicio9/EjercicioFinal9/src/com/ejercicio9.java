package com;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    HashMap<String, String> dictionary = new HashMap<>();

	    dictionary.put("correr", "Run");
	    dictionary.put("hablar", "Talk");
	    dictionary.put("computadora", "Computer");
	    dictionary.put("escuela", "School");
	    dictionary.put("perro", "Dog");
	    dictionary.put("gato", "Cat");
	    dictionary.put("mesa", "Table");
	    dictionary.put("codigo", "Code");
	    dictionary.put("juguete", "Toy");
	    dictionary.put("libro", "Book");
	    dictionary.put("ventana", "Window");

	    dictionary.put("mano", "Hand");
	    dictionary.put("cabeza", "Head");
	    dictionary.put("palomitas", "Popcorn");
	    dictionary.put("impresora", "Printer");
	    dictionary.put("carro", "Car");
	    dictionary.put("silla", "Chair");
	    dictionary.put("tarjeta", "Card");
	    dictionary.put("mama", "Mom");
	    dictionary.put("papa", "Dad");
	    dictionary.put("tenedor", "Fork");
	    dictionary.put("tio", "Uncle");

	    System.out.println("Bienvenido a tu traductor automatico");
	    System.out.println("Ingresa una palabra en espanol: ");
	    String wordSpanish = in.nextLine();
	    System.out.println(
	      dictionary.containsKey(wordSpanish.toLowerCase())
	        ? dictionary.get(wordSpanish.toLowerCase())
	        : "La palabra no se encuentra en el diccionario."
	    );
	    in.close();
	  }
	}
	package com.generation;

	import java.util.HashMap;
	import java.util.Scanner;

	public class Dictionary {

	  public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    HashMap<String, String> dictionary = new HashMap<>();

	    dictionary.put("correr", "Run");
	    dictionary.put("hablar", "Talk");
	    dictionary.put("computadora", "Computer");
	    dictionary.put("escuela", "School");
	    dictionary.put("perro", "Dog");
	    dictionary.put("gato", "Cat");
	    dictionary.put("mesa", "Table");
	    dictionary.put("codigo", "Code");
	    dictionary.put("juguete", "Toy");
	    dictionary.put("libro", "Book");
	    dictionary.put("ventana", "Window");

	    dictionary.put("mano", "Hand");
	    dictionary.put("cabeza", "Head");
	    dictionary.put("palomitas", "Popcorn");
	    dictionary.put("impresora", "Printer");
	    dictionary.put("carro", "Car");
	    dictionary.put("silla", "Chair");
	    dictionary.put("tarjeta", "Card");
	    dictionary.put("mama", "Mom");
	    dictionary.put("papa", "Dad");
	    dictionary.put("tenedor", "Fork");
	    dictionary.put("tio", "Uncle");

	    System.out.println("Bienvenido a tu traductor automatico");
	    System.out.println("Ingresa una palabra en espanol: ");
	    String wordSpanish = in.nextLine();
	    System.out.println(
	      dictionary.containsKey(wordSpanish.toLowerCase())
	        ? dictionary.get(wordSpanish.toLowerCase())
	        : "La palabra no se encuentra en el diccionario."
	    );
	    in.close();
	  }
	}