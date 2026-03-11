package a05;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class U04_A05 {
    static int[] rellenaPares(int largo, int fin){
        Random random = new Random();
        int t[] = new int [largo];
        int cont = 0;
        
        do {
            int valor = random.nextInt(fin);
            if (valor%2 == 0 && valor!=0){
                t[cont] = valor;
                ++cont;
            }
        } while (cont != largo);
        
        return t;
    }
    
    public static void main (String[] args){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Como de larga la quieres: ");
        int longitud = sc.nextInt();
        System.out.println("Cual es el rango maximo: ");
        int max = sc.nextInt();
        
        System.out.print(Arrays.toString(rellenaPares(longitud, max)));
    }
}