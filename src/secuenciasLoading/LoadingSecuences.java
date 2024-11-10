package secuenciasLoading;

import java.util.Random;

public class LoadingSecuences {

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

    public void g2_barraPorc(char caracterP, int longitud){
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

    public void g2_waiting(int duracion){
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

    public static final String Figura = "      \\|||/\n     (> <)\n  ooO-(_)-Ooo";

    public  void g2_animacionFigura(int duracion1) {
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

    public  void g2_ondasMusica(int numBar) {
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
}
