//Programa que calcula la suma, la multiplicacion y la media de 4 numeros
import java.util.Scanner;
public class SumaProductoMedia {
     public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int num1;//Definimos una variable para el primer numero 
int num2;//Definimos una variable para el segundo numero
int num3;//Definimos una variable para el tercero numero
int num4;//Definimos una variable para el cuarto numero
int sum;//Definimos una variable para el resultado de la suma
int mult;//Definimos una variable para el resultado de la multiplicacion
int media;//Definimos una variable para el resultado de la media

System.out.println("Digite el primer numero");
//Le pedimos al ususario que ingrese el primer numero
num1 = t.nextInt();
//Asignamos el valor ingresado a la variable
System.out.println("Digite segundo numero");
//Le pedimos al ususario que ingrese el segundo numero
num2 = t.nextInt();
//Asignamos el valor ingresado a la variable
System.out.println("Digite el tercer numero");
//Le pedimos al ususario que ingrese el tercer numero
num3 = t.nextInt();
//Asignamos el valor ingresado a la variable
System.out.println("Digite el cuarto numero");
//Le pedimos al ususario que ingrese el cuarto numero
num4 = t.nextInt();
//Asignamos el valor ingresado a la variable
sum = num1+num2+num3+num4; //Sumamos todos los terminos para conseguir la variable sum
mult = num1*num2*num3*num4; //Multiplicamos todos los numeros para conseguir la variable mult
media = sum/4;//usamos la suma de todos los numeros y la dividimos en la cantidad de numeros para consegir el promedio
System.out.println("La suma de "+ num1 +" + "+ num2 +" + "+ num3 +" + "+ num4 +" es igual a "+ sum);//mostramos en pantalla la suma de los numeros
System.out.println("La multiplicacion de "+ num1 +" x "+ num2 +" x "+ num3 +" x "+ num4 +" es igual a "+ mult);//mostramos en pantalla la multiplicacion de los numeros
System.out.println("La media de "+ num1 +", "+ num2 +", "+ num3 +" y "+ num4 +" es igual a "+ media);//mostramos en pantalla la suma de los numeros
}
}