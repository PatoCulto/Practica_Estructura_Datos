import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float[] aNota = new float[5];
        int f;
        float mayor = 0;
        float prom = 0;
        float suma = 0;
        System.out.println("ingrese la cantidad de notas de los alumnos");
        for (f = 0; f < 5; f++) {
            System.out.println("ingrese la nota "+(f+1)+".");
            aNota[f]= entrada.nextFloat();
            suma = suma + aNota[f];
            if (aNota[f] > mayor) {
                mayor = aNota[f];

            }
        }
        prom = suma / 5;
        System.out.println("la nota mas alta fue: " + (mayor));
        System.out.println("el promedio seria: " + (prom));

        for (f = 0; f < 5; f++) {
            System.out.println(aNota[f]);
        }

    }
}
