package conversor;

import java.util.Scanner;

public class MenuConversor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Scanner entradaDeci=new Scanner(System.in);

		boolean salir = false;
		String opcion;
		int decimal = 0;
		Conversor decOct= new Conversor();

		while (salir == false) {

			System.out.println("A. De base 10 a base 8");
			System.out.println("B. De base 10 a base 3");
			System.out.println("C. De base 4 a base 10");
			System.out.println("D. De base 7 a base 10");
			System.out.println("E. Salir");

			opcion = entrada.next();

			if (opcion.equalsIgnoreCase("A")) {
				
				
				System.out.println(decOct.decimalOctal());

			} else if (opcion.equalsIgnoreCase("B")) {
				System.out.println("opcion b");
			} else if (opcion.equalsIgnoreCase("E")) {
				System.out.println("salio del menu");
				salir = true;
			} else if (opcion != "A" || opcion != "B" || opcion != "C" || opcion != "D" || opcion != "E") {
				System.out.println("Opciones entre A y E");

			}

		}

	}

}
