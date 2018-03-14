package planilla;

import java.util.Scanner;

public class MenuPlanilla {

	public static void main(String[] args) {
		boolean salir = false;
		Empleado miEmpleado = null;
		Scanner entrada = new Scanner(System.in);
		int opcion = 0;

		while (salir == false) {

			System.out.println("1. Ingresar datos");
			System.out.println("2. Ver datos");
			System.out.println("3. Calcular igss");
			System.out.println("4. Obtener sueldo");
			System.out.println("5. Aumento");
			System.out.println("6. Salir");

			opcion = entrada.nextInt();

			switch (opcion) {
			case 1:
				  
					  miEmpleado=new Empleado("1", "Sergio", "Hurtarte", "1234567",2000.00,250.00);
			       
				
						
				
				

				break;

			case 2:
				 try{
					 System.out.println(miEmpleado.getDatos());
					 
			            
			        }
			        catch (Exception e) { 
			        	
			        	System.out.println(e.getCause());
			        
			        	
			        	System.out.println("No a ingresado datos de empleado"); 
			        	}
			      
				
				

				break;
			case 3:
				System.out.println("El igss es " + miEmpleado.getDescuento());
				
				
				break;
			case 4:
				System.out.println("El Sueldo liquido es " + miEmpleado.getSueldoTotal());
				
				
				break;
				
			case 5:
				System.out.println("El nuevo sueldo base es  " + miEmpleado.aumento());
				
				
				break;

			case 6:
				System.out.println("Salio del menu");
				salir = true;
				break;

			default:
				System.out.println("Solo opciones entre 1  y  6 ");
			}

		}

	}

}
