package arrays;

import java.util.Scanner;

public class Arreglos {

    public void g2_crearArreglo1(double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4){ //Fuentes Carlos
        double[] porcentajes = {porcentaje1, porcentaje2, porcentaje3, porcentaje4};
        String[] nombreCompleto = {"CARLOS", "DANIEL", "FUENTES", "PROANO"};
        int barraLongitud = 15;

        for (int i = 0; i < nombreCompleto.length; i++) {
            int CargaNombreCompleto = (int) Math.ceil((nombreCompleto[i].length() * porcentajes[i]) / 100.0);
            StringBuilder barra = new StringBuilder();
            int progresoActual = (int) ((porcentajes[i] / 100.0) * barraLongitud);

            barra.append("[");
            for (int j = 0; j < barraLongitud; j++) {
                if (j < progresoActual) {
                    barra.append("=");
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] ").append(String.format("%3d", (int) porcentajes[i])).append("% ");
            barra.append(nombreCompleto[i].substring(0, CargaNombreCompleto));

            System.out.println(barra.toString());
        }
    }
    
    public void g2_crearArreglo2(int tamaño, char caracter){ //Fuentes Carlos
        System.out.println(" ");
        //mi nombre es Carlos Fuentes, por lo tanto se imprimira la C y la F
        for (int i = 0; i < tamaño; i++) {
            //imprimir "C"
            for (int j = 0; j < tamaño; j++) {
                if (j == 0 || (i == 0 && j < tamaño) || (i == tamaño - 1 && j < tamaño)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("   "); //Espaciado

            // Imprimir "F"
            for (int j = 0; j < tamaño; j++) {
                if (j == 0 || (i == 0 && j < tamaño) || (i == tamaño / 2 && j < tamaño)) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public void g2_crearArreglo3(String nombre){ //Chavez Mayerli
        System.out.println();
        int longitud = nombre.length();
        int altura= 2 * (longitud);
        for (int ejey = altura; ejey >= 0; ejey--) {
            System.out.printf("%2d |", ejey);
            for (int ejex = 0; ejex < longitud; ejex++) {
                if (2 * ejex == ejey - 2 && ejey != 0) {
                    System.out.print("  " + nombre.charAt(ejex) + "  ");
                } else  if(ejey == 0){
                        System.out.print("__");
                } 
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public void g2_crearArreglo4(String nombre, String apellido){ //Gamboa Anthony
        int length = Math.max(nombre.length(), apellido.length());

        int tamanio = 0;
                char [][] matriz = new char[tamanio][tamanio];
        for(int i = 0; i < tamanio; i ++){
            for(int j = 0; j < tamanio; j++){
                matriz[i][j] = ' ';
            }
        }

        for(int i = 0; i < nombre.length() && i < tamanio; i++){
            matriz[i][i] = nombre.charAt(i); 
        }

        for(int i = 0; i < apellido.length() && i < tamanio; i++){
            if(matriz[i][tamanio -1 -i] == ' '){
                matriz[i][tamanio - 1 - i] = apellido.charAt(i);
            }
        }

        for(int i = 0; i < tamanio ; i++){
            for(int j = 0; j < tamanio; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    
    public void g2_crearArreglo5(String nombre_completo){ //Chugá Juan
        String [] nombres = new String[4];
        Scanner scanlinea = new Scanner(nombre_completo).useDelimiter(" ");
        for(int index = 0; index < nombres.length; index++){
            nombres[index] = scanlinea.next();
        }
        int valor_maximo = nombres[0].length(), valor_minimo = 0, x, y;
        char [][] Matriz = new char[valor_maximo][valor_maximo];

        for(int index = 0; index < nombres.length; index++){
            for (int posicion = 0; posicion < nombres[index].length(); posicion++){
                x = (int)(Math.random()*(((valor_maximo-1)-valor_minimo + 1)+valor_minimo));
                y = (int)(Math.random()*(((valor_maximo-1)-valor_minimo + 1)+valor_minimo));
                if(Matriz[x][y] == '\u0000'){
                    Matriz[x][y] = nombres[index].charAt(posicion);
                }
                else{
                    Matriz[x][y] = '*';
                }
            }
        }
        for(int fila = 0; fila < Matriz.length; fila++){
            for (int columna = 0; columna < Matriz[fila].length; columna++){
                if(Matriz[fila][columna] != '\u0000'){
                    System.out.print(Matriz[fila][columna] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        scanlinea.close();
    }

}
