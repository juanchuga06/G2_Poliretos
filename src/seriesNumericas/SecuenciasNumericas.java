package seriesNumericas;

public class SecuenciasNumericas{
    public void g2_crearSerieNum1(int tamanio){  //Fuentes Carlos
        int n = tamanio;
        int a = 0, b = 1, c;
        System.out.print("SN1 es: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }
    public void g2_crearSerieNum3(int tamanio){  //Chugá Juan
        int num0 = 0, num1 = 1, suma = 0, denominador = 1;
        for(int i = 0; i < tamanio; i++){   
            System.out.print(num0 + "/" + denominador + " ");
            denominador += 2;
            suma = num0 + num1;
            num0 = num1;
            num1 = suma;
        }
        System.out.println();
    }

    public void g2_crearSerieNum5(int tamanio){ //Chugá Juan
        int num0 = 2, i = 0;
        while(i < tamanio){
            int contador = 0;
            for(int j = 1; j <= num0; j++){
                if(num0 % j == 0){
                    contador++;
                }
            }
            if(contador == 2){
                System.out.print(num0 + " ");
                i++;
            }
            num0++;
        }
        System.out.println();
    }
    public void g2_crearSerieNum7(int tamanio){  //Fuentes Carlos
        int n = tamanio;
        System.out.print("SN7 es: ");
        for (int i = 0; i < n; i++) {
            System.out.print((1 + 3 * i) + " ");
        }
        System.out.println();
    }
    public void g2_crearSerieNum10(int tamanio){  //Fuentes Carlos
        int numeroTres = 3;
        while (numeroTres <= tamanio) {
            System.out.print(numeroTres + " ");
            numeroTres = numeroTres*3;
        }
        System.out.println("");
    }
}
