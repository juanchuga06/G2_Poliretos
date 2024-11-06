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
        Scanner leer = new Scanner(System.in);
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
       rango= validadores.validarIngresoEnteros(leer);
       os1.g2_crearSerienumericaS2(rango);
       System.out.println(" ");

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan

        System.out.println("" + "S4: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango= validadores.validarIngresoEnteros(leer);
        os1.g2_crearSerienumericaS4(rango); //Secuencia 4
        System.out.println(" ");

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "S9: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango= validadores.validarIngresoEnteros(leer);//Secuencia 9
        os1.g2_crearSerienumericaS9(rango);


        SecuenciasCaracteres os2 = new SecuenciasCaracteres(); //caracteres
        System.out.println(" ");
       System.out.println(">---------- Serie de caracteres ----------<");
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt(); // caracter1
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan

        System.out.println("" + "S3:");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        valor= validadores.validarIngresoEnteros(leer); //caracter3
        os2.g2_crearSeriecaractereS3(valor);

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();// caracter 5
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();// caracter 7
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan

        System.out.println(" ");
       System.out.println( "" + "S8: ");
       System.out.print("Ingrese el rango de la operacion a realizar: ");
       valor= validadores.validarIngresoEnteros(leer); //Caracter 8
       os2.g2_crearSeriecaractereS8(valor);

        Figuras os3 = new Figuras();

        System.out.println(" ");
       System.out.print(">---------- Figuras ----------<");

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt();//caracter 3
        os3.g2_crearFigura3(tamanio); //Chugá Juan

        System.out.println( "" + "F5:");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= validadores.validarIngresoEnteros(leer);// caracter 5
        os3.g2_crearFigurasF5(tamanio);

        System.out.println(" ");
       System.out.println( "" + "F7: ");
       System.out.print("Ingrese el tamanio de la figura: ");
       tamanio= validadores.validarIngresoEnteros(leer);// caracter 7
       os3.g2_crearFigurasF7(tamanio);

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = scanner.nextInt(); //caracter 10
        os3.g2_crearFigura10(tamanio); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "F12: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= validadores.validarIngresoEnteros(leer);// figura 12
        os3.g2_crearFigurasF12(tamanio);

        System.out.println(" ");
        System.out.println("F13: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= validadores.validarIngresoEnteros(leer);
        os3.g2_crearFigurasF13(tamanio);
         leer.nextLine();

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
       System.out.print(">---------- Cadenas de caracteres ----------<");
        System.out.print("Ingrese una frase de su preferencia: ");
        String frase = scanner.nextLine();

        System.out.println(" " +"C02:");
        System.out.print("Introduce una frase: ");
        frase= leer.nextLine(); //caracteres2
        os4.g2_crearCadenaCaracteresC02(frase);

        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); //caracter 3
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan

        System.out.print("Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray(); //caracter 5
        os4.g2_crearCadenaChar5(linea); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "C06: ");
        System.out.print("Introduce una frase: ");//caracteres 6
        frase= leer.nextLine();
        os4.g2_crearCadenaCaracteresC06(frase);

        System.out.println(" ");
        System.out.println("" + "C07: ");
        System.out.print("Introduce una frase: ");// caracteres7
        frase= leer.nextLine();
        os4.g2_crearCadenaCaracteresC07(frase);


        LoadingSecuences os5 = new LoadingSecuences();//loding 
        System.out.println(" ");
        System.out.print(">---------- Loading ----------<");
        os5.g2_crearLoadingSecuence1(); //Chugá Juan

        System.out.println(" " + "L03:");
        System.out.println(" ");
        System.out.print("Introduce el carácter para la barra de carga: ");//loading3
        caracter =validadores.validarIngresoCaracteres(leer);
        os5.g2_crearLoadingL03(caracter);

        System.out.println(" ");
        System.out.println("" + "L05: ");//loading 5
        os5.g2_crearLoadingL05();
        leer.nextLine();

        os5.g2_crearLoadingSecuence7(); //Chugá Juan

        leer.nextLine();
        System.out.println(" ");
        System.out.println(" " + "L08: ");
        System.out.print("Ingrese su nombre y apellido: ");
        digito = leer.nextLine().replace(" ", "");//loading8
        os5.g2_crearLoadingL08(digito);

        os5.g2_crearLoadingSecuence11();//Chugá Juan


        Recursivo os6 = new Recursivo();
        System.out.println(" ");
        System.out.println(">----------- Recursion ----------<");

        System.out.println(" " + "R01:");
        System.out.print("Ingrese el numero que desea conocer su factorial: ");
        datos = validadores.validarIngresoEnteros(leer); // loading1
        int factorial = os6.g2_crearRecursionR01(datos);
        System.out.print("El factorial del numero es: " + factorial);

        System.out.println(" ");
        System.out.println(" " + "R04: ");
        System.out.print("Ingrese la base de la potencia: ");
        base = validadores.validarIngresoEnteros(leer);
        System.out.print("Ingrese el exponenete de la potencia: ");
        potencia = validadores.validarIngresoEnteros(leer);
        int resultado = os6.g2_crearRecursionR04(base, potencia);
        System.out.print("La potencia del numero ingresado es: " + resultado);
        System.out.println(" ");
        leer.nextLine();

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
        entrada = leer.nextLine().trim();
        os7.g2_crearAutomataA04(entrada);

        System.out.println("" + "A05:");
        System.out.print("Ingrese el nombre de una variable: ");
        entrada2 = leer.nextLine();
        os7.g2_crearAutomataA05(entrada2);

        Arreglos os8 = new Arreglos();

        System.out.println(" ");
        System.out.println(">------------ Arrays ----------<");
        System.out.println("" + "A03:");
        System.out.print("Introduca su nombre: ");
        nombre= leer.nextLine();
        os8.g2_crearArraysA03(nombre);

        System.out.print("Ingrese su nombre completo(con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan
        
    }
}
