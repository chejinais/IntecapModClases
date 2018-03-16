package conversor;

import java.util.Scanner;

public class Conversor {
	
	int cociente;
	int reciduo;
	int decimal;
	String acumulador="";
	
	Scanner entrada=new Scanner(System.in);
	
	public Conversor() {
		
	}
	
	public String decimalOctal() {
		
		
		
		System.out.println("Ingrese decimal");
		this.decimal=entrada.nextInt();
		cociente=decimal;
		
		while(decimal>=1) {
			
			
			
			reciduo=decimal%8;
			cociente=decimal/8;
			decimal=cociente;
			
			
			acumulador=reciduo+acumulador;
			
			
			
			
			
			
	
			
			
		
		
			
		}
		
		
		
		
		
		
		return acumulador;
	}
	
	

}
