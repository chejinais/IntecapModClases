package calculadora;

import java.util.Scanner;

public class MenuCalculadora {

	public static void main(String[] args) {
		boolean salir=false;
		int opcion=0;
		int valor1=0;
		int valor2=0;
		int valor3=0;
		int valor4=0;
		
		
		Scanner entrada= new Scanner(System.in);
		
		System.out.println("Ingrese valor 1");
		valor1=entrada.nextInt();
		
		
		System.out.println("Ingrese valor 2");
		valor2=entrada.nextInt();
		System.out.println("Ingrese valor 3");
		valor3=entrada.nextInt();
		System.out.println("Ingrese valor 4");
		valor4=entrada.nextInt();
		
		while(salir==false) {
			
			Calculadora micalculadora = new Calculadora(valor1,valor2,valor3,valor4);
			
			System.out.println("1. Sumar");
			System.out.println("2. Restar");
			System.out.println("3. Multiplicar");
			System.out.println("4. Promedio");
			System.out.println("5. Mayor");
			System.out.println("6. Menor");
			System.out.println("7. Salir");
			opcion=entrada.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("El resultado de la suma es " + micalculadora.sumar());
				break;
				
			case 2:
				System.out.println("El resultado de la resta es " + micalculadora.restar());
				
				break;
			case 3:
				System.out.println("El resultado de la multiplicacion es " + micalculadora.multiplicar());
				
				break;
				
			case 4:
				System.out.println("El promedio es " + micalculadora.promedio());
				
				break;
				
			case 5:
				System.out.println("El mayor es " + micalculadora.mayor());
				
				break;
				
			case 6:
				System.out.println("El menor es " + micalculadora.menor());
				
				break;
			
			case 7:
				System.out.println("Salio del menu");
				salir=true;
				break;
				
				default:
					System.out.println("Solo opciones entre 1  y  7 ");
				
			}	
			
			
			
		}

	}

}
