//programa que halle el cuadrado de un numero
import java.util.Scanner;
public class CuadradoNo {
    
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int num;//Definimos una variable para el numero 
int pot;//Definimos una variable para el resultado
System.out.println("Digite el numero para mostrar su cuadrado");
//Le pedimos al usuario que ingrese el numero
num = t.nextInt();
//Asignamos el valor ingresado a la variable
pot = num*num; //hacemos la operacion del cuadrado
System.out.println("La potencia cuadratica de "+ num +" es "+ pot);//Mostramos el resultado en pntalla
}
}