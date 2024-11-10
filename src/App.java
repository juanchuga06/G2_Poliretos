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
        int rango;
        int valor;
        int tamanio;
        int datos;
        int base;
        int potencia;
        char caracter;
        String nombre;
        String digito;
        String entrada;
        String entrada2;

        System.out.println("POLIRETOS -  GRUPO 2 - Paralelo GR2SW");
        System.out.println("Integrantes:\nChavez.Mayerli\nChuga.Juan\nFuentes.Carlos\nGamboa.Anthony\n");
        String palabra;

       SecuenciasNumericas os1 = new SecuenciasNumericas();
       System.out.println(">---------- Serie de numeros ----------<");
       System.out.println("" + "S2:");//Secuencia 2
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       rango= validadores.validarIngresoEnteros(scanner);
       os1.g2_crearSerienumerica2(rango);
       System.out.println(" ");

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan

        System.out.println("" + "S4: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango= validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerienumerica4(rango); //Secuencia 4
        System.out.println(" ");

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "S9: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango= validadores.validarIngresoEnteros(scanner);//Secuencia 9
        os1.g2_crearSerienumerica9(rango);


        SecuenciasCaracteres os2 = new SecuenciasCaracteres(); //caracteres
        System.out.println(" ");
        System.out.println(">---------- Serie de caracteres ----------<");
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt(); // caracter1
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan

        System.out.println("" + "S3:");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        valor= validadores.validarIngresoEnteros(scanner); //caracter3
        os2.g2_crearSeriecaractere3(valor);

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();// caracter 5
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();// caracter 7
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan

        System.out.println(" ");
       System.out.println( "" + "S8: ");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       valor= validadores.validarIngresoEnteros(scanner); //Caracter 8
       os2.g2_crearSeriecaractere8(valor);

        Figuras os3 = new Figuras();

        System.out.println(" ");
       System.out.println(">---------- Figuras ----------<");

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();//caracter 3
        os3.g2_crearFigura3(tamanio); //Chugá Juan

        System.out.println( "" + "F5:");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= validadores.validarIngresoEnteros(scanner);// caracter 5
        os3.g2_crearFiguras5(tamanio);

        System.out.println(" ");
       System.out.println( "" + "F7: ");
       System.out.print("Ingrese el tamanio de la figura: ");
       tamanio= validadores.validarIngresoEnteros(scanner);// caracter 7
       os3.g2_crearFiguras7(tamanio);

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt(); //caracter 10
        os3.g2_crearFigura10(tamanio); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "F12: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= validadores.validarIngresoEnteros(scanner);// figura 12
        os3.g2_crearFiguras12(tamanio);

        System.out.println(" ");
        System.out.println("F13: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFiguras13(tamanio);
         scanner.nextLine();

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt(); //caracter 15
        os3.g2_crearFigura15(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();// caracter 17
        os3.g2_crearFigura17(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt(); //frigura18
        os3.g2_crearFigura18(tamanio); //Chugá Juan
        scanner.nextLine();

        CadenasCaracteres os4 = new CadenasCaracteres();
        System.out.println(" ");
       System.out.println(">---------- Cadenas de caracteres ----------<");
        System.out.print("Ingrese una frase de su preferencia: ");
        String frase = scanner.nextLine();

        System.out.println(" " +"C02:");
        System.out.print("Introduce una frase: ");
        frase= scanner.nextLine(); //caracteres2
        os4.g2_crearCadenaCaracteres2(frase);

        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); //caracter 3
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan

        System.out.print("Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray(); //caracter 5
        os4.g2_crearCadenaChar5(linea); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "C06: ");
        System.out.print("Introduce una frase: ");//caracteres 6
        frase= scanner.nextLine();
        os4.g2_crearCadenaCaracteres6(frase);

        System.out.println(" ");
        System.out.println("" + "C07: ");
        System.out.print("Introduce una frase: ");// caracteres7
        frase= scanner.nextLine();
        os4.g2_crearCadenaCaracteres7(frase);


        LoadingSecuences os5 = new LoadingSecuences();//loding 
        System.out.println(" ");
        System.out.println(">---------- Loading ----------<");
        os5.g2_crearLoadingSecuence1(); //Chugá Juan

        System.out.println(" " + "L03:");
        System.out.println(" ");
        System.out.print("Introduce el carácter para la barra de carga: ");//loading3
        caracter =validadores.validarIngresoCaracteres(scanner);
        os5.g2_crearLoading3(caracter);

        System.out.println(" ");
        System.out.println("" + "L05: ");//loading 5
        os5.g2_crearLoading5();
        scanner.nextLine();

        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        scanner.nextLine();
        System.out.println(" ");
        System.out.println(" " + "L08: ");
        System.out.print("Ingrese su nombre y apellido: ");
        digito = scanner.nextLine().replace(" ", "");//loading8
        os5.g2_crearLoading8(digito);

        os5.g2_crearLoadingSecuence11();//Chugá Juan


        Recursivo os6 = new Recursivo();
        System.out.println(" ");
        System.out.println(">----------- Recursion ----------<");

        System.out.println(" " + "R01:");
        System.out.print("Ingrese el numero que desea conocer su factorial: ");
        datos = validadores.validarIngresoEnteros(scanner);
        int factorial = os6.g2_crearRecursion1(datos);
        System.out.print("El factorial del numero es: " + factorial);

        System.out.println(" ");
        System.out.println(" " + "R04: ");
        System.out.print("Ingrese la base de la potencia: ");
        base = validadores.validarIngresoEnteros(scanner);
        System.out.print("Ingrese el exponenete de la potencia: ");
        potencia = validadores.validarIngresoEnteros(scanner);
        int resultado = os6.g2_crearRecursion4(base, potencia);
        System.out.print("La potencia del numero ingresado es: " + resultado);
        System.out.println(" ");
        scanner.nextLine();

        System.out.print("Ingrese el límite superior de la cuenta: ");
        int limite_superior = scanner.nextInt();
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan 5
        scanner.nextLine();

        
        Automatas os7 = new Automatas();
        System.out.println(" ");
        System.out.println(">---------- Automatas ----------<");
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        System.out.println("" + "A04:");
        System.out.print("Ingrese una cifra: ");
        entrada = scanner.nextLine().trim();
        os7.g2_crearAutomata4(entrada);

        System.out.println("" + "A05:");
        System.out.print("Ingrese el nombre de una variable: ");
        entrada2 = scanner.nextLine();
        os7.g2_crearAutomata5(entrada2);

        Arreglos os8 = new Arreglos();
        System.out.println(" ");
        System.out.println(">------------ Arrays ----------<");
        System.out.println("" + "A03:");
        System.out.print("Introduca su nombre: ");
        nombre= scanner.nextLine();
        os8.g2_crearArrays3(nombre);

        System.out.print("Ingrese su nombre completo(con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan
        
    }
}
