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
}
