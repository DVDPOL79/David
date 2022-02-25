//determinar si un numero es par o impar
package anidado.libre;

import java.util.Scanner;
public class AnidadoLibre {

    public static void main(String[] args) {
        // pedimos al usuario que ingrese el numero a evaluar
        Scanner teclado; 
        int num;//declaramos el numero a usar
        teclado = new Scanner(System.in);
        System.out.println("Introduce un numero");
        num = teclado.nextInt();// se declara que el numero ingresado corresponde a la variable num 
        //se dice que si el numero es divisible por 2 es par sino es impar
        if(num%2==0) { System.out.println("El numero es par");
        else {
                System.out.println ("el numero es impar");
        }
    }
    }
}
