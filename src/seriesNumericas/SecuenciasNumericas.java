package seriesNumericas;

public class SecuenciasNumericas{
    
    public void g2_crearSerieNum1(int tamanio){  //Fuentes Carlos
        int n = tamanio;
        int a = 0, b = 1, c;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    public void g2_crearSerieNum2(int rango){ //Mayerli Chavez
        for (int i = 1; i <= rango; i++) {
            if((i % 2) != 0){
                System.out.print(i + " ");
            }
            else{
            System.out.print("0 ");
        }
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

    public void g2_crearSerieNum4(int rango){ //Mayerli Chavez
        int fibonacci1 = 0, fibonacci2 = 1, numeropar  = 0, resultado = 0;
        for( int avance = 0 ; avance < rango; avance ++){
            numeropar+=2;
            System.out.print(fibonacci1 + "/" + numeropar + " ");
            resultado = fibonacci1 + fibonacci2;
            fibonacci1 = fibonacci2;
            fibonacci2 = resultado;
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

    public void g2_crearSerieNum6(int tamanoS6) { //Gamboa Anthony
        for(int i = 1; i <= tamanoS6; i++){
            int num1 = i * i;
            System.out.print(num1 + " ");
        }
        System.out.println();
    }
    
    public void g2_crearSerieNum7(int tamanio){  //Fuentes Carlos
        int n = tamanio;
        for (int i = 0; i < n; i++) {
            System.out.print((1 + 3 * i) + " ");
        }
        System.out.println();
    }

    public void g2_crearSerieNum8(int tamanoS8 ){ //Gamboa Anthony
        int c = 5;
        int d = 3;
        for(int i = 0; i <= tamanoS8; i++){
            int result = d + (i * c);
            System.out.print(result + " ");
        }
        System.out.println();
    }
   
    public void g2_crearSerieNum9(int rango){ //Mayerli Chavez
                double n=1d;
                while ( n <= rango){
                    double cuadrado = Math.pow(2,n);
                    System.out.print((int)(cuadrado) + " ");
                    n++;
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
    
    public void g2_crearSerieNum12(int tamanoS12){ //Gamboa Anthony
        int f =0;
        for(int i = 1; i <= tamanoS12; i++){
            f+=i*2;
            System.out.print(f + " ");
        }
        System.out.println();
    }
}
