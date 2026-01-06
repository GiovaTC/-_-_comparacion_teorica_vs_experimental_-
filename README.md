# -_-_comparacion_teorica_vs_experimental_- :. 
📊 Comparación Teórica vs Experimental:
  
<img width="1024" height="1024" alt="image" src="https://github.com/user-attachments/assets/dd52b91e-e0bf-4d7e-9888-5e96fc62d0c4" />  

🎲 Lanzamiento de Dados – Simulación Monte Carlo en Java:

Este documento presenta una comparación teórica y experimental aplicada al lanzamiento de dados, con fundamento matemático, interpretación numérica y código Java ejecutable para su validación empírica.

1️⃣ Modelo teórico (probabilidad ideal):

Para un dado justo de seis caras, se define el siguiente modelo probabilístico .

Espacio muestral:
  
<img width="236" height="54" alt="image" src="https://github.com/user-attachments/assets/cd5131b1-4ae2-43e0-8ab6-074a8503f691" />  

Probabilidad teórica de cada cara:
    
<img width="384" height="62" alt="image" src="https://github.com/user-attachments/assets/8a5f41aa-f000-4b34-8c4f-f1925488551c" />
​
	
Esto implica que, a largo plazo, cada cara debe aparecer aproximadamente el 16.67 % de las veces.

2️⃣ Modelo experimental (Simulación Monte Carlo):

En el enfoque experimental:

Se realizan N lanzamientos

Se contabilizan las frecuencias observadas

Se calcula la probabilidad experimental como:

		​
<img width="309" height="83" alt="image" src="https://github.com/user-attachments/assets/df688992-427a-4c8a-8192-3e149758bd97" />	  

Ley de los Grandes Números  
  
<img width="606" height="218" alt="image" src="https://github.com/user-attachments/assets/f6ccd017-1ea2-44ca-be3e-a97aabd18b03" />    

Esto garantiza la convergencia entre el modelo experimental y el modelo teórico .

3️⃣ Comparación numérica (criterio de error):

Se comparan:

Probabilidad teórica

Probabilidad experimental  

Error absoluto

<img width="311" height="62" alt="image" src="https://github.com/user-attachments/assets/12341d77-bb7d-41cd-ade5-a7554c4d7ace" />  

El error permite cuantificar la precisión del experimento.

4️⃣ Código Java
Comparación teórica vs experimental .
```
import java.util.Random;

public class ComparacionDados {

    public static void main(String[] args) {

        int lanzamientos = 10000;
        double probTeorica = 1.0 / 6.0;

        int[] frecuencia = new int[6];
        Random random = new Random();

        // Simulación experimental
        for (int i = 0; i < lanzamientos; i++) {
            int resultado = random.nextInt(6); // valores de 0 a 5
            frecuencia[resultado]++;
        }

        // Resultados
        System.out.println("=== COMPARACIÓN TEÓRICA VS EXPERIMENTAL ===");
        System.out.println("Lanzamientos: " + lanzamientos);
        System.out.println("Probabilidad teórica: " + probTeorica);
        System.out.println();

        System.out.printf("%-6s %-12s %-15s %-12s%n",
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
```
## 5️⃣ Ejemplo de salida
```
 === COMPARACIÓN TEÓRICA VS EXPERIMENTAL ===
 Lanzamientos: 10000
 Probabilidad teórica: 0.16666666666666666

 Cara   Frecuencia   P Experimental   Error
 1      1658         0.165800         0.000867
 2      1692         0.169200         0.002533
 3      1669         0.166900         0.000233
 4      1644         0.164400         0.002267
 5      1680         0.168000         0.001333
 6      1657         0.165700         0.000967
```
## 6️⃣ Interpretación académica

Las probabilidades experimentales no coinciden exactamente con las teóricas.

El error disminuye conforme aumenta el número de lanzamientos.

El experimento confirma empíricamente el modelo teórico.

El método Monte Carlo es válido para aproximar distribuciones probabilísticas.

## 7️⃣ Conclusión

* ✔️ El modelo teórico define el comportamiento ideal
* ✔️ El modelo experimental lo aproxima mediante simulación
* ✔️ La convergencia valida la teoría de la probabilidad
* ✔️ El error cuantifica la calidad del experimento .
:. . / .   
