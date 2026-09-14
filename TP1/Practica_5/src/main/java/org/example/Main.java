import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //Datos Variables.
        String[][] aCliente = new String[5][4];
        String[] aInternet = new String[4];
        int[] aPrecio = new int[4];
        String Opcion;

        //Datos fijos
        aInternet[1] = ("30 Megas");
        aInternet[2] = ("50 Megas");
        aInternet[3] = ("100 Megas");
        aPrecio[1] = 750;
        aPrecio[2] = 1100;
        aPrecio[3] = (int) (1500 * 0.95);

        System.out.println("==== Sistema de servicio de internet ====");
        for (int f = 0; f < 5; f++) {

                System.out.println("Por favor, ingrese su DNI");
                aCliente[f][1] = entrada.next();
                System.out.println("Por favor, ingrese su nombre");
                aCliente[f][2] = entrada.next();
                System.out.println("Ingrese el numero del servicio que desea contratar");
                System.out.println("1 : 30 Megas por $750");
                System.out.println("2 : 50 Megas por $1100");
                System.out.println("3 : 100 Megas por $1500 (-5% de promocion)");
                Opcion = entrada.next();
                aCliente[f][3] = Opcion;
                System.out.println("Gracias");
                System.out.println("=====Siguiente==========");

        }
        for (int f = 0; f < 5; f++) {
                System.out.println("El cliente " +  aCliente[f][2] + " de DNI: " + aCliente[f][1]);
                System.out.println("Contrato" + aInternet[Integer.parseInt(aCliente[f][3])] + " a precio: $" + aPrecio[Integer.parseInt(aCliente[f][3])]);
                System.out.println("=====================");


        }



    }
}