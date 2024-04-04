package model;

public class Empleado {
	private String nombre;
	private String email;
	private int edad;
	private int codigo;
	public Empleado(String nombre, String email, int edad, int codigo) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.codigo = codigo;
	}
	public Empleado() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	
}
