package automatas;

import java.util.Scanner;
public class Automatas {
    final String alfabetosimple = "a.b.c", alfabeto06 ="i.f.e.l.s.a.c.h.r.o.(.).";
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

        a = 100, b=200,c=300,d = 400,matrizTransicion06[][] ={ // i  f  e   l  s  a  c  h  r  (  )  o  E
                                                            {1, 10, R, R, R, R, R, R, R, R, R, R, R, R},
                                                            {R, 2 , R, R, R, R, R, R, R, R, R, R, R, R},
                                                            {R, R , 5, R, R, R, R, R, R, R, R, R, a, R},
                                                            {R, R , R, R, R, R, R, R, R, R, 4, R, b, R},
                                                            {R, R , R, R, R, R, R, R, R, R, R, R, c, R},
                                                            {R, R , 6, R, R, R, R, R, R, R, R, R, R, R},
                                                            {R, R , R, 7, R, R, R, R, R, R, R, R, R, R},
                                                            {R, R , R, R, 8, R, R, R, R, R, R, R, R, R},
                                                            {R, R , 9, R, R, R, R, R, R, R, R, R, R, R},
                                                            {R, R , R, R, R, R, R, R, R, R, R, R, d, R},
                                                            {R, R , R, R, R, R, R, R, R, R, R, 11,R, R},
                                                            {R, R , R, R, R, R, R, R, 12,R, R, R, R, R},
                                                            {R, R, 13, R, R, R, R, R, R, 3, R, R, R, R},
                                                            {R, R, R, R, R, 14, R, R, R, R, R, R, R, R},
                                                            {R, R, R, R, R, R, 15, R, R, R, R, R, R, R},
                                                            {R, R, R, R, R, R, R, 16, R, R, R, R, R, R},
                                                            {R, R , R, R, R, R, R, R, R, 3, R, R, R, R},
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
    public void g2_crearAutomata6(String palabra){ //Fuentes Carlos
        int q = 0;
        for(int indexchar = 0; indexchar < palabra.length(); indexchar++){
            int indexAlfa = getIndexAlfabeto06(palabra.charAt(indexchar));
            if (indexAlfa < 0 || matrizTransicion06[q][indexAlfa] == R){
                 q = R;
                break;}
            q = matrizTransicion03[q][indexAlfa];
        }
        if(q==a || q==b || q==c||q==d){
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
    private int getIndexAlfabeto06(char letra) {
        Scanner scAlfabeto06 = new Scanner(alfabeto06).useDelimiter("\\.");
        for (int indexAlfa = 0; scAlfabeto06.hasNext(); indexAlfa++) {
            if (String.valueOf(letra).equals(scAlfabeto06.next())) {
                return indexAlfa;
            }
        }
        return -1;
    }
}
