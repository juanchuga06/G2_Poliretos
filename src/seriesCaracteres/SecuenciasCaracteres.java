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

    public void g2_serieDesignos(int tamanoS) { //ANTHONY GAMBOA
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

    public  void g2_serieDeAbecedario(int tamanoCara){//ANTHONY GAMBOA
         char[][] abecedario= new char[1][8];
        char letra =  'a';

        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 8; j++){
                if( letra <= 'z'){
                    abecedario[i][j] = letra;
                    letra++;
                }else{
                 abecedario[i][j] = ' ';   
                }
            }
        }

        for(int i = 0; i < 1; i++){ //ANTHONY GAMBOA
            for(int j = 0; j < 8; j++){
                System.out.print(abecedario[i][j] + " ");
            }
            System.out.println();
        }
    }

}
