//Programa donde el usuario digite varios numeros positivos y varios negativos 
import java.util.Scanner;

public class ContarPositivosyNegativos {
    
    public static void main(String[] args) {
    Scanner t=new Scanner(System.in);
    int positivos = 0; //definimos una variable que cuente los numeros del positivos
    int negativos = 0; //otra los negativos
    int cero = 0; // y otra que cuente cuando se ingrese un 0
    int nums; // una variable que lea la cantidad de numeros a ingresar
    int num; // y una variable que lea cada numero ingresado
    System.out.println("Digite la cantidad de numeros a ingresar");//le pedimos al usuario que ingrese la cantidad de numeros a digitar
    nums = t.nextInt(); //asignamos el numero ingrseado a la variable nums 
    nums = nums + 1; //le sumamos 1 a nums 
    System.out.println("Ingrese los numeros"); //le pedimos al usuario que ingrese los numeros a evaluar
    for(int i=1;i<nums;i++) { //creamos un for que se ejecute desde 1 hasta un nums-1 (por eso le sumamos uno a nums)
    num = t.nextInt(); //cada ves que se ejecute el for se le pedira al usuario un numero para ser evaluado
    if (num>0) { //creamos un if que si los numeros ingresados son mayores a 0 
    positivos= positivos + 1; //se sume 1 a la variable positivos
    } else{ if (num<0){ //creamos un if que si los numeros ingresados son menores a 0
    negativos = negativos + 1; //se sume 1 a la variable negativos
    }else { cero = cero + 1; //de lo contrario quiere decir que el numero ingresado es 0 y se le sumara a cero +1
    }
    }
    }
    System.out.println("Los numeros positivos son "+ positivos);//se mostrara en pantalla las veces que un numero ingresado fue mayor a 0
    System.out.println("Los numeros negativos son "+ negativos);//se mostrara en pantalla las veces que un numero ingresado fue menor a 0
    System.out.println("Los numeros iguales a 0 son "+ cero);//se mostrara en pantalla las veces que un numero ingresado fue igual a 0
    }
}
