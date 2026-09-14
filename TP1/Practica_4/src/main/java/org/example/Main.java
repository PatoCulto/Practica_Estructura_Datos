import java.util.Objects;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] aCamion = new String[31];
        String[][] aDatoCamion = new String[31][6];
        int cuentaTe = 0;
        int busca;
        int f;
        int c;
        System.out.println("Sistema de egreso de camiones");

        for (f = 1; f < 4; f++) {
            System.out.println("================ ingrese datos de camionero ============");
            for (c = 1; c < 6; c++) {

                switch (c) {
                    case 1:
                        System.out.println("ingrese la patente");
                        aDatoCamion[f][c] = entrada.nextLine();
                        break;
                        case 2:
                            System.out.println("ingrese el nombre del camionero");
                            aDatoCamion[f][c] = entrada.nextLine();
                            break;
                            case 3:
                                System.out.println("ingrese el apellido del camionero");
                                aDatoCamion[f][c] = entrada.nextLine();
                                break;
                                case 4:
                                    System.out.println("ingrese el tipo de carga (madera, yerba o te)");
                                    aDatoCamion[f][c] = entrada.nextLine();
                                    if (Objects.equals(aDatoCamion[f][c], "te")) {
                                        cuentaTe += 1;
                                    }
                                    break;
                                    case 5:
                                        System.out.println("ingrese la hora de egreso");
                                        aDatoCamion[f][c] = entrada.nextLine();
                                        break;
                }
            }
        }
        System.out.println("===== ingrese el numero de camionero que busca conocer sus datos =====");
        busca = entrada.nextInt();
        for (f = 1; f < 6; f++) {
            System.out.println(aDatoCamion[busca][f]);
        }
        System.out.println("la cantidad de camioneros que cargaron te son: " + cuentaTe);



    }
}