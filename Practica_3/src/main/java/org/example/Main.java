import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se tienen un producto con dos vectores.
        // uno indica el precio de los productos individuales.
        // otro indica la cantidad de productos.
        Scanner entrada = new Scanner(System.in);
        float[] canitdades = new float[5];
        float[] costos = new float[5];
        int f;
        String producto = "vacio";


        System.out.println("Sistema de cajero de ferreteria.");
        // los productos tienen asignado un costo(el vector).
        // luego las cantidades vienen aparte.

        System.out.println("Ingresar un producto(ingresar 0 para cerrar la caja)");
        while (producto != 0) {

            producto = entrada.nextLine();
        }


    }
}