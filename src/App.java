import arrays.*;
import automatas.*;
import cadenasCaracteres.*;
import figuras.*;
import recursividad.*;
import secuenciasLoading.*;
import seriesCaracteres.*;
import seriesNumericas.*;
import java.util.Scanner;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.println("POLIRETOS -  GRUPO 2 - Paralelo GR2SW");
        System.out.println("Integrantes:\nChavez.Mayerli\nChuga.Juan\nFuentes.Carlos\nGamboa.Anthony\n");

        int tamanio;
        String palabra;

        SecuenciasNumericas os1 = new SecuenciasNumericas();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan

        System.out.println("Ingrese un numero");
        int tamanoS6 = scanner.nextInt();
        os1.g2_ejercicioS6(tamanoS6); //Anthony Gamboa
        scanner.nextLine();

        System.out.println("Ingrese un numero: ");
        int tamanoS8 = scanner.nextInt();
        os1.g2_ejercioS8(tamanoS8); //Anthony Gamboa
        scanner.nextLine();

        System.out.println("Ingrese un numero: ");
        int tamanoS12 = scanner.nextInt();
        os1.g2_ejercicioS12(tamanoS12); //Anthony Gamboa
        scanner.nextLine(); 

        SecuenciasCaracteres os2 = new SecuenciasCaracteres();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan

        System.out.println("Ingrese un numero: ");
        int tamanoS = scanner.nextInt();
        os2.g2_serieDesignos(tamanoS); //Anthony Gamboa
        scanner.nextLine(); 

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan

        System.out.println("Ingrese un numero");
        int tamanoCara = scanner.nextInt();
        os2.g2_serieDeAbecedario(tamanoCara); //Anthony Gamboa
        scanner.nextLine();

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan


        Figuras os3 = new Figuras();
        System.out.println("Ingrese el tamaño: ");
        int tamanoCuadrado = scanner.nextInt();
        os3.g2_imprimirCuadrado(tamanoCuadrado); //Anthony Gamboa
        scanner.nextLine(); 

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura3(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();

        System.out.println("Ingrese el tamaño: ");
        int tamanoRombo = scanner.nextInt();
        os3.g2_imprimirRombo(tamanoRombo); //Anthony Gamboa
        scanner.nextLine();

        System.out.println("Ingrese el tamaño: ");
        int tamanoEscaleras = scanner.nextInt();
        os3.g2_imprimirEscaleras(tamanoEscaleras); //Anthony Gamboa
        scanner.nextLine(); 

        os3.g2_crearFigura10(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura15(tamanio); //Chugá Juan

        System.out.println("Ingrese el tamaño: "); 
        int tamanoCruz = scanner.nextInt();
        os3.g2_imprimirCruz(tamanoCruz); //Anthony Gamboa
        scanner.nextLine(); 

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura17(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura18(tamanio); //Chugá Juan
        scanner.nextLine();

        System.out.println("Ingrese el tamaño: ");
        int tamanoRNA = scanner.nextInt();
        os3.g2_imprimirRNA(tamanoRNA); //Anthony Gamboa
        scanner.nextLine();

        CadenasCaracteres os4 = new CadenasCaracteres();
        System.out.println("Ingrese una frase: ");
        scanner.nextLine(); 
        String frase12 = scanner.nextLine();
        int vocalCont = os4.g2_vocalCont(frase12);
        System.out.println("La frase tiene " + vocalCont + " vocales"); //Anthony Gamboa

        
        System.out.print("Ingrese una frase de su preferencia: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); 
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan
        System.out.print("Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray();
        os4.g2_crearCadenaChar5(linea); //Chugá Juan

        System.out.println("Ingrese una frase: ");
        String fraseC = scanner.nextLine();
        os4.g2_convertirFrase(fraseC); //Anthony Gamboa

        LoadingSecuences os5 = new LoadingSecuences();
        os5.g2_crearLoadingSecuence1(); //Chugá Juan

        System.out.println("Ingrese un caracter: ");
        char caracterP = scanner.next().charAt(0);
        os5.g2_barraPorc(caracterP, 20);
        scanner.nextLine();  //Anthony Gamboa

        System.out.println("Ingrese la duracion: ");
        int duracion = scanner.nextInt();
        os5.g2_waiting(duracion); //Anthony Gamboa
        scanner.nextLine(); 

        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        os5.g2_crearLoadingSecuence11();//Chugá Juan

        System.out.println("Ingrese la duracion: ");
        int duracion1 = scanner.nextInt();
        os5.g2_animacionFigura(duracion1); //Anthony Gamboa
        scanner.nextLine();

        int numBar = 10;
        os5.g2_ondasMusica(numBar); //Anthony Gamboa

        Recursivo os6 = new Recursivo();
        System.out.println("Ingrese un numero: ");
        int a = scanner.nextInt();
        System.out.println("Ingrese un numero: ");
        int b = scanner.nextInt();
        int resultado = os6.g2_sumas(a, b);
        System.out.println("La suma es: " + resultado); //Anthony Gamboa
        scanner.nextLine(); 

        
        System.out.print("Ingrese el límite superior de la cuenta: ");
        int limite_superior = scanner.nextInt();
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan
        scanner.nextLine();

        System.out.println("Ingrese un numero: ");
        int cont = scanner.nextInt();
        os6.g2_contador(cont);
        System.out.println(); //Anthony Gamboa
        scanner.nextLine(); 


        
        Automatas os7 = new Automatas();
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        
        System.out.println("Ingrese una contraseña:");//ANTHONY GAMBOA
        String contraseña = scanner.nextLine();
        int resultado1 = os7.g2_validarContraseña(contraseña);
        if (resultado1 == 1) {
            System.out.println("Su contraseña es válida");
        } else {
            System.out.println("Su contraseña no es válida");
        }

        os7.g2_imprimirAutomata2(scanner);//Anthony Gamboa
        scanner.nextLine();
       


        Arreglos os8 = new Arreglos();
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine(); 
        os8.g2_nombresX(nombre, apellido); //Anthony Gamboa

        
        System.out.print("Ingrese su nombre completo(con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan
        
    }
}
