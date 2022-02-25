//Programa que halle el maximo com un divisor de 2 numeros
import java.util.Scanner;
public class maximoComounDivisor {
   public static void main(String[] args) {
       Scanner t=new Scanner(System.in);
        int a;//Creamos una variable para el primer numero 
        int b;//Y para el segundo numero
        System.out.println("Ingrese un numero");//le pedimos al usuario que ingrese un numero
        a = t.nextInt();//asignamos el numero ingresado a la variable a
        System.out.println("Ingrese el otro numero");//le pedimos al usuario que ingrese el otro numero
        b = t.nextInt();//asignamos el numero ingresado a la variable b
        int mcd = maximoComunDivisor(a, b); //llamamos la accion maximoComunDivisor
        System.out.printf("El MCD de %d y %d es %d\n", a, b, mcd);//ponemos el resultado
       
   }        
public static int maximoComunDivisor(int a, int b) { //creamos la clase maximoComunDivisor
        int c;//creamos una variable para guardar temporalmente a b
        while (b != 0) { //obtenemos el residuo de dividir a entre b y lo guardamos en b
            c = b;
            b = a % b;
            a = c;//en donde a es el primer número y b el segundo (de los que queremos obtener el máximo común divisor) hasta que b sea cero
        }
        return a;//regresamos el valor de a
    }
}
     

