
import java.util.Scanner;

//Programa que convierte Centigrados Farenheit
public class CentigradosaFarenheit {
    
     public static void main(String[] args) {
        Scanner t=new Scanner(System.in);
int centi;//Definimos una variable para los centigrados 
int fareh;//Definimos una variable para los farenheit
System.out.println("Ingrese los Grados Celsius");//Le pedimos al usuario que ingrese la temperatuta a convertir
centi = t.nextInt();//Asignamos el valor ingresado a la variable
fareh = (centi*9/5) + 32;//usamos la formula de conversion para hallar el resultado
System.out.println(centi + " Grados Celsius son igual a "+ fareh +" Grados Fahrenheit");//Mostramos el resultado en pantalla
}
}
