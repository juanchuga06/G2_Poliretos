package seriesNumericas;

import java.util.Scanner;

public class SecuenciasNumericas{
    Scanner leer = new Scanner(System.in);

    public void g2_crearSerienumericaS2(int rango){
        System.out.println("");
            if( rango > 0){
                System.out.println("La operacion es: ");
                for (int i = 1; i <= rango; i++) {
                    if((i % 2) != 0){
                        System.out.print(i + " ");
                    }
                    else{
                    System.out.print("0 ");
                }
            } 
        }else{
            System.out.print("Ingreso invalido!!!");
            System.out.print("porfavor ingrese un nuevo rango:");
              rango= leer.nextInt();
              g2_crearSerienumericaS2(rango);
            }
        System.out.println("");
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
        System.out.println("");
        if(rango > 0){
                System.out.println("La operacion es: ");
                int primerdigito = 0, segundodigito = 0, repositorio = 0, numero2 = 2;
                while(numero2 <= 4){
                    switch (numero2) {
                        case 2:
                            System.out.print( primerdigito + "/" + numero2);
                            System.out.print("  ");
                            numero2+=2;
                            primerdigito++;
                            break;
                        default:
                            System.out.print( primerdigito + "/" + numero2);
                            System.out.print("  ");
                            numero2+=2;
                            break;
                    }
                }

                for (int i = 1 ; i <= rango ; i++){
                        repositorio= primerdigito + segundodigito;
                        System.out.print( repositorio + "/" + numero2);
                        System.out.print("  ");
                        numero2+=2;
                        segundodigito = primerdigito;
                        primerdigito = repositorio;
                }
        }else{
            System.out.print("Ingreso invalido!!!");
            System.out.print("porfavor ingrese un nuevo rango:");
              rango= leer.nextInt();
              g2_crearSerienumericaS4(rango);
        }
        System.out.println("");
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

    public void g2_crearSerienumericaS9(int rango){
        System.out.println("");
        if(rango > 0){
                System.out.println("La operacion es: ");
                double n=1d;
                while ( n <= rango){
                    double cuadrado = Math.pow(2,n);
                    System.out.print((int)(cuadrado) + " ");
                    n++;
                }
        }else{
                System.out.print("Ingreso invalido!!!");
                System.out.print("porfavor ingrese un nuevo rango:");
                rango= leer.nextInt();
                g2_crearSerienumericaS9(rango);
            }
        System.out.println("");
   }
}
