//Programa que calcule el area de un triangulo
import java.util.Scanner;

public class AreadeunTriangulo {
    
    public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int alt;//Definimos una variable para la altura
int base;//Definimos una variable para la base
int area;//Definimos una variable para el area
    System.out.println("Ingrese la altura del triangulo");
//Le pedimos al ususario que ingrese la altura del triangulo
alt = t.nextInt();
//Asignamos el valor ingresado a la variable
System.out.println("Ingrese la base del triangulo");
//Le pedimos al ususario que ingrese la base del triangulo
base = t.nextInt();
//Asignamos el valor ingresado a la variable
area = (base*alt)/2;//ponemos la formula para el area de un triangulo
System.out.println("El area del triangulo es "+ area); //mostramos en pantalla el resultado de la operacion
    }
}
