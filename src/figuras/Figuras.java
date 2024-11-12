package figuras;

public class Figuras {

    public void g2_crearFigura1(int tamanioCuadrado) { //Gamboa Anthony
        System.out.println();
        for(int i = 0; i < tamanioCuadrado; i++){
            for(int j = 0; j < tamanioCuadrado; j++){
                if((i == 0 || j == 0)||(i == tamanioCuadrado-1)||(j == tamanioCuadrado-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }

    public void g2_crearFigura2(int tamanio){ //Fuentes Carlos
        System.out.println();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i == 0 || i == tamanio -1 || j == 0 || j == tamanio - 1) {
                    if((i + j) % 2 == 0)
                        System.out.print("* ");
                    else
                        System.out.print("+ ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void g2_crearFigura3(int filas){ //Chugá Juan
        System.out.println();
        for(int numero_fila = 1; numero_fila <= filas; numero_fila++){
            for(int index = 0; index < numero_fila; index++)
                System.out.print("* ");
            System.out.println();
        }
    }
    
    public void g2_crearFigura4(int tamanio){ //Fuentes Carlos
        System.out.println();
        for (int i = 0; i < tamanio; i++) { 
            for (int j = 0; j < tamanio - i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public void g2_crearFigura5(int tamanio){ //Mayerli Chavez
        System.out.println();
        for(int fila = tamanio; fila > 0 ; fila --){
            for(int espacios = 0; espacios < tamanio - fila; espacios ++){
                System.out.print("  ");
            }
            for( int asteriscos = 0; asteriscos < (2*fila)-1; asteriscos ++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println();
    }

    public void g2_crearFigura6(int tamanioRombo){//Gamboa Anthony
        System.out.println();
        for(int i= 0; i < tamanioRombo; i++){
            for(int j = 0; j < tamanioRombo - i -1; j++){
                System.out.print("  ");
            }
            for(int k = 0; k < 2 * i + 1; k++){
                 System.out.print("* ");
            }
                 System.out.println();
            }   
    }

    public void g2_crearFigura7(int tamanio){ //Mayerli Chavez
        System.out.println();
        for(int fila = 0 ; fila <= tamanio - 2; fila ++){
            for( int columna =0; columna <= fila *2; columna ++){
                while( columna == 0 && fila == 0){
                    System.out.print("__");
                    System.out.println("");
                    columna ++;
                }
                System.out.print("  ");
            }
            System.out.print("|__");
            System.out.println("");
        }
        System.out.println();
    }

    public void g2_crearFigura8(int tamanioEscaleras){//Gamboa Anthony
        System.out.println();
        for(int i = 0; i < tamanioEscaleras; i++){
            for(int j = 0; j < tamanioEscaleras - i -1; j++){
                System.out.print("   ");
            }
            System.out.print("__");
            System.out.print("|");
            System.out.println();
        }
    }

    public void g2_crearFigura9(int tamanio){ //Fuentes Carlos
            for(int i = 0; i < tamanio; i++){
                System.out.print("    ");
            }
            tamanio--;
            System.out.println("___");
            for (int i = tamanio; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("    ");
                }
                    System.out.print("___|");
                for (int j = 0; j < tamanio - i; j++) {
                    System.out.print("    ");
                }
                System.out.print("   ");
                for (int j = 0; j < tamanio - i; j++) {
                    System.out.print("    ");
                }
    
                    System.out.print("|___");
                    System.out.println();
            }
            System.out.println();
        }
   
    public void g2_crearFigura10(int filas){ //Chugá Juan
        System.out.println();
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
    
    public void g2_crearFigura11(int tamanio){ //Fuentes Carlos
        System.out.println();
        System.out.println("|_");
        int aux = 0;
        for (int x = 2; x <= tamanio; x++) {
            aux = aux + x;
            for (int i = 0; i < aux; i++) {
                System.out.print(" ");
            }
                System.out.print("|");

            for (int j = 0; j < x; j++) {
                System.out.print("_");
            }
                System.out.println();
            }
    }
    
    public void g2_crearFigura12(int tamanio){ //Mayerli Chavez
        System.out.println();
        for (int fila = 0; fila  <= tamanio; fila++) {
            for (int columna = 1; columna <= tamanio - fila ; columna++) {
                System.out.print(columna);
            }
            System.out.println("");
        }
    }

    public void g2_crearFigura13(int tamanio){ //Mayerli Chavez
            for (int fila = tamanio ; fila >= 0; fila--) {
                for (int columna = 1; columna <= tamanio - fila; columna++) {
                    System.out.print(columna);
                }
                System.out.println("");
            } 
            System.out.println();
    }
    
    public void g2_crearFigura14(int tamanio){ //Fuentes Carlos
        System.out.println();
        for (int i = 0; i < tamanio; i++) {
            
            for (int j = 0; j < tamanio - i - 1; j++) {
                System.out.print("   ");
            }
    
            int cont = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(cont + "  ");
                cont = cont * (i - j) / (j + 1);
            }

            cont = 1;
            for (int j = i; j > 0; j--) {
                cont = cont * j / (i - j + 1);
                System.out.print(cont + "  ");
            }
    
                System.out.println();
        }
    }

    public void g2_crearFigura15(int tamanio){ //Chugá Juan
        System.out.println();
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

    public void g2_crearFigura16(int tamanioCruz){//Gamboa Anthony
        System.out.println();
        for(int i = 0; i < tamanioCruz; i++){
            for(int j = 0; j < tamanioCruz; j++){
                if((i == j)||( i+ j == tamanioCruz -1)){
                    if(i % 2 == 0){
                    System.out.print("+ ");    
                    }else{
                    System.out.print("- ");    
                    }
                }else{
                    System.out.print("  ");
                }  

            }
            System.out.println();
        }
    }
  
    public void g2_crearFigura17(int tamanio){ //Chugá Juan
        System.out.println();
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
        System.out.println();
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

    public void g2_crearFigura19(int tamanio){ //Chugá Juan
        System.out.println();
        int [][] arbol_Pascal = new int[tamanio][tamanio];
        arbol_Pascal[0][0] = 2;
        System.out.println("*");

        for(int fila = 1; fila < tamanio; fila++){
            for(int columna = 0; columna < tamanio; columna++){
                if(columna == 0)
                    arbol_Pascal[fila][columna] = 1;
                else
                    arbol_Pascal[fila][columna] = arbol_Pascal[fila-1][columna-1] + arbol_Pascal[fila - 1][columna];
                if(arbol_Pascal[fila][columna] != 0)
                {
                    if(arbol_Pascal[fila][columna] == 1)
                    {
                        System.out.print("+ ");
                    }
                    else if(arbol_Pascal[fila][columna] == 2)
                    {
                        System.out.print("* ");
                    }
                    else{
                        System.out.print(arbol_Pascal[fila][columna] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    
}
