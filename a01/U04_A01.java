package a01;

import java.util.Arrays;
import java.util.Random;

public class U04_A01 {
    public static void main(String[] args) {
        Random random = new Random();
        int t[] = new int [10];
        int suma = 0;
        
        for (int n = 0 ; n < t.length; ++n){
            int r = random.nextInt(99) + 1;
            t[n] = r;
            suma += t[n];
        }
        
        System.out.println(Arrays.toString(t) + "La suma total es: " + suma);
    }
}