import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[][] mAsientos = new int[10][10];
        String[][] nombresReserva = new String[10][10];
        String[][] telefonosReserva = new String[10][10];

        int fila;
        int asiento;
        int opcion = -1;

        while (opcion != 0) {

            System.out.println();
            System.out.println("========== SISTEMA DE RESERVA DE CINE ==========");
            System.out.println("1 = Consultar asientos");
            System.out.println("2 = Reservar asiento");
            System.out.println("3 = Eliminar reserva");
            System.out.println("0 = Salir");
            System.out.print("Ingrese una opción: ");

            opcion = entrada.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println();
                    System.out.println("====== MAPA DE ASIENTOS ======");
                    System.out.println("0 = Disponible");
                    System.out.println("1 = Reservado");
                    System.out.println();

                    System.out.print("     ");

                    // Número de asiento
                    for (int columna = 1; columna <= 10; columna++) {
                        System.out.print(columna + "  ");
                    }

                    System.out.println();

                    for (int f = 0; f < 10; f++) {

                        System.out.print("F" + (f + 1) + "   ");

                        for (int k = 0; k < 10; k++) {
                            System.out.print(mAsientos[f][k] + "  ");
                        }

                        System.out.println();
                    }

                    break;

                case 2:
                    System.out.println();
                    System.out.println("====== RESERVAR ASIENTO ======");

                    System.out.print("Ingrese fila (1-10): ");
                    fila = entrada.nextInt();

                    System.out.print("Ingrese asiento (1-10): ");
                    asiento = entrada.nextInt();

                    // Validar posición
                    if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {

                        System.out.println("Fila o asiento inválido.");

                    } else {

                        // Convertimos de 1-10 a índices 0-9
                        int f = fila - 1;
                        int k = asiento - 1;

                        if (mAsientos[f][k] == 1) {

                            System.out.println("El asiento ya se encuentra reservado.");
                            System.out.println(
                                    "Reservado por: " + nombresReserva[f][k]
                            );

                            System.out.println(
                                    "Teléfono: " + telefonosReserva[f][k]
                            );

                        } else {

                            entrada.nextLine();

                            System.out.print("Ingrese nombre del cliente: ");
                            String nombre = entrada.nextLine();

                            System.out.print("Ingrese teléfono: ");
                            String telefono = entrada.nextLine();

                            mAsientos[f][k] = 1;
                            nombresReserva[f][k] = nombre;
                            telefonosReserva[f][k] = telefono;

                            System.out.println("Reserva realizada correctamente.");
                            System.out.println(
                                    "Asiento reservado: fila "
                                            + fila + ", asiento " + asiento
                            );
                        }
                    }

                    break;

                case 3:
                    System.out.println();
                    System.out.println("====== ELIMINAR RESERVA ======");

                    System.out.print("Ingrese fila (1-10): ");
                    fila = entrada.nextInt();

                    System.out.print("Ingrese asiento (1-10): ");
                    asiento = entrada.nextInt();

                    if (fila < 1 || fila > 10 || asiento < 1 || asiento > 10) {

                        System.out.println("Fila o asiento inválido.");

                    } else {

                        int f = fila - 1;
                        int k = asiento - 1;

                        if (mAsientos[f][k] == 0) {

                            System.out.println(
                                    "Ese asiento no tiene ninguna reserva."
                            );

                        } else {

                            System.out.println(
                                    "Se eliminará la reserva de: "
                                            + nombresReserva[f][k]
                            );

                            mAsientos[f][k] = 0;
                            nombresReserva[f][k] = null;
                            telefonosReserva[f][k] = null;

                            System.out.println(
                                    "Reserva eliminada correctamente."
                            );
                        }
                    }

                    break;

                case 0:
                    System.out.println("Sistema terminado.");
                    break;

                default:
                    System.out.println(
                            "Opción no permitida. Volviendo al inicio."
                    );
            }
        }

        entrada.close();
    }
}