//Determinar si un numero es positivo o negativo
package positivo.o.negativo;

import java.util.Scanner;
public class PositivoONegativo {

    
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int num;//Definimos la variable del numero a evaluar
System.out.println("Digite el numero a evaluar");//le pedimos el numero al usuario
num = t.nextInt();//Asignamos el valor ingresado a la variable
    if (num<0){
        System.out.println("El numero ingresado es negativo");//Si el numero es menor a 0 se imprime que es negativo
    }
    else { if (num>0){
        System.out.println("El numero ingresado es positivo");//Si el numero es mayor a 0 se imprime que es negativo
    }
    else { System.out.println("El numero es igual a cero");//sino el numero sera 0 y se imprime eso
    }
    }
    }
}

