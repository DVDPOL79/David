
import java.util.Scanner;


public class Salario {

 public static void main(String[] args) {   
     Scanner t=new Scanner(System.in);
     int salario;//Definimos una variable para el salario
     int transporte = 32000;//Definimos una variable para el auxiliar de transporte
     int salud;//Definimos una variable para la salud 
     int pension;//definimos  una variable para la pension
System.out.println("Ingrese su salario");//le pedimos al usuario que ingrese su salario basico
salario = t.nextInt();//Asignamos el valor ingresado a la variable
salud = (int) (salario*0.12);//sacamos el 12% al salario para sacar la salud
pension = (int)(salario*0.16);//sacamos el 16% al salario para sacr la pension
salario = (salario+transporte)-(salud+pension); //sumamos el salario y el bonus de trasporte y le restamos la salu y la pension
System.out.println("El salario a pagar a el trabajador es "+salario); //por ultimo se muestra en pantalla el resultado de la operacion
}
}
