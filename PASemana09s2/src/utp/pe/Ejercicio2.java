package utp.pe;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n, opcion;

        System.out.print("Ingrese la cantidad de datos reales: ");
        n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese numero " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\nMENU DE ORDENAMIENTO");
        System.out.println("1. Ordenar ascendente");
        System.out.println("2. Ordenar descendente");
        System.out.print("Ingrese una opcion: ");
        opcion = sc.nextInt();

        // Ordenamiento burbuja usando solo arreglos
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (opcion == 1) {
                    if (numeros[j] > numeros[j + 1]) {
                        double aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                } else if (opcion == 2) {
                    if (numeros[j] < numeros[j + 1]) {
                        double aux = numeros[j];
                        numeros[j] = numeros[j + 1];
                        numeros[j + 1] = aux;
                    }
                }
            }
        }

        System.out.println("\nARREGLO RESULTANTE");
        for (int i = 0; i < n; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();

	}

}
