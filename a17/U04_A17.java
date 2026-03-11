package a17;

import java.util.Arrays;

public class U04_A17 {
    public static void main (String[] args){
        int tabla[][] = new int [5][5];
        
        for (int fila = 0; fila != tabla.length; ++fila){
            int columna = 0;
            do{
               tabla[fila][columna] = (fila * 10) + columna;
                ++columna;
            } while (columna != tabla[0].length);
        }
        System.out.println(Arrays.deepToString(tabla));
    }
}