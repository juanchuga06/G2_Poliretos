package secuenciasLoading;

import java.util.Scanner;

public class LoadingSecuences {
    Scanner leer = new Scanner(System.in);

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

    public void g2_crearLoadingSecuence1(){ //Chugá Juan
        char [] caracteres = {'\\', '|', '/','-'};
        for(int progress = 0; progress <= 100; progress += 10){
            System.out.print(caracteres[(progress/10)%4] + "\t" + progress + "%\r" );
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public void g2_crearLoadingL03(char caracter) {
        int longitudBarra = 20;
        boolean haciaDerecha = true;
        int posicion = 0;
    
        for (int porcentaje = 0; porcentaje <= 100; porcentaje ++) {
            StringBuilder barra = new StringBuilder(" ".repeat(longitudBarra));
    
            barra.setCharAt(posicion, caracter);
    
            System.out.print("\r[" + barra + "] " + porcentaje + "%");
    
            if (haciaDerecha) {
                posicion++;
                if (posicion == longitudBarra - 1) {
                    haciaDerecha = false;
                }
            } else {
                posicion--;
                if (posicion == 0) {
                    haciaDerecha = true;
                }
            }
    
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println("Retraso completado ");
            }
        }
        System.out.print("\r[" + "                   " + caracter + "] " + "100" + "%");
        System.out.println("\nCarga completada!");
    }

    public void g2_crearLoading5(){ //Mayerli Chavez
        int longitudBarra = 20;
        for (int barraprogreso = 1; barraprogreso <= longitudBarra; barraprogreso++) {
            int porcentaje = (barraprogreso * 100) / longitudBarra;
            StringBuilder barra = new StringBuilder();

            for (int avance = 0; avance < longitudBarra; avance++) {
                if (avance < barraprogreso - 1) {
                    barra.append("=");
                } else if (avance == barraprogreso - 1) {
                    barra.append(barraprogreso % 2 == 0 ? "-" : ">");
                } else {
                    barra.append(" ");
                }
            }

            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            try{
                Thread.sleep(400); 
                }catch(InterruptedException e){
                   System.out.println("Retraso completado ");
                }
        }
        System.out.println("\n¡Carga completa!");
    }

    public void g2_crearLoadingSecuence7(){ //Chugá Juan
        char [] caracteres = {'\\', '|', '/','-'};
        int espacios_llenos = 0;
        for(int progress = 0; progress <= 100; progress += 5){
            System.out.print("[" + "=".repeat(espacios_llenos) + caracteres[espacios_llenos%4] 
                                 + " ".repeat(20-espacios_llenos) + "] " + progress + "%\r" );
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println();
            }
            espacios_llenos++;
        }
        System.out.println();
    }

    public void g2_crearLoadingL08(String digito){
        int longitudFija = 20; 
        int longitud = digito.length();
        for (int barracarga = 1; barracarga <= longitud; barracarga++) {
            int porcentaje = (barracarga * 100) / longitud;
    
            StringBuilder barra = new StringBuilder();
    
            for (int avance = 0; avance < longitudFija; avance++) {
                if (avance < barracarga && avance < longitud) {
                    barra.append(digito.charAt(avance));
                } else {
                    barra.append(" ");
                }
            }
            System.out.print("\r[" + barra + "] " + porcentaje + "%");
            
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Retraso completado ");
            }
        }
        System.out.println();
    }

    public void g2_crearLoadingSecuence11(){ //Chugá Juan
        int valor_maximo = 10, valor_minimo = 0, tamanio = 50;
        int [] valoresAleatorios = new int [tamanio];
        System.out.print( "Valores aleatorios: ");
        for (int index = 0; index < valoresAleatorios.length; index++) {
            valoresAleatorios[index] = (int)(Math.random()*((valor_maximo-valor_minimo + 1)+valor_minimo));
            System.out.print(valoresAleatorios[index] + ", ");  
        }
        System.out.println();

        for(int index = 0; index < valoresAleatorios.length; index++){
            try {
                Thread.sleep(300);
                System.out.println(" ".repeat(valor_maximo-valoresAleatorios[index]) 
                                + ANSI_RED + "-".repeat(valoresAleatorios[index]) + ANSI_BLACK +"|" 
                                + ANSI_RED + "-".repeat(valoresAleatorios[index]) + ANSI_RESET);
            } catch (InterruptedException e){
            }
        }
    }
}
