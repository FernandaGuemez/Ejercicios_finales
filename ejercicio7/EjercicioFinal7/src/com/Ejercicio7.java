package com;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes"};
        List<String> listaSemana = Arrays.asList(dias);
        String diaSemana;
        int hora;
        int minutos;

        do {
            // Se solicita el día de la semana
        	Scanner myScanner = new Scanner(System.in);
            System.out.print("Ingresa que dia de la semana estas: ");
            diaSemana = myScanner.next().toLowerCase();
            // Se verifica la validez
            if (!listaSemana.contains(diaSemana)) {
                System.out.println("Semana NO válida, colocalo de nuevo");
                continue;
            }
            // Se pide que el usuario coloque hra
            System.out.print("Ingrese  hora (0:0 a 23:00): ");
            hora = myScanner.nextInt();
          
            if (hora < 0 || hora > 23) {
                System.out.println("Hora no válida, colocalo de nuevo");
                continue;
            }
            // Se pide que el usuario coloque min
            System.out.print("Ingrese minutos (0 a 59): ");
            minutos = myScanner.nextInt();
           
            if (minutos < 0 || minutos > 59) {
                System.out.println("Minutos no válidos, colocalo de nuevo");
                continue;
            }
            // permite calcular minutos faltantes hasta el fin de semana, y dias enteros antes del fin de semana
            
            boolean finDeSemana = false;
            int horas = 0;
            int dia = 0;
			if(diaSemana.equals("lunes") && hora <= 15) {
            	dia = 4;
            	horas = 14-hora;
            }
            else if(diaSemana.equals("lunes") && hora > 15) {
            	dia = 3;
            	horas = 24-(hora-14);
            }
            else if(diaSemana.equals("martes") && hora <= 15) {
            	dia = 3;
            	horas = 14-hora;
            }
            else if(diaSemana.equals("martes") && hora > 15) {
            	dia = 2;
            	horas = 24-(hora-14);
            }
            else if(diaSemana.equals("miercoles") && hora <= 15)  {
            	dia = 2;
            	horas = 14-hora;
            }
            else if(diaSemana.equals("miercoles") && hora > 15) {
            	dia = 1;
            	horas = 24-(hora-14);
            }
            else if(diaSemana.equals("jueves") && hora <= 15) {
            	dia = 1;
            	horas = 14-hora;
            }
            else if(diaSemana.equals("jueves") && hora > 15) {
            	dia = 0;
            	horas = 24-(hora-14);
            }
            else if(diaSemana.equals("viernes") && hora <= 15) {
            	dia = 0;
            	horas = 24-hora;
            }
            else {
            	System.out.println("Fin de semana");
            	finDeSemana = true;
            }
            if(!finDeSemana) {
            	int minutosFinDeSemana = (dia * 24 * 60) + (horas * 60) + (60-minutos); 
            System.out.printf("Faltan %d minutos para el fin de semana.\n",minutosFinDeSemana);
            }
            myScanner.close();
            break;
  
        } while (true);
	}
}