//ingrese el nombre de 2 personas y diga cual es mayor

package anidado.libre;

import java.util.Scanner;

public class Quienesmayor {
    
    public static void main(String[] args) {
        
        Scanner t=new Scanner(System.in);
int num1;//Definimos las variable delos a evaluar
int num2;
String name1;//Definimos las variables donde se van a guardar los nombres
String name2;
System.out.println("Ingrese el nombre de una de las personas");
//le pedimos al usuario que ingrese un  nombre
name1 = t.nextLine();//aignamos el nombre ingresado a name1
System.out.println("Ingrese la edad de esta persona");
//le pedimos al usuario que Ingrese la edad de la persona
num1 = t.nextInt();//asignamos la edad ingresada a num1
System.out.println("Ingrese el nombre de la otra persona");
//le pedimos al usuario que ingrese el otro nombre
name2 = t.nextLine();//aignamos el nombre ingresado a name2
System.out.println("Ingrese la edad de esta persona");
//le pedimos al usuario que Ingrese la edad de la persona
num2 = t.nextInt();//asignamos la edad ingresada a num2
if (num1>num2){
    System.out.println(name1 +" es mayor que "+ name2);
}
   else {if (num1<num2){
    System.out.println(name2 +" es mayor que "+ name1);}
    else { System.out.println(name2 +" tiene la misma edad que "+ name1);
            }

}
    }
}