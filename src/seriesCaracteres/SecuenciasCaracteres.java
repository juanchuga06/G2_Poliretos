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
            int temp = actual;
            actual = actual + anterior;
            anterior = temp;
        }
        System.out.println();
    }

    public void g2_crearSerieChar3(int valor){ //Mayerli Chavez
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

    public void g2_crearSerieChar4(int tamanoS) { //ANTHONY GAMBOA
        //EJERCICIO S4 SERIES CARACTERES:
        char[] operadores = new char[tamanoS];
        char[] simbolos = { '+', '-', '*', '/'};

        for(int i = 0; i < tamanoS; i++){
            operadores[i] = simbolos[i % simbolos.length];
        }

        for(int i = 0; i < tamanoS; i++){
            System.out.print(operadores[i] + " ");
        }

        System.out.println();
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
    
    public void g2_crearSerieChar6Repetido(char letraFinal){ //Fuentes Carlos

        if (letraFinal < 'a' || letraFinal > 'z') {
            System.out.println("Por favor, ingrese una letra válida entre 'a' y 'z'.");
            return;
        }

        
        char letraActual = 'a';
        boolean esSuma = true; 
        int contador = 0; 

        while (letraActual <= letraFinal) {
          
            if (contador % 2 == 0) {
                System.out.print(letraActual);
            } else {
                
                if (esSuma) {
                    System.out.print(" + ");
                } else {
                    System.out.print(" - ");
                }
               
                esSuma = !esSuma;
            }

            
            contador++;
            letraActual ++; 
        }

        System.out.println();
    }

    public  void g2_crearSerieChar6(int tamanoCara){//ANTHONY GAMBOA
        char[][] abecedario= new char[1][8];
       char letra =  'a';

       for(int i = 0; i < 1; i++){
           for(int j = 0; j < tamanoCara; j++){
               if( letra <= 'z'){
                   abecedario[i][j] = letra;
                   letra++;
               }else{
                abecedario[i][j] = ' ';   
               }
           }
       }

       for(int i = 0; i < 1; i++){ //ANTHONY GAMBOA
           for(int j = 0; j < tamanoCara; j++){
               System.out.print(abecedario[i][j] + " ");
           }
           System.out.println();
       }
   }

    public void g2_crearSerieChar7(int tamanio){ //Chugá Juan
        char letra = 97;
        int numero_caracteres;
        for(int posicion = 1; posicion <= tamanio; posicion++) {
            numero_caracteres = 2 * posicion;
            for(int index = 0; index < numero_caracteres; index++)
                System.out.print(letra);
            letra++;
            if(letra == 123)
                letra = 97;
            System.out.print(" ");
        }
        System.out.println();
    }

    public void g2_crearSerieChar8(int valor){ //Mayerli Chavez
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
    
    public void g2_crearSerieChar9(char letraFinalCf){ //Fuentes Carlos
        
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
