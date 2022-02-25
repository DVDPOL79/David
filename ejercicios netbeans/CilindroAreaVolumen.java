
import java.util.Scanner;

class CilindroAreaVolumen {

 public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int radio;//Definimos una variable para el radio 
int altura;//Definimos una variable para la altura
int area;//definimos una variable para el area
int volumen;//definimos una variable para el volumen
double pi = Math.PI;
System.out.println("Ingrese la altura del cilindro");
altura = t.nextInt();//Asignamos el valor ingresado a la variable
System.out.println("Ingrese el radio del cilindro");
radio = t.nextInt();//Asignamos el valor ingresado a la variable
area =  (int) (2*pi*radio*altura + 2*radio*radio);
volumen = (int) (pi*radio*radio*altura);
System.out.println("El area total de circulo es "+ area);
System.out.println("El Volumen de circulo es "+ volumen);
 }
};

