
//programa que multiplique 2 numeros
package multiplicacio;

import java.util.Scanner;

public class Multiplicacio {

    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int num1;//Definimos una variable para el primer numero 
int num2;//Definimos una variable para el segundo numero
int mult;//Definimos una variable para el resultado

System.out.println("Digite el primer numero");
//Le pedimos al ususario que ingrese el primer numero
num1 = t.nextInt();
//Asignamos el valor ingresado a la variable
System.out.println("Digite segundo numero");
//Le pedimos al ususario que ingrese el segundo numero
num2 = t.nextInt();
//Asignamos el valor ingresado a la variable
mult=num1*num2;//hacemos la multiplicacion
System.out.println("El resultado de la multiplicacion de "+ num1 +" x "+ num2 +" es igual a "+ mult);

    }    
}
