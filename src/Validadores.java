import java.util.Scanner;
 /**
  * Clase que proporciona validaciones de ingreso de diferentes datos(int, char)
  * @author: Grupo 2
  */
public class Validadores {

    /**
     * Valida que la entrada del usuario sea un número entero.
     * @param sc: Se usa para leer el ingreso de datos del usuario.
     * @return int: Un número entero validado.
     */
    public static int validarIngresoEnteros(Scanner sc) {
        int validarIngreso;
        while (true) {
            if (sc.hasNextInt()) {
                validarIngreso = sc.nextInt();
                if (validarIngreso >= 1) {
                    break;
                } else {
                    System.out.println("Entrada inválida. Intente de nuevo");
                }
            } else {
                System.out.println("Entrada inválida. Intente de nuevo");
                sc.next();
            }
        }
        return validarIngreso;
    }

    /**
     * Valida que la entrada del usuario sea un número de tipo double.
     * @param sc: Se usa para leer el ingreso de datos del usuario.
     * @return double: Un número de tipo double validado.
     */
    public static double validarIngresoDouble(Scanner sc) {
        double validarIngreso;
        while (true) {
            if (sc.hasNextDouble()) {
                validarIngreso = sc.nextDouble();
                break;
            } else {
                System.out.println("Entrada inválida. Intente de nuevo");
                sc.next(); // Descarta la entrada no válida
            }
        }
        return validarIngreso;
    }

    /**
     * Valida que la entrada del usuario sea un solo carácter.
     * @param scanner: Se usa para leer el ingreso de datos del usuario.
     * @return char: Un carácter validado.
     */
    public static char validarIngresoCaracteres(Scanner scanner) {
        char validarIngreso;
        while (true) {
            String ingresoPalabra = scanner.next();
            if (ingresoPalabra.length() == 1) {
                validarIngreso = ingresoPalabra.charAt(0);
                break;
            } else {
                System.out.println("Entrada inválida. Intente de nuevo");
            }
        }
        return validarIngreso;
    }

    /**
     * Valida que la entrada del usuario sea una letra minúscula de a hasta z.
     * @param scanner: Se usa para leer el ingreso de datos del usuario.
     * @return char: Una letra minúscula validada.
     */
    public static char validarIngresoLetra(Scanner scanner) {
        char validarIngreso;
        while (true) {
            String ingreso = scanner.next();
            if (ingreso.length() == 1 && Character.isLowerCase(ingreso.charAt(0))) {
                validarIngreso = ingreso.charAt(0);
                break;
            } else {
                System.out.println("Entrada inválida. Intente de nuevo");
            }
        }
        return validarIngreso;
    }

    /**
     * Valida que la entrada del usuario sea una vocal minuscula
     * @param scanner: Se usa para leer el ingreso de datos del usuario.
     * @return char: Una letra minúscula validada.
     */
    public static char validarIngresoVocal(Scanner scanner) {
        char validarIngreso;
        while (true) {
            String ingreso = scanner.next();
            if (ingreso.length() == 1 && Character.isLowerCase(ingreso.charAt(0)) && ((ingreso.charAt(0)==101)
                                                                                          ||(ingreso.charAt(0)==105)
                                                                                          ||(ingreso.charAt(0)==111)
                                                                                          ||(ingreso.charAt(0)==97)
                                                                                          ||(ingreso.charAt(0)==117))) {
                validarIngreso = ingreso.charAt(0);
                break;
            } else {
                System.out.println("Entrada inválida. Intente de nuevo");
            }
        }
        return validarIngreso;
    }
}