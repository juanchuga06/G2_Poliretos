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
        String digito;
        String entrada;
        String entrada2;
        String palabra;
        String frase;
        char caracterCf = '+';
        char letraAEliminar;

        System.out.println("POLIRETOS -  GRUPO 2 - Paralelo GR2SW");
        System.out.println("Integrantes:\nChavez.Mayerli\nChuga.Juan\nFuentes.Carlos\nGamboa.Anthony\n");

        SecuenciasNumericas os1 = new SecuenciasNumericas();
        System.out.println("----------------Ejercicios de las series numericas-----------------");
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum1(tamanio); //Fuentes Carlos
        System.out.println("" + "S2:");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango= Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum2(rango); //ChavezMayerli
        System.out.println(" ");
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan
        System.out.println("" + "S4: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum4(rango); //ChavezMayerli
        System.out.println(" ");
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan


        //S6
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum7(tamanio); //Fuentes Carlos

        //S8
        System.out.println(" ");
        System.out.println("" + "S9: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        rango = Validadores.validarIngresoEnteros(scanner);//Secuencia 9
        os1.g2_crearSerieNum9(rango);

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum10(tamanio); //Fuentes Carlos



        System.out.println();
        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        SecuenciasCaracteres os2 = new SecuenciasCaracteres();

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar2(tamanio, caracterCf); //Fuentes Carlos

        tamanio = Validadores.validarIngresoEnteros(scanner);
        System.out.println("" + "S3:");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        valor= Validadores.validarIngresoEnteros(scanner); //caracter3
        os2.g2_crearSerieChar3(valor);

        //S4

        System.out.print("Ingrese el caracter para la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan


        // S6

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan

        System.out.println(" ");
        System.out.println( "" + "S8: ");
        System.out.print("Ingrese el rango de la operacion a realizar: ");
        valor= Validadores.validarIngresoEnteros(scanner); //Caracter 8
        os2.g2_crearSerieChar8(valor);

        // S9

        System.out.print("Ingrese la letra que finalizara la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar9(caracterCf);


        System.out.println("----------------Ejercicios de la serie de figuras------------------");
        Figuras os3 = new Figuras();

        //F1
        
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura2(tamanio); //Fuentes Carlos
        
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura3(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura4(tamanio); //Fuentes Carlos

        System.out.println( "" + "F5:");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);// caracter 5
        os3.g2_crearFigura5(tamanio);

        // F6:

        System.out.println(" ");
        System.out.println( "" + "F7: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);// caracter 7
        os3.g2_crearFigura7(tamanio);

        // F8:

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura9(tamanio); //Fuentes Carlos
        
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura10(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura11(tamanio); //Fuentes Carlos

        System.out.println(" ");
        System.out.println("" + "F12: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);// figura 12
        os3.g2_crearFigura12(tamanio);

        System.out.println(" ");
        System.out.println("F13: ");
        System.out.print("Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura13(tamanio);
        scanner.nextLine();

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura14(tamanio); //Fuentes Carlos

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura15(tamanio); //Chugá Juan

        // F16
        
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura17(tamanio); //Chugá Juan

        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura18(tamanio); //Chugá Juan
        scanner.nextLine();
        
        System.out.println("----------------Ejercicios de cadenas de caracteres------------------");

        CadenasCaracteres os4 = new CadenasCaracteres();

        // C1

        System.out.println(" " +"C02:");
        System.out.print("Introduce una frase: ");
        frase = scanner.nextLine(); //caracteres2
        os4.g2_crearCadenaChar2(frase);

        System.out.print("Ingrese una frase de su preferencia: ");
        frase = scanner.nextLine();        
        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); //caracter 3
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan

        System.out.println("C04: ");
        System.out.println("Ingresa una frase:");
        frase = scanner.nextLine();
        System.out.println("Ingresa una letra a eliminar:");
        letraAEliminar = Validadores.validarIngresoLetra(scanner);
        os4.g2_crearCadenaChar4(frase, letraAEliminar);
        System.out.println("");

        System.out.print("Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray(); //caracter 5
        os4.g2_crearCadenaChar5(linea); //Chugá Juan

        System.out.println(" ");
        System.out.println("" + "C06: ");
        System.out.print("Introduce una frase: ");//caracteres 6
        frase= scanner.nextLine();
        os4.g2_crearCadenaChar6(frase);

        System.out.println(" ");
        System.out.println("" + "C07: ");
        System.out.print("Introduce una frase: ");// caracteres7
        frase= scanner.nextLine();
        os4.g2_crearCadenaChar7(frase);
        
        //anagrama de palabras Fuentes Carlos
        os4.g2_crearCadenaChar8();

        // C9

        System.out.println("----------------Ejercicios de Loading------------------");
        LoadingSecuences os5 = new LoadingSecuences();

        os5.g2_crearLoadingSecuence1(); //Chugá Juan

        // L2:

        System.out.println(" " + "L03:");
        System.out.println(" ");
        System.out.print("Introduce el carácter para la barra de carga: ");//loading3
        caracter = Validadores.validarIngresoCaracteres(scanner);
        os5.g2_crearLoadingSecuence3(caracter);

        // L4:

        System.out.println(" ");
        System.out.println("" + "L05: ");//loading 5
        os5.g2_crearLoadingSecuence5();
        scanner.nextLine();

        // L6
        
        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        scanner.nextLine();

        System.out.println(" ");
        System.out.println(" " + "L08: ");
        System.out.print("Ingrese su nombre y apellido: ");
        digito = scanner.nextLine().replace(" ", "");//loading8
        os5.g2_crearLoadingSecuence8(digito);

        // L9:
        // L10:

        os5.g2_crearLoadingSecuence11();//Chugá Juan

        // L11R
        // L12:


        System.out.println("----------------Ejercicios de Recursividad------------------");
        Recursivo os6 = new Recursivo();


        System.out.println(" " + "R01:");
        System.out.print("Ingrese el numero que desea conocer su factorial: ");
        datos = Validadores.validarIngresoEnteros(scanner);
        int factorial = os6.g2_crearRecursion1(datos);
        System.out.print("El factorial del numero es: " + factorial);

        // R2
        // R3

        System.out.println(" ");
        System.out.println(" " + "R04: ");
        System.out.print("Ingrese la base de la potencia: ");
        base = Validadores.validarIngresoEnteros(scanner);
        System.out.print("Ingrese el exponenete de la potencia: ");
        potencia = Validadores.validarIngresoEnteros(scanner);
        int resultado = os6.g2_crearRecursion4(base, potencia);
        System.out.print("La potencia del numero ingresado es: " + resultado);
        System.out.println(" ");
        scanner.nextLine();

        System.out.print("Ingrese el límite superior de la cuenta: ");
        int limite_superior = scanner.nextInt();
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan 5
        scanner.nextLine(); 

        // R6:

        
        System.out.println("----------------Ejercicios de Automatas------------------");
        Automatas os7 = new Automatas();

        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan
        
        // A2:


        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3REPETIDO(palabra); //Chugá Juan

        System.out.println("" + "A04:");
        System.out.print("Ingrese una cifra: ");
        entrada = scanner.nextLine().trim();
        os7.g2_crearAutomata4(entrada);

        System.out.println("" + "A05:");
        System.out.print("Ingrese el nombre de una variable: ");
        entrada2 = scanner.nextLine();
        os7.g2_crearAutomata5(entrada2);

        // A6

        // A7

        System.out.println("----------------Ejercicios de Arrays------------------");
        Arreglos os8 = new Arreglos();

        // Arr1
        // Arr2

        System.out.print("Ingrese su primer nombre: ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo3(frase);

        // Arr4

        System.out.print("Ingrese su nombre completo(con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan 
        
    }
}
