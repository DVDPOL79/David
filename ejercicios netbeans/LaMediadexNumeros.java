
import java.util.Scanner;

//Programa que halle la media de tantos numeros
public class LaMediadexNumeros {

    public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    int nums; //aignamos una variable para la cantidad de numeros a ingresar 
    int num; //asignamos una variable que lea cada numero
    int media = 0; //asignamos una variable donde se guarda el resultado
    System.out.println("Digite la cantidad de numeros a ingresar");//le pedimos al usuario que ingrese la cantidad de numeros a digitar
    nums = t.nextInt(); //asignamos el numero ingrseado a la variable nums 
    nums = nums + 1; //le sumamos 1 a nums 
    System.out.println("Ingrese los numeros"); //le pedimos al usuario que ingrese los numeros a evaluar
    for(int i=1;i<nums;i++) { //creamos un for que se ejecute desde 1 hasta un nums-1 (por eso le sumamos uno a nums)
    num = t.nextInt(); //cada ves que se ejecute el for se le pedira al usuario un numero para ser evaluado
    media = media + num; //cada numero ingresado sera sumado a la media para tener el total de los terminos
}
    nums = nums-1; //le restamos el 1 que le sumamos al empezar para tener el numero real de terminos ingresados
    media = media/nums; //a media(el total de la suma de los terminos) le dividimos nums(la cantidad de terminos ingresados)
    System.out.println("El resultado de la media es "+ media); //Mostramos en pantalla la respuesta al ejejrcicio anterior
    
}
}