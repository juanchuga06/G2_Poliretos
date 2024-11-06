package recursividad;

public class Recursivo {

    public static int g2_crearRecursionR01(int dato){
        int factorial;
        if(dato == 0 || dato == 1){
            factorial =1;
        }else{
            factorial = dato * g2_crearRecursionR01(dato - 1);
        }
        return factorial;
    }

    public static int g2_crearRecursionR04(int base, int potencia){
        int resultado;
        if( base == 0){
         resultado = 0;
        }else{
            if(potencia == 0){
                resultado = 1;
            }else{
                    if(potencia !=1){
                        resultado= base * g2_crearRecursionR04(base, (potencia - 1));
                    }else{
                        resultado= base;
                    }
                }
        }
        return resultado;
    }

    public void g2_crearRecursion5(int num, int limite_superior){ //Chugá Juan
        try {
            System.out.println("Cuenta: " + num);
            Thread.sleep(400);
            if(num == limite_superior){
                System.out.println("Terminó la cuenta.");
                return;
            }
            else
                g2_crearRecursion5(num + 1, limite_superior);
        } catch (InterruptedException e) {
            System.out.println();
        }
    }


}
