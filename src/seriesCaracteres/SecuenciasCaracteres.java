package seriesCaracteres;

import java.util.Scanner;

public class SecuenciasCaracteres {
    Scanner leer = new Scanner(System.in);

    public void g2_crearSerieChar1(int tamanio){ //Chugá Juan
        char [] caracteres = {'+', '-'};
        int index;
        for(int posicion = 0; posicion < tamanio; posicion++) 
        {
            index = posicion % 2;
            System.err.print(caracteres[index] + " ");
        }
        System.out.println();
    }

    public void g2_crearSeriecaractere3(int valor){ //Mayerli Chavez
        System.out.println("");
        System.out.println("La operacion es: ");
        for (int i = 2; i <= valor; i++) {
            int contador = 2;
            boolean primo= true;
            while(primo && contador < i){
                if((i % contador) == 0){
                    primo = false;
                }
                else{
                    contador ++;
                }
            }
            if (primo){
                int indicedelmas = 1;
                while (indicedelmas <= i){
                    System.out.print("+");
                    indicedelmas ++;
                }
                System.out.print("  ");
            }
        }
     System.out.println(" ");
    }

    public void g2_crearSerieChar5(int tamanio){ //Chugá Juan
        char [] caracteres = {'\\', '|', '/', '-', '|'};
        int index;
        for(int posicion = 0; posicion < tamanio; posicion++) {
            index = posicion % 5;
            System.err.print(caracteres[index] + " ");
        }
        System.out.println();
    }

    public void g2_crearSerieChar7(int tamanio){ //Chugá Juan
        
        char letra = 97;
        int numero_caracteres;
        for(int posicion = 1; posicion <= tamanio; posicion++) {
            numero_caracteres = 2 * posicion;
            for(int index = 0; index < numero_caracteres; index++)
                System.out.print(letra);
            letra++;
            System.out.print(" ");
        }
        System.out.println();
    }

    public void g2_crearSeriecaractere8(int valor){ //Mayerli Chavez
        System.out.println("");
        System.out.println("La operacion es: ");
        
        int numeroletra = 97;
        for (int i = 1; i <= valor; i++) {
            int indiceserie = 1;
            while (indiceserie <= i * 2 - 1) {
                System.out.print((char) numeroletra);
                indiceserie++;
            }
            System.out.print("  ");
            numeroletra++;
        }
        System.out.println();
    }
    
}
