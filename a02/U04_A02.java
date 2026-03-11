package a02;

import java.util.Scanner;
import java.util.Arrays;

public class U04_A02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 5 numeros decimales: ");
        
        double t[] = new double[5];
        
        for (int n = 0; n < t.length; ++n){
            double decimal = sc.nextDouble();
            t[n] = decimal;
        }
        
        System.out.println(Arrays.toString(t));
    }
}