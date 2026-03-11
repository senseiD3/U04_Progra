package a03;

import java.util.Scanner;
import java.util.Arrays;

public class U04_A03 {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos numero quieres introducir: ");
        int cantidad = sc.nextInt();
        int t[] = new int [cantidad];
        System.out.println("Dame los numeros enteros: ");
        
        for (int n = t.length - 1; n > -1; --n){
            int num = sc.nextInt();
            t[n] = num;
        }
        
        System.out.println(Arrays.toString(t));
    }
}