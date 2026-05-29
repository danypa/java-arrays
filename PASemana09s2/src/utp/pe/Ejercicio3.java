package utp.pe;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n;

        System.out.print("Ingrese la cantidad de productos: ");
        n = sc.nextInt();
        sc.nextLine();

        String[] codigos = new String[n];
        String[] productos = new String[n];
        int[] cantidades = new int[n];
        double[] precios = new double[n];
        double[] importes = new double[n];

        int contadorProductos = 0;
        int contadorMayores100 = 0;
        int acumuladorCantidad = 0;
        double acumuladorImporte = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("\nPRODUCTO " + (i + 1));

            System.out.print("Codigo: ");
            codigos[i] = sc.nextLine();

            System.out.print("Nombre del producto: ");
            productos[i] = sc.nextLine();

            System.out.print("Cantidad: ");
            cantidades[i] = sc.nextInt();

            System.out.print("Precio: ");
            precios[i] = sc.nextDouble();
            sc.nextLine();

            importes[i] = cantidades[i] * precios[i];

            contadorProductos++;
            acumuladorCantidad = acumuladorCantidad + cantidades[i];
            acumuladorImporte = acumuladorImporte + importes[i];

            if (importes[i] > 100) {
                contadorMayores100++;
            }
        }

        StringBuilder reporte = new StringBuilder();

        reporte.append("\n==============================================\n");
        reporte.append("              REPORTE DE VENTAS\n");
        reporte.append("==============================================\n");
        reporte.append("CODIGO      PRODUCTO        CANT  PRECIO  TOTAL\n");
        reporte.append("----------------------------------------------\n");

        for (int i = 0; i < n; i++) {
            reporte.append(codigos[i]).append("      ");
            reporte.append(productos[i]).append("      ");
            reporte.append(cantidades[i]).append("      ");
            reporte.append(String.format("%.2f", precios[i])).append("   ");
            reporte.append(String.format("%.2f", importes[i])).append("\n");
        }

        reporte.append("----------------------------------------------\n");
        reporte.append("Cantidad de productos registrados: ").append(contadorProductos).append("\n");
        reporte.append("Total de unidades vendidas: ").append(acumuladorCantidad).append("\n");
        reporte.append("Productos con importe mayor a 100: ").append(contadorMayores100).append("\n");
        reporte.append("Importe total acumulado: S/ ").append(String.format("%.2f", acumuladorImporte)).append("\n");
        reporte.append("==============================================\n");

        System.out.println(reporte.toString());

        sc.close();

	}

}
