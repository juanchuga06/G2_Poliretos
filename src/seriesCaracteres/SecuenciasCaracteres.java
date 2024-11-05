package seriesCaracteres;

public class SecuenciasCaracteres {
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
    public void g2_crearSerieChar2(int tamanio, char caracterCf){ //Fuentes Carlos
        int anterior = 1;
        int actual = 1;
        for (int i = 1; i <= tamanio; i++) {
            for (int j = 1; j <= actual; j++) {
                System.out.print(caracterCf);
            }
            System.out.println();
            if (actual > tamanio) {
                break;
            }
            System.out.println();
            int temp = actual;
            actual = actual + anterior;
            anterior = temp;

        
        }
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
    public void g2_crearSerieChar10(char letraFinalCf){ //Fuentes Carlos
        
        int LetraNumeroASCII = 97;
        char LetraActual = (char) LetraNumeroASCII;
        int TotalRepeticiones = 1;
        int ValorLetra1 = 0;
        int ValorLetra2 = 1;
        boolean banderaCaracterExtra = true;

        if ((letraFinalCf < 97) || (letraFinalCf > 122)) {
            System.out.println("Ha ingresado un caracter no valido, por tanto el ejercicio no se va a ejecutar");
        } else {
            // El patron de repeticion de los caracteres se basa en una secuencia de
            // Fibonacci
            if (banderaCaracterExtra) {
                banderaCaracterExtra = false;
                System.out.print(LetraActual + "  ");
                LetraNumeroASCII += 1;
            }
            while (LetraActual < letraFinalCf) {
                LetraActual = (char) LetraNumeroASCII;
                for (int i = 0; i < TotalRepeticiones; i++) {
                    System.out.print(LetraActual);
                }
                System.out.print("  ");
                LetraNumeroASCII += 1;
                TotalRepeticiones = ValorLetra1 + ValorLetra2;
                ValorLetra1 = ValorLetra2;
                ValorLetra2 = TotalRepeticiones;
            }
            System.out.println("");
        }
    }


}
