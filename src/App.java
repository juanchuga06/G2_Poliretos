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

        int tamanio, numA, numB;
        char caracterCf;
        String palabra;
        char letraAEliminar;
        double porcent1, porcent2, porcent3, porcent4;
        System.out.println("----------------Ejercicios de las series numericas-----------------");//Fuentes Carlos
        SecuenciasNumericas os1 = new SecuenciasNumericas();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum1(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum3(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum5(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum7(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os1.g2_crearSerieNum10(tamanio); //Fuentes Carlos


        System.out.println();
        System.out.println("----------------Ejercicios de la serie de caracteres-----------------");
        SecuenciasCaracteres os2 = new SecuenciasCaracteres();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar1(tamanio); //Chugá Juan
        System.out.print("Ingrese el caracter para la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar2(tamanio, caracterCf); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar5(tamanio); //Chugá Juan
        System.out.print("Ingrese la letra que finalizara la serie: ");
        caracterCf = Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar6(caracterCf); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os2.g2_crearSerieChar7(tamanio); //Chugá Juan
        System.out.print("Ingrese la letra que finalizara la serie: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);
        os2.g2_crearSerieChar10(caracterCf);


        System.out.println("----------------Ejercicios de la serie de figuras------------------");
        Figuras os3 = new Figuras();
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura2(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura3(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura4(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura9(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura10(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura11(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura14(tamanio); //Fuentes Carlos
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura15(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura17(tamanio); //Chugá Juan
        System.out.print("Ingrese el tamanio de la serie: ");
        tamanio = Validadores.validarIngresoEnteros(scanner);
        os3.g2_crearFigura18(tamanio); //Chugá Juan
        scanner.nextLine();
        
        System.out.println("----------------Ejercicios de cadenas de caracteres------------------");

        CadenasCaracteres os4 = new CadenasCaracteres();

        System.out.print("Ingrese una frase de su preferencia: ");
        String frase = scanner.nextLine();
        System.out.print("Ingrese una vocal (a,e,i,o,u): ");
        char vocal = (scanner.nextLine().toLowerCase().charAt(0)); 
        os4.g2_crearCadenaChar3(frase, vocal); //Chugá Juan

        System.out.println("C04: ");
        System.out.println("Ingresa una frase:");
        frase = scanner.nextLine();
        System.out.println("Ingresa una letra a eliminar:");
        letraAEliminar = Validadores.validarIngresoLetra(scanner);
        os4.g2_crearCadenaChar4(frase, letraAEliminar);
        System.out.println("");

        System.out.print("Ingrese una frase de su preferencia: ");
        char linea [] = scanner.nextLine().toCharArray();
        os4.g2_crearCadenaChar5(linea); //Chugá Juan
        
        //anagrama de palabras Fuentes Carlos
        os4.g2_crearCadenaChar8();

        System.out.println("----------------Ejercicios de Loading------------------");
        LoadingSecuences os5 = new LoadingSecuences();
        os5.g2_crearLoadingSecuence1(); //Chugá Juan
        os5.g2_crearLoadingSecuence6(); //Fuentes Carlos
        os5.g2_crearLoadingSecuence7(); //Chugá Juan
        System.out.println("Ingrese su nombre y Apellido:");
        String nombre = scanner.nextLine();
        os5.g2_crearLoadingSecuence9(nombre); //Fuentes Carlos
        os5.g2_crearLoadingSecuence10();//Fuentes Carlos
        os5.g2_crearLoadingSecuence11();//Chugá Juan



        System.out.println("----------------Ejercicios de Recursividad------------------");
        Recursivo os6 = new Recursivo();
        System.out.print("Ingrese el primer numero a multiplicar: ");
        numA = scanner.nextInt();
        System.out.print("Ingrese el segundo numero a multiplicar: ");
        numB = scanner.nextInt();
        os6.g2_crearRecursion3(numA,numB); //Fuentes Carlos
        System.out.print("Ingrese el límite superior de la cuenta: ");
        int limite_superior = scanner.nextInt();
        os6.g2_crearRecursion5(0, limite_superior); //Chugá Juan
        scanner.nextLine();
        
        System.out.println("----------------Ejercicios de Automatas------------------");
        Automatas os7 = new Automatas();
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine(); 
        os7.g2_crearAutomata1(palabra); //Chugá Juan
        System.out.print("Ingrese su palabra: ");
        palabra = scanner.nextLine();
        os7.g2_crearAutomata3(palabra); //Chugá Juan

        System.out.println("----------------Ejercicios de Arrays------------------");
        Arreglos os8 = new Arreglos();
        System.out.println("Ingrese 4 porcentajes: ");
        porcent1 = Validadores.validarIngresoDouble(scanner);
        porcent2 = Validadores.validarIngresoDouble(scanner);
        porcent3 = Validadores.validarIngresoDouble(scanner);
        porcent4 = Validadores.validarIngresoDouble(scanner);
        os8.g2_crearArreglo1(porcent1, porcent2, porcent3, porcent4); //Fuentes Carlos
        System.out.println("Ingrese el tamaño para las iniciales: ");
        tamanio = Validadores.validarIngresoEnteros(scanner); 
        System.out.println("Ingrese el caracter con el que se dibujaran las iniciales: ");
        caracterCf=Validadores.validarIngresoCaracteres(scanner);  //Fuentes Carlos
        os8.g2_crearArreglo2(tamanio, caracterCf);
        System.out.print("Ingrese su nombre completo(con espacios): ");
        frase = scanner.nextLine();
        os8.g2_crearArreglo5(frase); //Chugá Juan
        
    }
}
