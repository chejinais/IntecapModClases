package tv;

import java.util.Scanner;

public class MenuTv {

	public static void main(String[] args) {

		int opcion = 0;
		Scanner entrada = new Scanner(System.in);
		boolean salida = false;
		Tv miTv=new Tv();

		while (salida == false) {

			System.out.println("1. Encender/apagar");
			System.out.println("2. Subir canal");
			System.out.println("3. Bajar canal");
			System.out.println("4. Subir volumen");
			System.out.println("5. Bajar volumen");
			System.out.println("6. Salir");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				System.out.println(miTv.Power());
					
				break;
			case 2:
				
				System.out.println(miTv.subirCanal());

				break;
			case 3:
				System.out.println(miTv.bajarCanal());

				break;
			case 4:
				System.out.println(miTv.subirVol());

				break;
			case 5:
				System.out.println(miTv.bajarVol());

				break;

			case 6:
				System.out.println("Salio del menu");
				salida = true;
				break;

			default:
				System.out.println("Solo opciones entre 1  y  6 ");
			}

		}

	}

}
