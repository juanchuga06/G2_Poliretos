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


    public int g3_cambiarCaracterClave(char c) {
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

    public int g3_validarContraseña(String contraseña) {
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
            columna = g3_cambiarCaracterClave(contraseña.charAt(i));
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

    public int g3_cambiardeCharacter(char c) {
        switch (c) {
            case 'f':
                return 0;
            case 'o':
                return 1;
            case 'r':
                return 2;
            case 'i':
                return 3;
            case 'e':
                return 4;
            case 'l':
                return 5;
            case 's':
                return 6;
            case 'h':
                return 7;
            case 'c':
                return 8;
            case 'a':
                return 9;
            case '(':
                return 10;
            default:
                return -1;
        }
    }

    public int g3_validarPalabra(String entrada) {
        int estado= 0;
        int columna=0;
        int mt[][] = {
            { 1,  -1, -1,  4, 6, -1, -1, -1, -1, -1, -1},
            {-1,   2, -1, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1,  -1,  3, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1,  -1, -1, -1, 11, -1, -1, -1, -1, -1, 10},
            {5,  -1, -1,  -1, -1, -1, -1, -1, -1, -1, -1},
            {-1,  -1, -1, -1,  6, -1, -1, -1, -1, -1, 10},
            {-1,  -1, -1, -1, -1,  7, -1, -1, -1, -1, -1},
            {-1,  -1, -1, -1, -1, 8,  -1, -1, -1, -1, -1},
            {-1,  -1, -1, -1, 9, -1,  -1, -1, -1, -1, -1},
            {-1,  -1, -1, -1, -1, -1,  -1, -1, -1, -1, 10},
            {-1,  -1, -1, -1, -1, -1,  -1, -1, -1, -1, 10},
            {-1,  -1, -1, -1, -1, -1,  -1, 12, -1, -1, -1},
            {-1,  -1, -1, -1, -1, -1,  -1, -1, 13, -1, -1},
            {-1,  -1, -1, -1, -1, -1,  -1, -1, -1, 14, -1},
            {-1,  -1, -1, -1, -1, -1,  -1, -1, -1, -1, 10},
        };
        for (int i = 0; i<entrada.length(); i++) {
            columna = g3_cambiardeCharacter(entrada.charAt(i));
            if (columna == -1 || mt[estado][columna] == -1) {
                return -1;
            }
            estado = mt[estado][columna];
        }
        if (estado == 10) {
            return 1;
        }
        return -1;
    }

    public void g3_validarEntrada(Scanner sc) {
        System.out.println("Ingrese en inicio de un comando bucle ejemplo if(");
        String entrada = sc.next();
        int resultado = g3_validarPalabra(entrada);
        if (resultado == 1) {
            System.out.println("Bucle validado.");
        } else {
            System.out.println("Bucle no validado");
        }
    }
}
