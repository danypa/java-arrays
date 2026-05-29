package utp.pe;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        int[] lista1 = new int[5];
	        int[] lista2 = new int[5];

	        int i = 0;
	        int suma1 = 0;
	        int suma2 = 0;
	        int mayor1 = 0;
	        int mayor2 = 0;

	        System.out.println("INGRESO DE DATOS DE LA LISTA 1");

	        while (i < 5) {
	            System.out.print("Ingrese valor " + (i + 1) + " de la lista 1: ");
	            lista1[i] = sc.nextInt();

	            suma1 = suma1 + lista1[i];

	            if (i == 0) {
	                mayor1 = lista1[i];
	            } else {
	                if (lista1[i] > mayor1) {
	                    mayor1 = lista1[i];
	                }
	            }

	            i++;
	        }

	        i = 0;

	        System.out.println("\nINGRESO DE DATOS DE LA LISTA 2");

	        while (i < 5) {
	            System.out.print("Ingrese valor " + (i + 1) + " de la lista 2: ");
	            lista2[i] = sc.nextInt();

	            suma2 = suma2 + lista2[i];

	            if (i == 0) {
	                mayor2 = lista2[i];
	            } else {
	                if (lista2[i] > mayor2) {
	                    mayor2 = lista2[i];
	                }
	            }

	            i++;
	        }

	        double promedio1 = suma1 / 5.0;
	        double promedio2 = suma2 / 5.0;

	        System.out.println("\n========== RESULTADOS ==========");

	        if (suma1 > suma2) {
	            System.out.println("Lista 1 mayor");
	        } else {
	            if (suma2 > suma1) {
	                System.out.println("Lista 2 mayor");
	            } else {
	                System.out.println("Listas iguales");
	            }
	        }

	        System.out.println("Promedio de la lista 1: " + promedio1);
	        System.out.println("Promedio de la lista 2: " + promedio2);

	        System.out.println("Mayor valor de la lista 1: " + mayor1);
	        System.out.println("Mayor valor de la lista 2: " + mayor2);

	        sc.close();
	}

}
