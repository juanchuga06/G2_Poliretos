package seriesNumericas;

public class SecuenciasNumericas{
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


    public void g2_ejercicioS6(int tamanoS6) {
    
        for(int i = 1; i <= tamanoS6; i++){
            int num1 = i * i;
            System.out.print(num1 + " ");
        }
        System.out.println();
    }

    public  void g2_ejercioS8(int tamanoS8 ){
        int c = 5;
        int d = 3;
        for(int i = 0; i <= tamanoS8; i++){
            int result = d + (i * c);
            System.out.print(result + " ");
        }
        System.out.println();
    }

    public void g2_ejercicioS12(int tamanoS12){
        //Ejercico S12:
        int f =0;
        for(int i = 1; i <= tamanoS12; i++){
            f+=i*2;
            System.out.print(f + " ");
        }

    }
}
