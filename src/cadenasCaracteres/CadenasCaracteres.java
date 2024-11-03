package cadenasCaracteres;
import java.util.Scanner;
import java.lang.String;

public class CadenasCaracteres {
    Scanner scanner = new Scanner(System.in);

    public void g2_crearCadenaChar3(String frase, char letra){ //Chugá Juan
        while(true){
            char vocal = letra;
            if(esVocal(vocal)){
                System.out.print("Salida: ");
                for(int index = 0; index < frase.length(); index++){
                    if(frase.toLowerCase().charAt(index) == vocal)
                        System.out.print(" ");
                    else 
                        System.out.print(frase.charAt(index));
                }
                System.out.println();
                break;
            }
            else
                System.out.print("Por favor recuerde ingresar una vocal: ");
                letra = (scanner.nextLine().toLowerCase().charAt(0));
        }        
    }

    public void g2_crearCadenaChar5(char frase []){ //Chugá Juan
        System.out.print("Salida: ");
        for(int index = frase.length -1; index >= 0; index--){
            if(esVocal(frase[index])){
                frase[index] = Character.toUpperCase(frase[index]);
            }
            System.out.print(frase[index]);
        }
        System.out.println();
    }


    public boolean esVocal(char vocal){ 
        char [] vocales = {'a', 'e', 'i', 'o', 'u'};
        boolean validado = false;
        for(int index = 0; index < vocales.length; index++){
            
            if(vocales[index] == vocal){
                validado = true;
                break;
            }
        }
        return validado;
    }
}
