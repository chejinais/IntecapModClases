package planilla;

public class Empleado {
	
	private String codigoEmpleado;
	private String nombre;
	private String apellido;
	private String carnetIgss;
	private double sueldoBase;
	private double bonificacion;
	
	private final double igss=4.83;
	private int contadorAumentos=0;
	public Empleado(String codigoEmpleado, String nombre, String apellido, String carnetIgss, double sueldoBase, double bonificacion) {
		
		this.codigoEmpleado = codigoEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carnetIgss=carnetIgss;
		this.sueldoBase = sueldoBase;
		this.bonificacion = bonificacion;
		
	}
	public String getCarnetIgss() {
		return carnetIgss;
	}
	public void setCarnetIgss(String carnetIgss) {
		this.carnetIgss = carnetIgss;
	}
	public String getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(String codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public double getBonificacion() {
		return bonificacion;
	}
	public void setBonificacion(double bonificacion) {
		this.bonificacion = bonificacion;
	}
	
	
	public String getDatos() {
		
		
		
		return "Los datos del empleado son   Codigo: "  + getCodigoEmpleado() +" "+ getNombre() + " " + getApellido()+" " + getCarnetIgss() ;
	}
	
	public double getDescuento() {
		double calculoIgss= (getSueldoBase()*igss)/100;
		return calculoIgss;
		
	}
	
	public double getSueldoTotal() {
		double sueldoTotal=((getSueldoBase()+getBonificacion())-getDescuento());
		
		return sueldoTotal;
	}
	
	public double aumento() {
		contadorAumentos++;
		
		if(contadorAumentos<=3) {
		
		
		double aumento=(sueldoBase*10)/100;
		
		sueldoBase=sueldoBase+aumento;
		
		return sueldoBase;
		}
		return sueldoBase;
	}
	
	
	
	

}
