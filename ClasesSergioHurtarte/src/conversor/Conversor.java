package conversor;

import java.util.Scanner;

public class Conversor {

	int cociente;
	int reciduo;
	int decimal;
	

	Scanner entrada = new Scanner(System.in);

	public Conversor() {

	}

	public String decimalOctal() {
		String acumulador = "";

		System.out.println("Ingrese decimal");
		this.decimal = entrada.nextInt();

		if (this.decimal != 0) {

			while (decimal >= 1) {

				reciduo = decimal % 8;
				cociente = decimal / 8;
				decimal = cociente;

				acumulador = reciduo + acumulador;

			}

			return acumulador;
		} else {
			return "" + 0;
		}
	}

	public String decimalAtres() {
		String acumulador = "";

		System.out.println("Ingrese decimal");
		this.decimal = entrada.nextInt();

		if (this.decimal != 0) {

			while (decimal >= 1) {

				reciduo = decimal % 3;
				cociente = decimal / 3;
				decimal = cociente;

				acumulador = reciduo + acumulador;

			}

			return acumulador;
		} else {
			return "" + 0;
		}

	}

	public String cuatroAdiez() {
		double resultado = 0;
		double acumulador = 0;
		int exponente = 0;
		int diferente = 0;

		String binario;
		
		System.out.println("Ingrese base 4");
		binario = entrada.next();

		for (int i = binario.length() - 1; i >= 0; i--) {

			char c = binario.charAt(i);

			if (c != '0' && c != '1' && c != '2' && c != '3') {
				diferente++;
				i = 0;

			}

			int numeroDecimal = Integer.parseInt(binario.substring(i, i + 1));

			resultado = numeroDecimal * (Math.pow(4, exponente));

			acumulador += resultado;
			exponente++;

		}
		if (diferente > 0) {
			return "Invalido";

		} else {

			return "" + acumulador;

		}

	}

	public String sieteAdiez() {
		double resultado = 0;
		double acumulador = 0;
		int exponente = 0;
		int diferente = 0;

		String binario;
		
		System.out.println("Ingrese base 7");
		binario = entrada.next();

		for (int i = binario.length() - 1; i >= 0; i--) {

			char c = binario.charAt(i);

			if (c != '0' && c != '1' && c != '2' && c != '3' && c != '4' && c != '5' && c != '6') {
				diferente++;
				i = 0;

			}

			int numeroDecimal = Integer.parseInt(binario.substring(i, i + 1));

			resultado = numeroDecimal * (Math.pow(7, exponente));

			acumulador += resultado;
			exponente++;

		}
		if (diferente > 0) {
			return "Invalido";

		} else {

			return "" + acumulador;

		}

	}
}
