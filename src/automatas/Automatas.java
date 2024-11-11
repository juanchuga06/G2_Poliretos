package automatas;

import java.util.Scanner;
public class Automatas {
    Scanner leer = new Scanner(System.in);

    final String alfabetosimple = "a.b.c", alfabinario = "0.1",
          alfabeto = "+;-;.;,;0;1;2;3;4;5;6;7;8;9; ",
          alfabeto2 = "$-_-,-;-=-^[a-zA-z0-9 ]";

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
                                                          },
                                matrizTransicion03R[][] = {//    0  1  \n any
                                                                {2, 1, R,  R},//q0
                                                                {R, 1, A1, R},//q1
                                                                {2, 1, A2, R}//q2
                                                           },
        e = -10,
        decimal= 10, //Cifra del usuario
        valido = 10,
        matriztransicion04[][] = {//+     -     .     ,     0     1     2     3     4     5     6     7     8     9     enter     espacio
                                   {1,    1,    e,   e,     2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    e,        e},      //q0
                                   {e,    e,    e,   e,     5,    5,    5,    5,    5,    5,    5,    5,    5,    5,    e,        e},      //q1
                                   {e,    e,    3,   3,     2,    2,    2,    2,    2,    2,    2,    2,    2,    2,    e,        e},      //q2
                                   {e,    e,    e,   e,     4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    e,        e},      //q3
                                   {e,    e,    e,   e,     4,    4,    4,    4,    4,    4,    4,    4,    4,    4,    decimal,  decimal},//q4
                                   {e,    e,    6,   6,     e,    e,    e,    e,    e,    e,    e,    e,    e,    e,    e,        e},      //q5
                                   {e,    e,    e,   e,     7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    e,        e},      //q6
                                   {e,    e,    e,   e,     7,    7,    7,    7,    7,    7,    7,    7,    7,    7,    decimal,  decimal},//q7
                            },
        matriztransicion05[][] = {//$      _      ,      ;      =      a-z      A-Z      0-9        " "      Entrega
                                   {e,     e,       e,     e,     e,       2,       1,       e,         e,       e}, //q0
                                   {1,     1,       6,     6,     6,       1,       1,       1,         4,       e},//q1
                                   {2,     2,       8,     8,     8,       2,       2,       2,         7,       e},//q2
                                   {3,     3,      11,    11,    11,       3,       3,       3,        10,       e},//q3
                                   {e,     e,       5,     5,     5,       e,       e,       e,         e,       e},//q4
                                   {e,     e,       e,     e,     e,       e,       e,       e,         e,       valido},//q5
                                   {e,     e,       e,     e,     e,       e,       e,       e,         e,       valido},//q6
                                   {e,     e,       9,     9,     9,       e,       e,       e,         e,       e},//q7
                                   {e,     e,       e,     e,     e,       e,       e,       e,         e,       valido},//q8
                                   {e,     e,       e,     e,     e,       e,       e,       e,         e,       valido},//q9
                                   {e,     e,      12,    12,    12,       e,       e,       e,         e,       e},//q10
                                   {e,     e,       e,     e,     e,       e,       e,       e,         e,       valido},//q11
                                   {e,     e,       e,     e,     e,       e,       e,       e,         e,       valido},//q12
                                };
                                                        

    public void g2_crearAutomata1(String palabra){ //Chugá Juan
        int q = 0;
        for(int indexchar = 0; indexchar < palabra.length(); indexchar++){
            int indexAlfa = getIndexAlfabeto(palabra.charAt(indexchar), alfabetosimple);
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
        System.out.println();
    }

    public void g2_crearAutomata3(String palabra){ //Chugá Juan
        int q = 0;
        for(int indexchar = 0; indexchar < palabra.length(); indexchar++){
            int indexAlfa = getIndexAlfabeto(palabra.charAt(indexchar), alfabetosimple);
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
        System.out.println();
    }
    
    public void g2_crearAutomata3REPETIDO(String palabra){ //Chugá Juan
        int q = 0;
        for(int indexchar = 0; indexchar < palabra.length(); indexchar++){
            int indexAlfa = getIndexAlfabeto(palabra.charAt(indexchar), alfabinario);
            if (indexAlfa < 0 || matrizTransicion03R[q][indexAlfa] == R){
                 q = R;
                break;}
            q = matrizTransicion03R[q][indexAlfa];
        }
        if(q == A1 || q == A2){
            System.out.println("Estado final: q" + q);
            System.out.println("Por tanto, se acepta la palabra");
        }
        else
            System.out.println("Por tanto, no se acepta la palabra");
        System.out.println();
    }

    public void g2_crearAutomata4(String entrada) { //Mayerli Chavez
    int q = 0;
    boolean esDecimal = false;

    for (int cifra = 0; cifra < entrada.length(); cifra++) {
        String digito = String.valueOf(entrada.charAt(cifra));
        int inderxAlfa = getIndexAlfabeto(digito);
        if (inderxAlfa < 0 || matriztransicion04[q][inderxAlfa] == e) {
            q = e;
            break;
        }
        q = matriztransicion04[q][inderxAlfa];
        if (q == decimal) {
            esDecimal = true;
        }
    }

    if (esDecimal || q == 4 || q == 7) {
        System.out.println("El numero ingresado es un numero decimal");
    } else {
        System.out.println("El numero ingresado no es numero decimal...");        
        System.out.println(" ");
        System.out.print("Ingrese una  nueva cifra: ");
        entrada = leer.nextLine().trim();
        g2_crearAutomata4(entrada);
    }
    System.out.println(" ");
}

    public void g2_crearAutomata5(String entrada2){ //Mayerli Chavez
        int q = 0;
        boolean esValido = false;

        for (int cifra = 0; cifra < entrada2.length(); cifra++) {
            String digito = String.valueOf(entrada2.charAt(cifra));
            int inderxAlfa = getIndexAlfabeto2(digito);
            if (inderxAlfa < 0 || matriztransicion05[q][inderxAlfa] == e) {
                break;
            }
            q = matriztransicion05[q][inderxAlfa];
            if (q == valido){
                esValido = true;
            }
        }
        if (esValido || q == 5 || q == 6 || q ==8 || q==9 || q==11 || q == 12) {
            System.out.println("La variable ingresada es valida");
        } else {
            System.out.println("La variable ingresada no es valida...");
            System.out.println(" ");
            System.out.print("Ingrese una  nueva variable: ");
            entrada2 = leer.nextLine();
            g2_crearAutomata5(entrada2);
        }
        System.out.println(" ");
    }

    @SuppressWarnings("resource")
    private int getIndexAlfabeto(char letra, String alfabeto) {
        Scanner scAlfabeto = new Scanner(alfabeto).useDelimiter("\\.");
        for (int indexAlfa = 0; scAlfabeto.hasNext(); indexAlfa++) {
            if (String.valueOf(letra).equals(scAlfabeto.next())) {
                return indexAlfa;
            }
        }
        return -1;
    }
   
    @SuppressWarnings("resource")
    private int getIndexAlfabeto(String digito){
        Scanner scAlfa = new Scanner(alfabeto).useDelimiter(";");
        for( int inderxAlfa = 0; scAlfa.hasNext(); inderxAlfa++){
            if(digito.equals(scAlfa.next()))
             return inderxAlfa;
        }
     return -1;
    }
   

    private int getIndexAlfabeto2(String digito) {
        char c = digito.charAt(0);

        if (c >= 'A' && c <= 'Z') return 6;  // Columna 5 para letras mayúsculas
        if (c >= 'a' && c <= 'z') return 5;  // Columna 4 para letras minúsculas
        if (c >= '0' && c <= '9') return 7;  // Columna 6 para dígitos
        switch (c) {
            case '$': return 0;   // Columna 0 para signo de dólar
            case '_': return 1;   // Columna 1 para guion bajo
            case ',': return 2;   // Columna 2 para coma
            case ';': return 3;   // Columna 3 para punto y coma
            case '=': return 4;   // Colunma 4 para el igual
            case ' ': return 8;   // Columna 7 para espacio
            default: return -1;   // Caracter no válido en el alfabeto
        }
    }

    public int g2_llamarAutomata2(String automata1) {
        int estado = 0;
        int columna;
        char caracter;
        int e = -1;

        int[][] mt = {
            {1, e, e},
            {e, 2, e},
            {e, 2, 3},
            {4, e, e},
            {e, e, e},
        };

        int contadorB = 0;

        for (int i = 0; i < automata1.length(); i++) {
            caracter = automata1.charAt(i);
            columna = g2_cambiarCaracter2(caracter);
            if (columna == -1 || mt[estado][columna] == e) {
                return -1;
            }
            estado = mt[estado][columna];

            if (estado == 2 && caracter == 'b') {
                contadorB++;
            }
        }

        if (estado == 4 && contadorB >= 1) {
            return 2;
        }
        return -1;
    }

    public void g2_crearAutomata2(String palabra) { //Anthony Gamboa
        int resultado = g2_llamarAutomata2(palabra);
        if (resultado == 2 || !palabra.contains(" ")) {
            System.out.println("La palabra es correcta");
        } else {
            System.out.println("La palabra es incorrecta");
        }
    }

    public int g2_cambiarCaracter2(char c) {
        switch (c) {
            case 'a': return 0;
            case 'b': return 1;
            case 'c': return 2;
            default: return -1;
        }
    }

    private static int[][] transitions = {
        
        {0, 1, 2, 3}, 
        {1, 1, 4, 5}, 
        {2, 4, 2, 6}, 
        {3, 5, 6, 3}, 
        {4, 4, 4, 7},
        {5, 5, 7, 5},
        {6, 7, 6, 6},
        {7, 7, 7, 7}
    };

    public void g2_crearAutomata7(String contraseña) {
        int estado = 0;

        for (char c : contraseña.toCharArray()) {
            if (Character.isUpperCase(c)) {
                estado = transitions[estado][1];
            } else if (Character.isDigit(c)) {
                estado = transitions[estado][2];
            } else if ("!@#$%^&*(),.?\":{}|<>".contains(String.valueOf(c))) {
                estado = transitions[estado][3];
            } else {
                continue;
            }

            if (estado == 7) {
                System.out.println("Contraseña Correcta");
            }
        }

        System.out.println("Contraseña incorrecta");
    }
}
