//programa que sume los 10 primeros numeros primos
public class l10primos {
    
    public static void main(String[] args) {
    int sumatoria = 0;//Definimos una variable donde se guardaran los numeros primos y el resultado de la suma
   
    for (int i=1 ; i<30 ; i++)//hacemos un for que recorra los numeros del 1 al 30 que es donde se encuentran los numeros los 10 primeros numeros primos
    {
        int contador=0;//creeamos una variable llamada contador que haga cada vez que se inicie el for anterior inicio desde cero
       for (int j=1;j<=i;j++) // hacemos un for que recorra los numeros de 1 hasta el ultimo valor de la variable i
       {
           if(i%j==0) {//creamos un if que revisa el residuo de i/j sea igual a 0
               contador++;} //si es asi se le sumara 1 a contador 
           else {} //de lo contrario no se le sumara
       }
       if (contador==2) {//creamos un if que revisara si la variable contador despues de que se le sumo en el if anterior es igual a 0
           sumatoria = sumatoria + i; //si es el caso se le sumaria el valor de i actual el cual tendra el valor de un numero primo
    }
       else {} //si el numero no es primo el if no se ejecutara y no sera sumado
}
    System.out.println("La suma de los 10 primeros numeros es "+ sumatoria); // por ultimo se mostrara el total de la suma en pantalla mostrando asi la suma de los primeros numeros primos
    //NOTA esto debe de estar afuera de los for para que solo sea ejecutado una vez
}
}
