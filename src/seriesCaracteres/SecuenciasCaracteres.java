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


}
