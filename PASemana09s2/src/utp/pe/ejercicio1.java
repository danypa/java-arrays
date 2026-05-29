package utp.pe;

public class ejercicio1 {

	public static void main(String[] args) {
		// Datos generales inicializados
        String tienda = "DELTRON SAC";
        String ruc = "20112255115";
        String ciudad = "Av Urugua 320";
        String cajero = "Dany";
        String cliente = "Dezain Estudio Sac";

        // Arreglos paralelos
        String[] codigos = {
            "775412852147",
            "7752563210489",
            "779625415"
        };

        String[] productos = {
            "DETERGENTE ULTRA",
            "JAM.PIZZA",
            "LECHE EN CAJA"
        };

        int[] cantidades = {6, 2, 12};

        double[] precios = {3.25, 12.90, 30.50};

        double[] importes = new double[productos.length];

        double opGravada = 0;
        double igv;
        double total;

        // Calcular importe por producto
        for (int i = 0; i < productos.length; i++) {
            importes[i] = cantidades[i] * precios[i];
            opGravada = opGravada + importes[i];
        }

        // Calcular IGV y total
        igv = opGravada * 0.18;
        total = opGravada + igv;

        // Generar reporte ASCII con StringBuilder
        StringBuilder reporte = new StringBuilder();

        reporte.append("              ").append(tienda).append("\n\n");
        reporte.append("          RUC ").append(ruc).append("\n");
        reporte.append("          ").append(ciudad).append("\n\n");

        reporte.append("CAJERO: ").append(cajero).append("\n\n");

        for (int i = 0; i < productos.length; i++) {
            reporte.append(codigos[i]).append("  ");
            reporte.append(productos[i]).append("\n");

            reporte.append("              ");
            reporte.append(cantidades[i]).append(" x ");
            reporte.append(String.format("%.2f", precios[i]));
            reporte.append("     ");
            reporte.append(String.format("%.2f", importes[i]));
            reporte.append("\n");
        }

        reporte.append("\n");
        reporte.append("OP. GRAVADA:    ").append(String.format("%.2f", opGravada)).append("\n");
        reporte.append("I.G.V 18%:      ").append(String.format("%.3f", igv)).append("\n");
        reporte.append("IMPORTE TOTAL:  ").append(String.format("%.3f", total)).append("\n");

        reporte.append("\n--------------------------------------\n");
        reporte.append("CLIENTE: ").append(cliente).append("\n");
        reporte.append("--------------------------------------\n");

        System.out.println(reporte.toString());

	}

}
