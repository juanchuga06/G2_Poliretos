package secuenciasLoading;

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
        System.out.println("\n¡Carga Completa!\n");
    }

    public void g2_crearLoadingSecuence7(){ //Chugá Juan
        char [] caracteres = {'\\', '|', '/','-'};
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
