package seriesNumericas;import java.util.Scanner;

public class SecuenciasNumericas{
    Scanner leer = new Scanner(System.in);

    public void g2_crearSerienumerica2(int rango){ //Mayerli Chavez
        System.out.println();
        System.out.println("La operacion es: ");
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

    public void g2_crearSerienumericaS4(int rango){
        StringBuilder resultado = new StringBuilder("La operacion es: \n");
        int primerdigito = 0, segundodigito = 0, numero2 = 2;
        int repositorio;

        for (int i = 0; i < rango; i++) {
            resultado.append(primerdigito).append("/").append(numero2).append("  ");
            numero2 += 2;
            repositorio = primerdigito + segundodigito;
            segundodigito = primerdigito;
            primerdigito = repositorio;
        }
        System.out.println(resultado);
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

    public void g2_crearSerienumerica9(int rango){ //Mayerli Chavez
        System.out.println();
                System.out.println("La operacion es: ");
                double n=1d;
                while ( n <= rango){
                    double cuadrado = Math.pow(2,n);
                    System.out.print((int)(cuadrado) + " ");
                    n++;
                }
        System.out.println();
   }
}
