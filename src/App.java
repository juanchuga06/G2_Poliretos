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

        SecuenciasCaracteres os2 = new SecuenciasCaracteres();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan

        Figuras os3 = new Figuras();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura3(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura10(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura15(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura17(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os3.g2_crearFigura18(tamanio); //Chugá Juan
        scanner.nextLine();

        CadenasCaracteres os4 = new CadenasCaracteres();
        System.out.print("Ingrese una frase de su preferencia: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); 
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan
        System.out.print("Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray();
        os4.g2_crearCadenaChar5(linea); //Chugá Juan

        LoadingSecuences os5 = new LoadingSecuences();
        os5.g2_crearLoadingSecuence1(); //Chugá Juan
        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        os5.g2_crearLoadingSecuence11();//Chugá Juan

        Recursivo os6 = new Recursivo();
        System.out.print("Ingrese el límite superior de la cuenta: ");
        int limite_superior = scanner.nextInt();
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan
        scanner.nextLine();
        
        Automatas os7 = new Automatas();
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        Arreglos os8 = new Arreglos();
        System.out.print("Ingrese su nombre completo(con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan
        
    }
}
