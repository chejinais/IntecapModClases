package calculadora;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Calculadora {
	
	private int valor1;
	private int valor2;
	private int valor3;
	private int valor4;
	private int resultado;
	int [] miArreglo =new int[4];
	public Calculadora(int valor1, int valor2, int valor3, int valor4) {
		super();
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
		this.valor4 = valor4;
		miArreglo[0]=valor1;
		miArreglo[1]=valor2;
		miArreglo[2]=valor3;
		miArreglo[3]=valor4;
		Arrays.sort(miArreglo);
		
	}
	public int getValor1() {
		return valor1;
	}
	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}
	public int getValor2() {
		return valor2;
	}
	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}
	public int getValor3() {
		return valor3;
	}
	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}
	public int getValor4() {
		return valor4;
	}
	public void setValor4(int valor4) {
		this.valor4 = valor4;
	}
	
	public int sumar() {
		
		resultado=valor1+valor2+valor3+valor4;
		
		return resultado;
	}
	public int restar() {
		
		resultado=valor1-valor4;
		
		return resultado;
	}
	
public int multiplicar() {
		
		resultado=valor1*valor2*valor3*valor4;
		
		return resultado;
	}

public int promedio() {
	
	resultado=(valor1+valor2+valor3+valor4)/4;
	
	return resultado;
}
	
public int mayor() {
	
	
	
	return miArreglo[3];
}

public int menor() {



return miArreglo[0];
}
	
	

	
	
	

}
