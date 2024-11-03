package figuras;

public class Figuras {
    public void g2_crearFigura3(int filas){ //Chugá Juan
        for(int numero_fila = 1; numero_fila <= filas; numero_fila++){
            for(int index = 0; index < numero_fila; index++)
                System.out.print("* ");
            System.out.println();
        }
    }

    public void g2_crearFigura10(int filas){ //Chugá Juan
        char caracteres [] = {'-', '+'};

        for(int numero_fila = 1; numero_fila <= filas; numero_fila++){
            if(numero_fila == 1){
                System.out.println("_+_");
            }
            else if(numero_fila > 1 && numero_fila < filas){
                System.out.println((" ".repeat(3 + 4*(numero_fila-2))) + "|_" + caracteres[(numero_fila%2)] + "_");
            } else{
                System.out.println(((" ".repeat(3 + 4*(numero_fila-2))) + "|"));
            }
        }
    }

    public void g2_crearFigura15(int tamanio){ //Chugá Juan
        int [][] arbol_Pascal = new int[tamanio][tamanio];
        arbol_Pascal[0][0] = 1;
        System.out.println(arbol_Pascal[0][0]);

        for(int fila = 1; fila < tamanio; fila++){
            for(int columna = 0; columna < tamanio; columna++){
                if(columna == 0)
                    arbol_Pascal[fila][columna] = 1;
                else
                    arbol_Pascal[fila][columna] = arbol_Pascal[fila-1][columna-1] + arbol_Pascal[fila - 1][columna];
                if(arbol_Pascal[fila][columna] != 0)
                    System.out.print(arbol_Pascal[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public void g2_crearFigura17(int tamanio){ //Chugá Juan
        for(int fila = 0; fila < tamanio; fila++)
        {
            for(int columna = 0; columna < tamanio; columna++){
                if((fila == columna || fila + columna == tamanio - 1)){
                    if(fila%2 == 0)
                        System.out.print("1 ");
                    else
                        System.out.print("0 ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    public void g2_crearFigura18(int tamanio){ //Chugá Juan
        int [][] arbol_Pascal = new int[tamanio][tamanio];
        arbol_Pascal[0][0] = 2;
        System.out.println(arbol_Pascal[0][0]);

        for(int fila = 1; fila < tamanio; fila++){
            for(int columna = 0; columna < tamanio; columna++){
                if(columna == 0)
                    arbol_Pascal[fila][columna] = 1;
                else
                    arbol_Pascal[fila][columna] = arbol_Pascal[fila-1][columna-1] + arbol_Pascal[fila - 1][columna];
                if(arbol_Pascal[fila][columna] != 0)
                    System.out.print(arbol_Pascal[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
