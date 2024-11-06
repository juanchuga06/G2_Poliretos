package cadenasCaracteres;
import java.util.Scanner;
import java.lang.String;

public class CadenasCaracteres {
    Scanner scanner = new Scanner(System.in);
    Scanner leer = new Scanner(System.in);

    public void g2_crearCadenaCaracteresC02(String frase){
        
        int contador_letra =0;
        for(char c: frase.toCharArray()){
            if(Character.isLetter(c) && !esVocal1(c)){
                contador_letra++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador_letra + " letras.");

    System.out.println(" ");
}
    public  static boolean esVocal1(char c){
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

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

    public void g2_crearCadenaCaracteresC06(String frase){
        StringBuilder letraFrase = new StringBuilder();
        String nuevafrase = "";
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                    if (esVocal1(c)) {
                        letraFrase.append(Character.toLowerCase(c));
                    } else {
                        letraFrase.append(Character.toUpperCase(c));
                    }
            } else{
                letraFrase.append(c);
            }
        }
        nuevafrase = letraFrase.reverse().toString();
        System.out.print("La frase resultante es: " + nuevafrase);
        System.out.println(" ");
    }

    public void g2_crearCadenaCaracteresC07(String frase){
        String fraseModificada = frase.toUpperCase().replace("J", "");
        System.out.print("La nueva frase es: " + fraseModificada);
        System.out.println(" ");
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
