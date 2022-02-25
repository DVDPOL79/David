package studyTool;

import java.util.Scanner;

public class PruebaCuenta 
{
	
	public static void main(String[] args) 
	{
		Cuenta cuenta1= new Cuenta (50.00);
		Cuenta cuenta2= new Cuenta (-7.53);
		
		
		System.out.printf("saldo de cuenta1: $%.2f\n",
				cuenta1.obtenerSaldo());
		System.out.printf("saldo de cuenta2: $%.2f\n",
				cuenta1.obtenerSaldo());
	
	
		Scanner entrada = new Scanner (System.in);
		double montoDeposito;
		
		System.out.println("Escriba el monto a depositar para la cuenta1");
		montoDeposito = entrada.nextDouble();
		System.out.printf("\n sumando %.2f al saldo de a cuenta1\n\n ",
				montoDeposito);
		cuenta1.abonar(montoDeposito);
		
		//muestra los saldos
		System.out.printf("Saldo de cuenta1: $%.2f\n",
				cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n",
				cuenta2.obtenerSaldo());
	
		System.out.print("escriba el monto a depositar para cuenta2: " );
		montoDeposito = entrada.nextDouble();
		System.out.printf("\nsumando %.2f al saldo de cuenta2\n\n",
				montoDeposito);
		cuenta2.abonar(montoDeposito);
		
		//muestra los saldos
		System.out.printf("Saldo de cuenta1: $%.2f\n",
				cuenta1.obtenerSaldo());
		System.out.printf("Saldo de cuenta2: $%.2f\n",
				cuenta2.obtenerSaldo());
	
	}

}
