import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int documento;
        int edad;
        char sexo;

        int totalPersonas = 0;
        int cantidadVarones = 0;
        int cantidadMujeres = 0;

        int varonesEntre16y65 = 0;

        int mayorEdad = -1;
        int documentoMayor = 0;
        char sexoMayor = ' ';

        System.out.print("Ingrese número de documento (0 para finalizar): ");
        documento = entrada.nextInt();

        while (documento != 0) {

            System.out.print("Ingrese edad: ");
            edad = entrada.nextInt();
            System.out.print("Ingrese sexo (F/M): ");
            sexo = entrada.next().charAt(0);

            totalPersonas++;

            if (sexo == 'M') {
                cantidadVarones++;
                if (edad >= 16 && edad <= 65) {
                    varonesEntre16y65++;
                }
            } else if (sexo == 'F') {
                cantidadMujeres++;
            }
            if (edad > mayorEdad) {
                mayorEdad = edad;
                documentoMayor = documento;
                sexoMayor = sexo;
            }

            System.out.println();
            System.out.print("Ingrese número de documento (0 para finalizar): ");
            documento = entrada.nextInt();
        }

        double porcentaje = 0;

        if (cantidadVarones > 0) {
            porcentaje = (double) varonesEntre16y65 / cantidadVarones * 100;
        }

        System.out.println("=== Resultados del censo =====");

        System.out.println("Cantidad total de personas: " + totalPersonas);
        System.out.println("Cantidad de varones: " + cantidadVarones);
        System.out.println("Cantidad de mujeres: " + cantidadMujeres);

        System.out.println("Porcentaje de varones entre 16 y 65 años: " + porcentaje + "%");

        if (totalPersonas > 0) {
            System.out.println("Persona de mayor edad:");
            System.out.println("Documento: " + documentoMayor);
            System.out.println("Edad: " + mayorEdad);
            System.out.println("Sexo: " + sexoMayor);
        }
    }
}