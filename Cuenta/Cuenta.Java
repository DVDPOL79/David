//la clase cuenta con un constructor para inicializar la variable de
// instancia saldo
package studyTool;

public class Cuenta 
{
	private double saldo; //variable de instancia que almaneca el saldo

	//constructor
	public Cuenta (double SaldoInicial) 
	{
		//Valida que SaldoInicila sea mayor que 0.0
		//si no lo es,saldo se inicializa con el valor prederteminado 0.0
		if (SaldoInicial>0.0)
			saldo = SaldoInicial;
	}
	
	//abona (suma) un monto a la cuenta
	public void abonar (double monto) 
	{
		saldo = saldo + monto; 
	}
	
	//devuelve el saldo de la cuenta 
	public double obtenerSaldo()
	{
		return saldo;
	}
}
