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
            System.out.println("ingrese la nota del alumno  "+(f+1)+".");
            aNota[f]= entrada.nextFloat();
        }

        for (f = 0; f < 5; f++) {
            if (aNota[f] >= 6) {
                System.out.println("el alumno "+ f + " esta aprobado" + ". Nota: " + aNota[f]);
            } else {
                System.out.println("el alumno "+ f + " no esta aprobado" + "Nota: " + aNota[f]);
            }
        }


    }
}