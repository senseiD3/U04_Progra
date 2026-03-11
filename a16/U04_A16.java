package a16;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class U04_A16 {
    
    //Realizamos la contraseña con numeros aleatoriosdel 1 al 5, el bucle esta sacado del ejercicio 1
    static int[] realizarContraseña(int longitud){
        Random random = new Random();
        int t[] = new int [longitud];
        
        for (int n = 0 ; n < longitud; ++n){
            int r = random.nextInt(4) + 1;
            t[n] = r;
        }
        
        return t;
    }
    
    static boolean mayorMenor (int digito, int valorReal){  //Con los dos valores que tenemos, el digito introducido y el valor real voy a ver si
        boolean valido = false;                             //es mayor, menor o si es igual (en cuyo caso mandar un true para cerrar el bucle)
        
        if (digito == valorReal){
            valido = true;
            System.out.println("Digito correcto");
        }   else{
                if (digito > valorReal){
                    System.out.println("El digito introducido es mayor");
                }   else{
                        System.out.println("El digito introducido es menor");
                }
        }
        
        return valido;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        //Digo la longitud tendrá la combinacion
        System.out.println("Como de dificil quieres la combinacion, ten en cuenta que los numeros van del 1 al 5: ");
        int longitud = sc.nextInt(); 
        System.out.println("Ahora intenta adivinar la contraseña digito a digito: ");
        int codigo[] = new int [longitud];
        
        //Llamo al metodo para realizar la contraseña y lo guardo en la variable contraGenerada
        int contraGenerada[] = realizarContraseña(longitud);
        
        //En este doble bucle voy a pedir un numero y llamare a un metodo para cotejar si el numero concuerda con el de la tabla de la contraseña
        //Si es correcto me devolverá un true y se sumara el contador (pasamos a la siguiente celda de la tabla)
        for (int cont = 0; cont < longitud; ++cont){
            do{
                codigo[cont] = sc.nextInt();
            } while (mayorMenor(codigo[cont], contraGenerada[cont]) != true);
        }
        
        System.out.println("CORRECTO, la contraseña era: " + Arrays.toString(codigo));
    }
}