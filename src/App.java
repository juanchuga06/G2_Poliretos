import arrays.*;
import automatas.*;
import cadenasCaracteres.*;
import figuras.*;
import java.util.Scanner;
import recursividad.*;
import secuenciasLoading.*;
import seriesCaracteres.*;
import seriesNumericas.*;

public class App {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int rango, valor, tamanio, numA, numB, datos, base, potencia, factorial;
        char caracter, caracterCf = '+', letraAEliminar;
        String digito, entrada, entrada2, palabra, frase, nombre;
        double porcent1, porcent2, porcent3, porcent4;

        System.out.println("POLIRETOS -  GRUPO 2 - Paralelo GR2SW");
        System.out.println("Integrantes:\nChavez.Mayerli\nChuga.Juan\nFuentes.Carlos\nGamboa.Anthony\n");

        SecuenciasNumericas os1 = new SecuenciasNumericas();
        System.out.println("----------------Ejercicios de las series numericas-----------------");
        
        System.out.print("S1:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum1(tamanio); //Fuentes Carlos
        System.out.println();

        System.out.print("S2:   Ingrese el tam5anio de la serie: ");
        rango= Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum2(rango); //ChavezMayerli
        System.out.println();

        System.out.print("S3:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("S4:   Ingrese el rango de la operacion a realizar: ");
        rango = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum4(rango); //ChavezMayerli
        System.out.println();

        System.out.print("S5:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("S6:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum6(tamanio); //Anthony Gamboa
        System.out.println();

        System.out.print("S7:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum7(tamanio); //Fuentes Carlos
        System.out.println();

        System.out.print("S8:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum8(tamanio); //Anthony Gamboa
        System.out.println();
        
        System.out.print("S9:   Ingrese el tamanio de la serie: ");
        rango = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum9(rango); //ChavezMayerli
        System.out.println();

        System.out.print("S10:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum10(tamanio); //Fuentes Carlos
        System.out.println();

        System.out.print("S12:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum12(tamanio); //Anthony Gamboa
        System.out.println();

        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        SecuenciasCaracteres os2 = new SecuenciasCaracteres();

        System.out.print("SC1:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("SC2:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar2(tamanio, caracterCf); //Fuentes Carlos
        System.out.println();

        System.out.print("SC3:   Ingrese el tamanio de la serie: ");
        valor= Validadores.validarIngresoEnteros(scanner); 
        os2.g2_crearSerieChar3(valor); //ChavezMayerli
        System.out.println();

        System.out.print("SC4:   Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar4(tamanio); //Anthony Gamboa 
        System.out.println();

        System.out.print("SC5:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan

        System.out.print("SC6:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar6(tamanio);
        System.out.println();

        System.out.print("SC6Repetido:  Ingrese la letra que finalizara la serie: ");
        caracterCf = Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar6Repetido(caracterCf); //Fuentes Carlos
        System.out.println();

        System.out.print("SC7:  Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("SC8:  Ingrese el tamanio de la serie: ");
        valor = Validadores.validarIngresoEnteros(scanner); 
        os2.g2_crearSerieChar8(valor); //ChavezMayerli
        System.out.println();

        System.out.print("SC9:  Ingrese la letra que finalizara la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar9(caracterCf); //Fuentes Carlos
        System.out.println();


        System.out.println("----------------Ejercicios de la serie de figuras------------------");
        Figuras os3 = new Figuras();

        System.out.print("F1:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura1(tamanio); //Anthony Gamboa 
        System.out.println();

        System.out.print("F2:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura2(tamanio); //Fuentes Carlos
        
        System.out.print("F3:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura3(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("F4:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura4(tamanio); //Fuentes Carlos

        System.out.print("F5:   Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura5(tamanio); //ChavezMayerli

        System.out.print("F6:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura6(tamanio); //Anthony Gamboa
        System.out.println();

        System.out.print("F7:   Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura7(tamanio); //ChavezMayerli
        
        System.out.print("F8:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura8(tamanio); //Anthony Gamboa
        System.out.println();

        System.out.print("F9:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura9(tamanio); //Fuentes Carlos
        System.out.println();
        
        System.out.print("F10:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura10(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("F11:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura11(tamanio); //Fuentes Carlos
        System.out.println();

        System.out.print("F12:   Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura12(tamanio); //ChavezMayerli

        System.out.print("F13:   Ingrese el tamanio de la figura: ");
        tamanio= Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura13(tamanio); //ChavezMayerli

        System.out.print("F14:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura14(tamanio); //Fuentes Carlos
        System.out.println();

        System.out.print("F15:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura15(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("F16:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura16(tamanio); //Anthony Gamboa
        System.out.println();

        System.out.print("F17:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura17(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("F18:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura18(tamanio); //Chugá Juan
        System.out.println();

        System.out.print("F19:   Ingrese el tamanio de la figura: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura19(tamanio); //Anthony Gamboa
        scanner.nextLine(); 

        System.out.println("----------------Ejercicios de cadenas de caracteres------------------");
        CadenasCaracteres os4 = new CadenasCaracteres();

        System.out.print("CC1:   Ingrese una frase de su preferencia: "); 
        String frase12 = scanner.nextLine();
        int vocalCont = os4.g2_crearCadenaChar1(frase12);
        System.out.println("La frase tiene " + vocalCont + " vocales."); //Anthony Gamboa
        System.out.println();

        System.out.print("CC2:   Ingrese una frase de su preferencia: ");
        frase = scanner.nextLine(); 
        os4.g2_crearCadenaChar2(frase); //ChavezMayerli
        System.out.println();

        System.out.print("CC3:   Ingrese una frase de su preferencia: ");
        frase = scanner.nextLine();        
        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); 
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan
        System.out.println();

        System.out.print("CC4:   Ingrese una frase de su preferencia: ");
        frase = scanner.nextLine();
        System.out.print("Ingresa una letra a eliminar: ");
        letraAEliminar = Validadores.validarIngresoLetra(scanner);
        os4.g2_crearCadenaChar4(frase, letraAEliminar);
        System.out.println("");
        scanner.nextLine();

        System.out.print("CC5:   Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray(); 
        os4.g2_crearCadenaChar5(linea); //Chugá Juan
        System.out.println();

        System.out.print("CC6:   Ingrese una frase de su preferencia: ");
        frase= scanner.nextLine();
        os4.g2_crearCadenaChar6(frase); //ChavezMayerli
        System.out.println();

        System.out.print("CC7:   Ingrese una frase de su preferencia: ");
        frase= scanner.nextLine();
        os4.g2_crearCadenaChar7(frase); //ChavezMayerli
        System.out.println();
        
        //anagrama de palabras Fuentes Carlos
        System.out.println("CC8:");
        os4.g2_crearCadenaChar8();
        System.out.println();

        System.out.print("CC9:   Ingrese una frase de su preferencia: ");
        String fraseC = scanner.nextLine();
        os4.g2_crearCadenaChar9(fraseC); //Anthony Gamboa
        System.out.println();

        System.out.println("----------------Ejercicios de Loading------------------");
        LoadingSecuences os5 = new LoadingSecuences();

        System.out.println("L1:");
        os5.g2_crearLoadingSecuence1(); //Chugá Juan

        System.out.print("L2:   Introduce el carácter para la barra de carga: ");
        char caracterP = scanner.next().charAt(0);
        os5.g2_crearLoadingSecuence2(caracterP, 20);
        scanner.nextLine();  //Anthony Gamboa
        System.out.println();

        System.out.print("L3:   Introduce el carácter para la barra de carga: ");
        caracter = Validadores.validarIngresoCaracteres(scanner);
        os5.g2_crearLoadingSecuence3(caracter); //ChavezMayerli

        System.out.print("L4: Ingrese la duracion total de espera en segundos: ");
        int duracion =  Validadores.validarIngresoEnteros(scanner);
        os5.g2_crearLoadingSecuence4(duracion); //Anthony Gamboa 
        System.out.println();

        System.out.println( "L05: ");
        os5.g2_crearLoadingSecuence5(); //ChavezMayerli

        System.out.println("L6: ");
        os5.g2_crearLoadingSecuence6(); //Fuentes Carlos
        
        System.out.println("L7: ");
        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        scanner.nextLine();

        System.out.print("L8: Ingrese su nombre y apellido (con espacios): ");
        digito = scanner.nextLine().replace(" ", "");
        os5.g2_crearLoadingSecuence8(digito); //ChavezMayerli
        System.out.println();

        System.out.print("L9: Ingrese su nombre y apellido: ");
        nombre = scanner.nextLine();
        os5.g2_crearLoadingSecuence9(nombre); //Fuentes Carlos
        System.out.println();

        System.out.println("L10:");
        os5.g2_crearLoadingSecuence10();//Fuentes Carlos
        System.out.println();

        System.out.println("L11:");
        os5.g2_crearLoadingSecuence11();//Chugá Juan
        System.out.println();

        System.out.println("L11Repetido: ");
        os5.g2_crearLoadingSecuence11REPETIDO(); //Anthony Gamboa
        System.out.println();

        System.out.print("L12: Ingrese la duracion: ");
        int duracion1 = scanner.nextInt();
        os5.g2_crearLoadingSecuence12(duracion1); //Anthony Gamboa
        System.out.println();


        System.out.println("----------------Ejercicios de Recursividad------------------");
        Recursivo os6 = new Recursivo();

        System.out.print("R1:   Ingrese el numero que desea conocer su factorial: ");
        datos = Validadores.validarIngresoEnterosYCero(scanner);
        factorial = os6.g2_crearRecursion1(datos);
        System.out.println("El factorial del numero es: " + factorial); //Chavez Mayerli
        System.out.println();

        System.out.print("R2:\nIngrese el primer sumando: ");
        int a = Validadores.validarIngresoEnterosYCero(scanner);
        System.out.print("Ingrese el segundo sumando: ");
        int b = Validadores.validarIngresoEnterosYCero(scanner);
        int resultado = os6.g2_crearRecursion2(a, b);
        System.out.println("La suma es: " + resultado); //Anthony Gamboa
        System.out.println();
 
        System.out.print("R3:\nIngrese el primer numero a multiplicar: ");
        numA =  Validadores.validarIngresoEnteros(scanner);
        System.out.print("Ingrese el segundo numero a multiplicar: ");
        numB =  Validadores.validarIngresoEnteros(scanner);
        os6.g2_crearRecursion3(numA,numB); //Fuentes Carlos
        System.out.println();

        System.out.print("R4:\nIngrese la base de la potencia: ");
        base =  Validadores.validarIngresoEnteros(scanner);
        System.out.print("Ingrese el exponenete de la potencia: ");
        potencia = Validadores.validarIngresoEnteros(scanner);;
        resultado = os6.g2_crearRecursion4(base, potencia); //Chavez Mayerli
        System.out.print("La potencia del numero ingresado es: " + resultado);
        System.out.println(" ");
        scanner.nextLine();
        System.out.println();

        System.out.print("R5:   Ingrese el limite superior de la cuenta: ");
        int limite_superior = Validadores.validarIngresoEnteros(scanner);
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan 
        System.out.println();

        System.out.print("R6: Ingrese el liimite superior de la cuenta progresiva: ");
        int cont =  Validadores.validarIngresoEnteros(scanner);
        os6.g2_crearRecursion6(cont); //Anthony Gamboa
        System.out.println();

        System.out.println("\n----------------Ejercicios de Automatas------------------");
        Automatas os7 = new Automatas();

        System.out.print("A1: Ingrese su palabra (a*b+c): ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan

        System.out.print("A2:   Ingrese una palabra con a, b, c (formato: ab+ca): ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata2(palabra); //Gamboa Anthony
        System.out.println();

        System.out.print("A3:  Ingrese su palabra (a+/b+/c+): ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        System.out.print("A3Repetido:   Ingrese su palabra (1+/0+1*): ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3REPETIDO(palabra); //Chugá Juan

        System.out.print("A4:  Ingrese un numero (Verficador de numero decimal, con punto): ");
        entrada = scanner.nextLine().trim();
        os7.g2_crearAutomata4(entrada); //Chavez Mayerli

        System.out.print("A5:   Ingrese el nombre de una variable: ");
        entrada2 = scanner.nextLine();
        os7.g2_crearAutomata5(entrada2); //Chavez Mayerli

        // // A6:

        System.out.print("A7:  Ingrese una contraseña para validar: ");//ANTHONY GAMBOA
        String contrasena = scanner.nextLine();
        os7.g2_crearAutomata7(contrasena);
        System.out.println();

        System.out.println("----------------Ejercicios de Arrays------------------");
        Arreglos os8 = new Arreglos();

        System.out.print("ARR1:  Ingrese 4 porcentajes (separados por espacios): ");
        porcent1 = Validadores.validarIngresoDouble(scanner);
        porcent2 = Validadores.validarIngresoDouble(scanner);
        porcent3 = Validadores.validarIngresoDouble(scanner);
        porcent4 = Validadores.validarIngresoDouble(scanner);
        os8.g2_crearArreglo1(porcent1, porcent2, porcent3, porcent4); //Fuentes Carlos
        System.out.println();

        System.out.print("ARR2:\nIngrese el tamanio para las iniciales: ");
        tamanio = Validadores.validarIngresoEnteros(scanner); 
        System.out.print("Ingrese el caracter con el que se dibujaran las iniciales: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);  //Fuentes Carlos
        os8.g2_crearArreglo2(tamanio, caracterCf);
        scanner.nextLine();
        System.out.println();

        System.out.print("ARR3:  Ingrese su primer nombre: ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo3(frase); //Chavez Mayerli
        System.out.println();

        System.out.print("ARR4:\nIngrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine(); 
        os8.g2_crearArreglo4(nombre, apellido); //Anthony Gamboa
        System.out.println();

        System.out.print("ARR5:  Ingrese su nombre completo (con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan 
        System.out.println();

        System.out.println("Cierre del programa!");
        scanner.close();
    }
}
