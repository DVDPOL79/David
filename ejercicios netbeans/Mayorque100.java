//Determinar si un numero es mayor o menor a 100
package mayorque100;

import java.util.Scanner;
public class Mayorque100 {

    
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int num;//Definimos la variable del numero a evaluar
System.out.println("Digite el numero a evaluar");//le pedimos el numero al usuario
num = t.nextInt();//Asignamos el valor ingresado a la variable
    if (num<100){
        System.out.println("El numero ingresado es menor a 100");//Si el numero es menor a 100 se imprime que es menor
    }
    else { if (num>100){
        System.out.println("El numero ingresado es mayor a 100");//Si el numero es mayor a 100 se imprime que es mayor
    }
    else { System.out.println("El numero es igual a 100");//sino se imprime que el nemero es igual a 100
    }
    }
    }
}

