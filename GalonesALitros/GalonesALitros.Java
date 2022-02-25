package studyTool;

import java.util.Scanner;

public class galonesLitros {

	public static void main(String[] args) {
		Scanner scanterm = new Scanner(System.in);
		float litros, galones;
		System.out.println("Ingrese la cantidad de galones");
		galones=scanterm.nextFloat();
		litros=galones*3.785f;
		System.out.println("Los Litros son: "+ litros);
	}

}
