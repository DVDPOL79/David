import java.util.Scanner;
public class DolaresaPesos {
 public static void main(String[] args) {   
     Scanner t=new Scanner(System.in);
     int pesos;//Definimos una variable para los pesos
     int dolares;//Definimos una variable para los dolares
System.out.println("Ingrese la cantidad de dolares a convertir");//le pedimos al usuario que ingrese los dolares a convertir
dolares = t.nextInt();//Asignamos el valor ingresado a la variable
pesos = dolares*3778;//hacemos la conversion multiplicando por el valor del dolar actual
System.out.println(dolares +" dolares equivalen a "+ pesos +" pesos colombianos"); //mostramos en pantalla la conversion
 }
}