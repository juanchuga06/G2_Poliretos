package recursividad;

public class Recursivo {
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

    public  int g2_sumas(int a, int b){ //ANTHONY GAMBOA
        if(b==0){
            return a;
        }

        return g2_sumas(a + 1, b -1);
    }

    public  void g2_contador(int cont){ //ANTHONY GAMBOA

        if(cont < 0){
            return;
        }
        System.out.print("\r" + cont);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
            System.out.println("Se interrumpio la espera");
        }
        g2_contador(cont - 1);
    }
}
