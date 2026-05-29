package utp.pe;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n, opcion;

        System.out.print("Ingrese la cantidad de valores: ");
        n = sc.nextInt();

        int[] arregloOriginal = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese valor " + (i + 1) + ": ");
            arregloOriginal[i] = sc.nextInt();
        }

        System.out.println("\nMENU DE COPIA");
        System.out.println("1. Copia total");
        System.out.println("2. Copia parcial");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();

        if (opcion == 1) {

            int[] arregloCopia = new int[n];

            for (int i = 0; i < n; i++) {
                arregloCopia[i] = arregloOriginal[i];
            }

            System.out.println("\nARREGLO COPIADO TOTALMENTE");
            for (int i = 0; i < n; i++) {
                System.out.println(arregloCopia[i]);
            }

        } else if (opcion == 2) {

            int inicio, fin;

            System.out.print("Ingrese posicion inicial: ");
            inicio = sc.nextInt();

            System.out.print("Ingrese posicion final: ");
            fin = sc.nextInt();

            if (inicio >= 0 && fin < n && inicio <= fin) {

                int cantidad = fin - inicio + 1;
                int[] arregloCopia = new int[cantidad];

                int j = 0;

                for (int i = inicio; i <= fin; i++) {
                    arregloCopia[j] = arregloOriginal[i];
                    j++;
                }

                System.out.println("\nARREGLO COPIADO PARCIALMENTE");
                for (int i = 0; i < cantidad; i++) {
                    System.out.println(arregloCopia[i]);
                }

            } else {
                System.out.println("Rango incorrecto.");
            }

        } else {
            System.out.println("Opcion incorrecta.");
        }

        sc.close();

	}

}
