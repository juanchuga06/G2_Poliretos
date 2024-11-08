package arrays;

import java.util.Scanner;

public class Arreglos {
    Scanner leer = new Scanner(System.in);

    public void g2_crearArrays3(String nombre){ 
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
        scanlinea.close();
    }
}
