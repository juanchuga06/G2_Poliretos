package secuenciasLoading;

import java.util.Random;

public class LoadingSecuences {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static final String Figura = "     \\|||/\n     (> <)\n  ooO-(_)-Ooo";

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
        System.out.println("\n¡Carga Completa!\n");
    }

    public void g2_crearLoadingSecuence2(char caracterP, int longitud){ //Gamboa Anthony
        for(int i = 0; i <= longitud; i++){
            int porcetaje = (i * 100)/longitud;

            StringBuilder barra = new StringBuilder("[");
            for(int j = 0; j < longitud; j++){
                if(j < i){
                    barra.append(caracterP);
                }else{
                    barra.append(" ");
                }
            }
            barra.append("] ");

            System.out.print("\r" + barra + porcetaje + "%");

            try{
                Thread.sleep(200);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("\n!Carga completada!");
    }

    public void g2_crearLoadingSecuence3(char caracter) { //Chavez Mayerli
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
        System.out.println("\nCarga completada!\n");
    }

    public void g2_crearLoadingSecuence4(int duracion){ //Gamboa Anthony
        duracion = duracion * 10;
        String[]patrones = {"o0o", "0o0", "oo0", "o0o"};
        int progreso = 0;
        while (progreso <= 100) {
            String patron = patrones[progreso % patrones.length];

            System.out.print("\r" + patron + " " + progreso + "%" );

            progreso += 1;

            try{
                Thread.sleep(duracion);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("\n¡Carga Completa!");
    }

    public void g2_crearLoadingSecuence5(){ //Mayerli Chavez
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
        System.out.println("\n¡Carga completa!\n");
    }

    public void g2_crearLoadingSecuence6() throws InterruptedException { // Fuentes Carlos
        int anchoBarra = 20; // Ancho total de la barra
        int posicion = 0; // Posición inicial de la barra
        boolean moviendoDerecha = true; // Indica la dirección del movimiento
        int porcentaje = 0; // Porcentaje de progreso

        // Simulación del movimiento de la barra
        while (porcentaje <= 100) {
            // Construir la barra
            StringBuilder barra = new StringBuilder("[");
            for (int j = 0; j < anchoBarra + 1; j++) {
                if (j == posicion) {
                    barra.append("<=>");
                    j += 3; // Aumentar el índice para saltar los caracteres de "<=>"
                } else {
                    barra.append(" ");
                }
            }
            barra.append("] "); // Cerrar la barra

            // Limpiar la consola y mostrar la barra
            System.out.print("\r" + barra.toString() + porcentaje + "%");

            // Esperar un poco para ver el efecto
            try {
                Thread.sleep(100); // Espera 100 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            // Actualizar la posición
            if (moviendoDerecha) {
                posicion++;
                if (posicion >= anchoBarra - 3) { // Si llega al final, cambiar dirección
                    moviendoDerecha = false;
                }
            } else {
                posicion--;
                if (posicion <= 0) { // Si llega al inicio, cambiar dirección
                    moviendoDerecha = true;
                }
            }

            // Incrementar el porcentaje de progreso
            if (porcentaje < 100) {
                porcentaje++; // Incrementar el porcentaje
            }else{
                break;
            }
        }
        System.out.println();
        // Asegurarse de que la barra esté en la posición final antes de salir
        
    }

    public void g2_crearLoadingSecuence7() { // Chugá Juan
        char[] caracteres = { '\\', '|', '/', '-' };
        int espacios_llenos = 0;
        for(int progress = 0; progress <= 100; progress += 5){
            System.out.print("[" + "=".repeat(Math.min(espacios_llenos, 19)) + caracteres[espacios_llenos%4] 
                                 + " ".repeat(19-(espacios_llenos-1)) + "] " + progress + "%\r" );
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println();
            }
            espacios_llenos++;
        }
        System.out.println("\n¡Carga Completa!\n");
    }

    public void g2_crearLoadingSecuence8(String digito){ //Chavez Mayerli
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

    public void g2_crearLoadingSecuence9(String nombreCompleto) { // Fuentes Carlos
        System.out.println(nombreCompleto);

        int totalCaracteres = nombreCompleto.length();
        
        for (int i = 0; i < totalCaracteres; i++) {
           
            char letraActual = nombreCompleto.charAt(i);
            
            int porcentajeCarga = (i + 1) * 100 / totalCaracteres;
            
            System.out.printf("\r%c %d%%", letraActual, porcentajeCarga);
            
            try {
                Thread.sleep(500); // Espera 500 ms
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
       
        System.out.println(); 
    }

    public void g2_crearLoadingSecuence10() { // Fuentes Carlos
        Random random = new Random();
         int tamanioArchivo = (int)(Math.random()*((100 - 10 + 1) + 10)); // Genera un número entre 10 y 100
         String nombreArchivo = "ArchivoYarl-win_amd64.whl";
 
         int cargado = 0;
         int barraLargo = 40; 
 
         System.out.printf("Downloading %s (%d kB)%n", nombreArchivo, tamanioArchivo);
 
         while (cargado < tamanioArchivo) {
             cargado += random.nextInt(5) + 1; 
             if (cargado > tamanioArchivo) {
                 cargado = tamanioArchivo; 
             }
 
             double porcentaje = (double) cargado / tamanioArchivo;
             int barraCompletada = (int) (barraLargo * porcentaje);
             int barraRestante = barraLargo - barraCompletada;
 
             String barra = ANSI_GREEN + "-".repeat(barraCompletada) + " ".repeat(barraRestante) + ANSI_RESET;
 
             System.out.printf("\r%s %d / %d kB", barra, cargado, tamanioArchivo);
             System.out.flush();
 
             try {
                 Thread.sleep(200); // Esperar 200 ms
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
             }
         }
 
         System.out.println("\nCarga completada.");
     }

    public void g2_crearLoadingSecuence11() { // Chugá Juan
        int valor_maximo = 10, valor_minimo = 0, tamanio = 50;
        int[] valoresAleatorios = new int[tamanio];
        System.out.print("Valores aleatorios: ");
        for (int index = 0; index < valoresAleatorios.length; index++) {
            valoresAleatorios[index] = (int) (Math.random() * ((valor_maximo - valor_minimo + 1) + valor_minimo));
            System.out.print(valoresAleatorios[index] + ", ");
        }
        System.out.println();

        for (int index = 0; index < valoresAleatorios.length; index++) {
            try {
                Thread.sleep(300);
                System.out.println(" ".repeat(valor_maximo - valoresAleatorios[index])
                        + ANSI_RED + "-".repeat(valoresAleatorios[index]) + ANSI_BLACK + "|"
                        + ANSI_RED + "-".repeat(valoresAleatorios[index]) + ANSI_RESET);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public  void g2_crearLoadingSecuence11REPETIDO() {
        int numBar = 10;
        int[] heights = new int[numBar];

        for (int i = 0; i < numBar; i++) {
            heights[i] = (int)(Math.random()*((8 - 0 + 1) + 0)); 
            System.out.print(heights[i] + ", ");
        }
        System.out.println();

        for (int level = 8; level >= 0; level--) {
            StringBuilder line = new StringBuilder();
            for (int height : heights) {
                if (height >= level) {
                    line.append("█ "); 
                } else {
                    line.append("  "); 
                }
            }
            System.out.println(line);
        }
    }
    
    public  void g2_crearLoadingSecuence12(int duracion1) { //Gamboa Anthony
        int maxPosicion = 20;
        for(int i = 0; i <=  maxPosicion; i++){
            imprimirFiguraConEspacios(i);
            esperar(duracion1);
        }

        for(int i = maxPosicion -1 ; i>= 0; i--){
          imprimirFiguraConEspacios(i);
          esperar(duracion1);   
        }  
    }
    
    private static void imprimirFiguraConEspacios(int espacios){
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String padding = " ".repeat(espacios);
        System.out.println(padding + Figura.replace("\n", "\n" + padding));
    }

    private static void esperar(int duracion1){
        try{
            Thread.sleep(duracion1);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
    }

}

