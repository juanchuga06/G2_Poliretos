package recursividad;

public class Recursivo {
    
    public void g2_crearRecursion3(int numA, int numB){ //Fuentes Carlos
        int resultado = multiplicar(numA, numB);
        System.out.printf("La multiplicación de %d y %d es: %d%n", numA, numB, resultado);
    }
    public static int multiplicar(int a, int b){

        if (b == 0) {
            return 0;
        }
        return a + multiplicar(a, b - 1);
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
