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
        
        System.out.print("S1:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum1(tamanio); //Fuentes Carlos

        System.out.print("S2:   Ingrese el rango de la operacion a realizar: ");
        rango= Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum2(rango); //ChavezMayerli

        System.out.print("S3:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan

        System.out.print("S4:   Ingrese el rango de la operacion a realizar: ");
        rango = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum4(rango); //ChavezMayerli

        System.out.print("S5:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan

        System.out.print("S6:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum6(tamanio); //Anthony Gamboa        

        System.out.print("S7:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum7(tamanio); //Fuentes Carlos

        System.out.print("S8:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum8(tamanio); //Anthony Gamboa
        
        System.out.print("S9:   Ingrese el rango de la operacion a realizar: ");
        rango = Validadores.validarIngresoEnteros(scanner);//Secuencia 9
        os1.g2_crearSerieNum9(rango);

        System.out.print("S10:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum10(tamanio); //Fuentes Carlos

        System.out.print("S12:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum12(tamanio); //Anthony Gamboa

        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        SecuenciasCaracteres os2 = new SecuenciasCaracteres();

        System.out.print("SC1:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan

        System.out.print("SC2:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar2(tamanio, caracterCf); //Fuentes Carlos

        System.out.print("SC3:  Ingrese el rango de la operacion a realizar: ");
        valor= Validadores.validarIngresoEnteros(scanner); //caracter3
        os2.g2_crearSerieChar3(valor);

        System.out.print("SC4:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar4(tamanio); //Anthony Gamboa 

        System.out.print("SC5:  Ingrese el caracter para la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan

        System.out.print("SC6:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar6(tamanio); //Anthony Gamboa

        System.out.print("SC7:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan

        System.out.print("SC8:  Ingrese el rango de la operacion a realizar: ");
        valor= Validadores.validarIngresoEnteros(scanner); //Caracter 8
        os2.g2_crearSerieChar8(valor);

        System.out.print("SC9:  Ingrese la letra que finalizara la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar9(caracterCf); //Fuentes Carlos


        System.out.println("----------------Ejercicios de la serie de figuras------------------");
        Figuras os3 = new Figuras();

        System.out.print("F1:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura1(tamanio); //Anthony Gamboa 

        System.out.print("F2:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura2(tamanio); //Fuentes Carlos
        
        System.out.print("F3:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura3(tamanio); //Chugá Juan

        System.out.print("F4:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura4(tamanio); //Fuentes Carlos

        System.out.print("F5:   Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);// caracter 5
        os3.g2_crearFigura5(tamanio);

        System.out.print("F6:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura6(tamanio); //Anthony Gamboa

        System.out.print("F7:Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);// caracter 7
        os3.g2_crearFigura7(tamanio);
        
        System.out.print("F8:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura8(tamanio); //Anthony Gamboa

        System.out.print("F9:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura9(tamanio); //Fuentes Carlos
        
        System.out.print("F10:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura10(tamanio); //Chugá Juan

        System.out.print("F11:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura11(tamanio); //Fuentes Carlos

        System.out.print("F12:  Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);// figura 12
        os3.g2_crearFigura12(tamanio);

        System.out.print("F13:  Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura13(tamanio);
        scanner.nextLine();

        System.out.print("F14:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura14(tamanio); //Fuentes Carlos

        System.out.print("F15:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura15(tamanio); //Chugá Juan

        System.out.print("F16:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura16(tamanio); //Anthony Gamboa

        System.out.print("F17:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura17(tamanio); //Chugá Juan

        System.out.print("F18:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura18(tamanio); //Chugá Juan

        System.out.print("F19:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura19(tamanio); //Anthony Gamboa

        
        System.out.println("----------------Ejercicios de cadenas de caracteres------------------");
        CadenasCaracteres os4 = new CadenasCaracteres();

        System.out.print("CC1:  Ingrese una frase: "); 
        String frase12 = scanner.nextLine();
        int vocalCont = os4.g2_crearCadenaChar1(frase12);
        System.out.println("La frase tiene " + vocalCont + " vocales"); //Anthony Gamboa

        System.out.print("CC2:  Introduce una frase: ");
        frase = scanner.nextLine(); //caracteres2
        os4.g2_crearCadenaChar2(frase);

        System.out.print("CC3:  Ingrese una frase de su preferencia: ");
        frase = scanner.nextLine();        
        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); //caracter 3
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan

        System.out.print("CC4:  Ingresa una frase:");
        frase = scanner.nextLine();
        System.out.print("Ingresa una letra a eliminar:");
        letraAEliminar = Validadores.validarIngresoLetra(scanner);
        os4.g2_crearCadenaChar4(frase, letraAEliminar);
        System.out.println("");

        System.out.print("CC5:  Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray(); //caracter 5
        os4.g2_crearCadenaChar5(linea); //Chugá Juan

        System.out.print("CC6:  Introduce una frase: ");//caracteres 6
        frase= scanner.nextLine();
        os4.g2_crearCadenaChar6(frase);

        System.out.print("CC7:  Introduce una frase: ");// caracteres7
        frase= scanner.nextLine();
        os4.g2_crearCadenaChar7(frase);
        
        //anagrama de palabras Fuentes Carlos
        System.out.println("CC8:");
        os4.g2_crearCadenaChar8();

        System.out.print("CC9:  Ingrese una frase: ");
        String fraseC = scanner.nextLine();
        os4.g2_crearCadenaChar9(fraseC); //Anthony Gamboa

        System.out.println("----------------Ejercicios de Loading------------------");
        LoadingSecuences os5 = new LoadingSecuences();

        System.out.println("L1:");
        os5.g2_crearLoadingSecuence1(); //Chugá Juan

        System.out.println("L2:  Ingrese un caracter: ");
        char caracterP = scanner.next().charAt(0);
        os5.g2_crearLoadingSecuence2(caracterP, 20);
        scanner.nextLine();  //Anthony Gamboa


        System.out.print("L3:   Introduce el carácter para la barra de carga: ");//loading3
        caracter = Validadores.validarIngresoCaracteres(scanner);
        os5.g2_crearLoadingSecuence3(caracter);

        System.out.println("L4: Ingrese la duracion: ");
        int duracion = scanner.nextInt();
        os5.g2_crearLoadingSecuence4(duracion); //Anthony Gamboa
        scanner.nextLine(); 

        System.out.println( "L05: ");//loading 5
        os5.g2_crearLoadingSecuence5();
        scanner.nextLine();

        // L6
        
        System.out.println("L7: ");
        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        scanner.nextLine();


        System.out.print("L8: Ingrese su nombre y apellido (con espacios): ");
        digito = scanner.nextLine().replace(" ", "");//loading8
        os5.g2_crearLoadingSecuence8(digito);

        // L9:
        // L10:

        System.out.println("L11:");
        os5.g2_crearLoadingSecuence11();//Chugá Juan

        int numBar = 10;
        System.out.println("L11Repetido: ");
        os5.g2_crearLoadingSecuence11REPETIDO(numBar); //Anthony Gamboa

        System.out.println("L12: Ingrese la duracion: ");
        int duracion1 = scanner.nextInt();
        os5.g2_crearLoadingSecuence12(duracion1); //Anthony Gamboa
        scanner.nextLine();

        System.out.println("----------------Ejercicios de Recursividad------------------");
        Recursivo os6 = new Recursivo();

        System.out.print("R1:   Ingrese el numero que desea conocer su factorial: ");
        datos = Validadores.validarIngresoEnteros(scanner);
        int factorial = os6.g2_crearRecursion1(datos);
        System.out.print("El factorial del numero es: " + factorial);

        System.out.print("R2:\nIngrese el primer sumando: ");
        int a = Validadores.validarIngresoEnteros(scanner);
        System.out.print("Ingrese el segundo sumando: ");
        int b = Validadores.validarIngresoEnteros(scanner);
        int resultado = os6.g2_crearRecursion2(a, b);
        System.out.println("La suma es: " + resultado); //Anthony Gamboa
 
        // R3

        System.out.print("R4:\nIngrese la base de la potencia: ");
        base = Validadores.validarIngresoEnteros(scanner);
        System.out.print("Ingrese el exponenete de la potencia: ");
        potencia = Validadores.validarIngresoEnteros(scanner);
        resultado = os6.g2_crearRecursion4(base, potencia);
        System.out.print("La potencia del numero ingresado es: " + resultado);
        System.out.println(" ");
        scanner.nextLine();

        System.out.print("R5:   Ingrese el limite superior de la cuenta: ");
        int limite_superior = Validadores.validarIngresoEnteros(scanner);
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan 5

        System.out.println("R6: Ingrese el liimite superior de la cuenta progresiva: ");
        int cont = Validadores.validarIngresoEnteros(scanner);
        os6.g2_crearRecursion6(cont); //Anthony Gamboa


        
        System.out.println("----------------Ejercicios de Automatas------------------");
        Automatas os7 = new Automatas();

        System.out.print("A1: Ingrese su palabra (a*b+c): ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan

        System.out.println("A2:");
        os7.g2_imprimirAutomata2(scanner);//Anthony Gamboa
        scanner.nextLine();

        System.out.print("A3:  Ingrese su palabra (a+/b+/c+): ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        System.out.print("A3Repetido:   Ingrese su palabra (1+/0+1*): ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3REPETIDO(palabra); //Chugá Juan

        System.out.print("A4:  Ingrese un numero (Verficador de numero decimal): ");
        entrada = scanner.nextLine().trim();
        os7.g2_crearAutomata4(entrada);

        System.out.print("A5:   Ingrese el nombre de una variable: ");
        entrada2 = scanner.nextLine();
        os7.g2_crearAutomata5(entrada2);

        //A6:

        System.out.println("A7:\nIngrese una contraseña:");//ANTHONY GAMBOA
        String contraseña = scanner.nextLine();
        int resultado1 = os7.g2_validarContraseña(contraseña);
        if (resultado1 == 1) {
            System.out.println("Su contraseña es válida");
        } else {
            System.out.println("Su contraseña no es válida");
        }

        System.out.println("----------------Ejercicios de Arrays------------------");
        Arreglos os8 = new Arreglos();

        // Arr1
        // Arr2

        System.out.print("ARR3:  Ingrese su primer nombre: ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo3(frase);

        System.out.println("ARR4:\nIngrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido: ");
        String apellido = scanner.nextLine(); 
        os8.g2_crearArreglo4(nombre, apellido); //Anthony Gamboa

        System.out.print("ARR5:  Ingrese su nombre completo (con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan 
    }
}
