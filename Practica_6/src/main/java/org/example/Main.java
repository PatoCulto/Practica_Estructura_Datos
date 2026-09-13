import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int[] aVehiculo = new int[12];
        int[] aTiempo = new int[12];
        int mejorVehiculo = 0;
        int mejorTiempo = 0;

        for(int f = 0; f < 12; f++) {
            System.out.println("Ingrese el numero de vehiculo");
            aVehiculo[f] = entrada.nextInt();
            System.out.println("Ingrese el tiempo en segundos");
            aTiempo[f] = entrada.nextInt();
            switch (f) {
                case 0:
                    mejorVehiculo = aVehiculo[f];
                    mejorTiempo = aTiempo[f];
                    break;
                case 1:
                    if (aTiempo[f] < mejorTiempo) {
                        mejorTiempo = aTiempo[f];
                        mejorVehiculo = aVehiculo[f];
                    }
                break;
            }
        }
        System.out.println("el corredor mas rapido es:");
        System.out.println("Vehiculo: " + mejorVehiculo + " Tiempo: " + mejorTiempo);
    }
        }