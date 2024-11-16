package taller3.televisores;

public class Marca {
	
	//Atributo de Marca
	private String nombre;
	
	//Constructor de Marca
	public Marca(String nombre) {
		this.nombre = nombre;
	}
	
	//Métodos set y get de nombre
	public void setNombre(String nuevoNombre) {
		nombre = nuevoNombre;
	}
	
	public String getNombre(){
		return nombre;
	}

}
