package secuenciasLoading;

import java.util.Random;

public class LoadingSecuences {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

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

    public void g2_crearLoadingSecuence6(int totalCaracteres, String barra) throws InterruptedException { // Fuentes Carlos

        for (int posicion = 0; posicion <= totalCaracteres - barra.length(); posicion++) {
            int espaciosAntes = posicion;
            int espaciosDespués = totalCaracteres - posicion - barra.length();

            StringBuilder barraProgreso = new StringBuilder("[");
            for (int j = 0; j < espaciosAntes; j++) {
                barraProgreso.append(" ");
            }
            barraProgreso.append(barra);
            for (int j = 0; j < espaciosDespués; j++) {
                barraProgreso.append(" ");
            }
            barraProgreso.append("]");

            int porcentaje = (posicion * 100) / (totalCaracteres - barra.length());

            System.out.print("\r" + barraProgreso.toString() + " " + porcentaje + "%");
            System.out.flush();

            // Espera 200 ms
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                System.out.println("Error en la ejecucion");
            }
        }
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
        int longitud = nombreCompleto.length();

        for (int i = 0; i < longitud; i++) {
            System.out.println(nombreCompleto.charAt(i));

            int porcentaje = (i + 1) * 100 / longitud;
            
            System.out.print(" " + porcentaje + "% ");

            try {
                Thread.sleep(500); // Pausa de 0.5 segundo
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(" ");
    }

    public void g2_crearLoadingSecuence10() { // Fuentes Carlos
       Random random = new Random();
        int tamanioArchivo = random.nextInt(91) + 10; // Genera un número entre 10 y 100
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

            String barra = "-".repeat(barraCompletada) + " ".repeat(barraRestante);

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
    
    public  void g2_crearLoadingSecuence11REPETIDO(int numBar) {
        Random random = new Random();
        int[] heights = new int[numBar];

        for (int i = 0; i < numBar; i++) {
            heights[i] = random.nextInt(9); 
        }

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

