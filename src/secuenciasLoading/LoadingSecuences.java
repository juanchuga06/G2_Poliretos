package secuenciasLoading;

import java.util.Random;

public class LoadingSecuences {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

    public void g2_crearLoadingSecuence1() { // Chugá Juan
        char[] caracteres = { '\\', '|', '/', '-' };
        for (int progress = 0; progress <= 100; progress += 10) {
            System.out.print(caracteres[(progress / 10) % 4] + "\t" + progress + "%\r");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
        System.out.println();
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
        for (int progress = 0; progress <= 100; progress += 5) {
            System.out.print("[" + "=".repeat(espacios_llenos) + caracteres[espacios_llenos % 4]
                    + " ".repeat(20 - espacios_llenos) + "] " + progress + "%\r");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println();
            }
            espacios_llenos++;
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
}
