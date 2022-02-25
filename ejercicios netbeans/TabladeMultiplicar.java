
import java.util.Scanner;


public class TabladeMultiplicar {
    public static void main(String[] args) {   
     Scanner t=new Scanner(System.in);
     int num;//creamos una variable para el nmumero a investigar
     int tabla;//creamos una variable para los resultados
     System.out.println("Ingrese el numero a mostrar");//le pedimos al usuario el numero
     num = t.nextInt();//Asignamos el valor ingresado a la variable
     for (int i=1 ; i<11 ; i++){ //creamos un for que genero los numeros del 1 al 10
     tabla = num*i;//multiplicamos por el valor de i para conseguir el resultado por cada numero
     System.out.println(num +" x "+ i +" = "+ tabla);} //mostramos el factor por el valor de i
}
}