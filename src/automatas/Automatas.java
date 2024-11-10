package automatas;

import java.util.Scanner;
public class Automatas {
    final String alfabetosimple = "a.b.c";
    final int R = -10, A = 3, matrizTransicion01[][] = {//   a  b  c  \n any
                                                            {1, 2, R, R, R},//q0
                                                            {1, 2, R, R, R},//q1
                                                            {R, 2, 3, R, R},//q2
                                                            {R, R, R, A, R}//q3
                                                    },
         A1 = 1, A2 = 2, A3 = 3, matrizTransicion03[][] = {//   a  b  c  \n any
                                                               {1, 2, 3, R, R},//q0
                                                               {1, R, R, A1, R},//q1
                                                               {R, 2, R, A2, R},//q2
                                                               {R, R, 3, A3, R}//q3
                                                          };

    public void g2_crearAutomata1(String palabra){ //Chugá Juan
        int q = 0;
        for(int indexchar = 0; indexchar < palabra.length(); indexchar++){
            int indexAlfa = getIndexAlfabetoSimple(palabra.charAt(indexchar));
            if (indexAlfa < 0 || matrizTransicion01[q][indexAlfa] == R){
                q = R;
                break;}
            q = matrizTransicion01[q][indexAlfa];
        }
        if(q == A){
            System.out.println("Estado final: q" + q);
            System.out.println("Por tanto, se acepta la palabra");
        }else
            System.out.println("Por tanto, no se acepta la palabra");
    }

    public void g2_crearAutomata3(String palabra){ //Chugá Juan
        int q = 0;
        for(int indexchar = 0; indexchar < palabra.length(); indexchar++){
            int indexAlfa = getIndexAlfabetoSimple(palabra.charAt(indexchar));
            if (indexAlfa < 0 || matrizTransicion03[q][indexAlfa] == R){
                 q = R;
                break;}
            q = matrizTransicion03[q][indexAlfa];
        }
        if(q == A1 || q == A2 || q == A3){
            System.out.println("Estado final: q" + q);
            System.out.println("Por tanto, se acepta la palabra");
        }
        else
            System.out.println("Por tanto, no se acepta la palabra");
    }

    private int getIndexAlfabetoSimple(char letra) {
        Scanner scAlfabeto = new Scanner(alfabetosimple).useDelimiter("\\.");
        for (int indexAlfa = 0; scAlfabeto.hasNext(); indexAlfa++) {
            if (String.valueOf(letra).equals(scAlfabeto.next())) {
                return indexAlfa;
            }
        }
        return -1;
    }


    public int g2_cambiarCaracter(char c){ //ANTHONY GAMBOA
        switch (c) {
            case 'a':
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
        
            default:
                return - 1;
        }
        
    }


    public int g2_cambiarCaracterClave(char c) {
        if (c >= 65 && c <= 90) {
            return 0;
        }
        if (c >= 97 && c <= 122) {
            return 1;
        }
        if (c >= 48 && c <= 57) {
            return 2;
        }
        if ((c >= 33 && c <= 47) || (c >= 58 && c <= 64) || (c >= 91 && c <= 96) || (c >= 123 && c <= 126)) {
            return 3;
        }
        return -1;
    }

    public int g2_validarContraseña(String contraseña) { //Anthony Gamboa
        int estado = 0;
        int columna = 0;
        int e = -1;
        int[][] mt = {
            {1, 2, 3, 4, e},
            {1, 5, 5, 5, e},
            {5, 2, 5, 5, e},
            {5, 5, 3, 5, e},
            {5, 5, 5, 4, e},
            {5, 5, 5, 5, e},
        };

        for (int i = 0; i < contraseña.length(); i++) {
            columna = g2_cambiarCaracterClave(contraseña.charAt(i));
            if (columna == 4 || mt[estado][columna] == e) {
                return -1;
            }
            estado = mt[estado][columna];
        }
        if (estado != 5) {
            return -1;
        }
        return 1;
    }

    public int g2_cambiarCaracter2(char c) {
        switch (c) {
            case 'a': 
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            default:
                return -1;
        }
    }
    
    public int g2_llamarAutomata2(String automata1) {
        int estadoInicial = 0;
        int columna = 0;
        char caracter = ' ';
        int e = -1;
        int mt[][] = {
            {1, e, e,},
            {e, 2, e,},
            {e, 2, 3,},
            {4, e, e},
            {e, e, e},
        }; 
        for (int i = 0; i < automata1.length(); i++) {
            caracter = automata1.charAt(i);
            columna = g2_cambiarCaracter2(caracter);
            if (columna == -1 || mt[estadoInicial][columna] == e) {
                return -1;
            }
            estadoInicial = mt[estadoInicial][columna];
        }
        if (estadoInicial != 3) {
            return -1;
        }
        return 2;
    }

    public void g2_imprimirAutomata2(Scanner sc) {
        System.out.println("Ingrese una palabra con a b c a");
        String automata1 = sc.next();
        int resultado = g2_llamarAutomata2(automata1);
        if (resultado == 2) {
            System.out.println("La palabra sí es correcta");
        } else {
            System.out.println("La palabra es incorrecta");
        }
    }
}
