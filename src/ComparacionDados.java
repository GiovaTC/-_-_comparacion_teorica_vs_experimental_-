/*ste documento presenta una comparación teórica y experimental aplicada al
lanzamiento de dados, con fundamento matemático, interpretación numérica
y código Java ejecutable para su validación empírica.*/

import java.util.Random;

public class ComparacionDados {
    public static void main(String[] args) {

        int lanzamientos = 10000;
        double probTeorica = 1.0 / 6.0;

        int[] frecuencia = new int[6];
        Random random = new Random();

        // simulacion experimental .
        for (int i = 0; i < lanzamientos; i++) {
            int resultado = random.nextInt(6); // valores de 0 a 5 . . /
            frecuencia[resultado]++;
        }

        //  Resultados .
        System.out.println("=== COMPARACION TEORICA VS EXPERIMENTAL===");
        System.out.println("Lanzamientos: " + lanzamientos);
        System.out.println("Probabilidad teorica: " + probTeorica);
        System.out.println();

        System.out.printf("%-6s %-12s %-15s %-12s%n" ,
                "Cara", "Frecuencia", "P Experimental", "Error");

        for (int i = 0; i < 6; i++) {
            double pExperimental = (double) frecuencia[i] / lanzamientos;
            double error = Math.abs(pExperimental - probTeorica);

            System.out.printf("%-6d %-12d %-15.6f %-12.6f%n",
                    (i + 1),
                    frecuencia[i],
                    pExperimental,
                    error); 
        }
    }
}