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

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}