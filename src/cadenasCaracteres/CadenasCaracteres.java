package cadenasCaracteres;
import java.util.Scanner;
import java.lang.String;

public class CadenasCaracteres {
    Scanner scanner = new Scanner(System.in);
    Scanner leer = new Scanner(System.in);

    public  int g2_crearCadenaChar1(String frase12){//Gamboa Anthony
        int cont = 0;
        String vocales = "aeiouAEIOU";
        for(int i = 0; i < frase12.length(); i++){
            char a = frase12.charAt(i);
            if(vocales.indexOf(a) != -1){
                cont++;
            }
        }
        return cont;
    }

    public void g2_crearCadenaChar2(String frase){ //Mayerli Chavez
        int contador_letra =0;
        for(char c: frase.toCharArray()){
            if(Character.isLetter(c) && !esVocal(c)){
                contador_letra++;
            }
        }
        System.out.println("La frase ingresada tiene " + contador_letra + " letras.");
        System.out.println(" ");
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

    public void g2_crearCadenaChar4(String frase, char letraEliminada){ //Fuentes Carlos
        String fraseSinLetra = "";

        for (int i=0; i<frase.length(); i++){
            char letraActual = frase.charAt(i);
            if (letraActual==letraEliminada){
                fraseSinLetra+=" ";
            } else {
                fraseSinLetra+=letraActual;
            }
        }
        System.out.println("Frase elegida: "+frase);
        System.out.println("Letra a eliminar: "+letraEliminada);
        System.out.println("Frase sin la letra: "+fraseSinLetra);
        System.out.println();
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
    
    public void g2_crearCadenaChar6(String frase){ //Mayerli Chavez
        StringBuilder letraFrase = new StringBuilder();
        String nuevafrase = "";
        for (char c : frase.toCharArray()) {
            if (Character.isLetter(c)) {
                    if (esVocal(c)) {
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

    public void g2_crearCadenaChar7(String frase){ //Mayerli Chavez
        String fraseModificada = frase.toUpperCase().replace("J", "");
        System.out.print("La nueva frase es: " + fraseModificada);
        System.out.println(" ");
    }

    public void g2_crearCadenaChar8(){ //Fuentes Carlos
      // Conjunto de palabras
      String[] palabras = {"amor", "roma", "raton", "tron", "nora", "aron"};
        
      
      String palabraSeleccionada = palabras[(int)(Math.random() * palabras.length)];
      
      System.out.println("Palabra seleccionada: " + palabraSeleccionada);
      System.out.print("Ingresa un anagrama de la palabra: ");
      
      String anagramaIngresado = scanner.nextLine();
      
      if (esAnagrama(palabraSeleccionada, anagramaIngresado)) {
          System.out.println("¡Correcto! \"" + anagramaIngresado + "\" es un anagrama de \"" + palabraSeleccionada + "\".");
      } else {
          System.out.println("Incorrecto. \"" + anagramaIngresado + "\" no es un anagrama de \"" + palabraSeleccionada + "\".");
      }
    
    }
    public static boolean esAnagrama(String palabra1, String palabra2) {
        
        if (palabra1.length() != palabra2.length()) {
            return false;
        }
        
        char[] arr1 = palabra1.toCharArray();
        char[] arr2 = palabra2.toCharArray();
        
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        
        return java.util.Arrays.equals(arr1, arr2);
    }

    public void g2_crearCadenaChar9(String fraseC){ //Gamboa Anthony
        StringBuilder resultado = new StringBuilder();
        boolean mayuscula = true;

        for(char c : fraseC.toCharArray()){
            if(Character.isLetter(c)){
                if(mayuscula){
                    resultado.append(Character.toUpperCase(c));
                }else{
                    resultado.append(Character.toLowerCase(c));
                }
                mayuscula = !mayuscula;
            }else{
                resultado.append(c);
            }
        }
        System.out.println("Frase alternada " + resultado);
    }

    public static boolean esVocal(char vocal){ 
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
