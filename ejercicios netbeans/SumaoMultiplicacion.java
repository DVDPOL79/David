//Determina si el primer numero es mayor que el segundo si es asi multiplicar de lo contrario sumar
import java.util.Scanner;

public class SumaoMultiplicacion {
    
    public static void main(String[] args) {
        
        Scanner t=new Scanner(System.in);
int num1;//Definimos las variable delos numeros a evaluar
int num2;
int res;//Dedinimos la variable del resultado
System.out.println("Digite el primer numero");
//Le pedimos al usuario que ingrese el primer numero
num1 = t.nextInt();
//Asignamos el valor ingresado a la variable
System.out.println("Digite segundo numero");
//Le pedimos al usuario que ingrese el segundo numero
num2 = t.nextInt();
//Asignamos el valor ingresado a la variable
if (num1>num2) {//si el primer numero es mayor se hara una multiplicacion y se imprimira el resultado
   res=num1*num2;
System.out.println("El resultado de la multiplicacion de "+ num1 +" x "+ num2 +" es igual a "+ res);
}
else { res=num1+num2;
System.out.println("El resultado de la suma de "+ num1 +" + "+ num2 +" es igual a "+ res);
     }
}
}