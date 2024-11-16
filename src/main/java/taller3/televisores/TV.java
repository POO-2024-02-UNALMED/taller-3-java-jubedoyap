package taller3.televisores;

public class TV {
	
	//Atributos de instancia TV
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	
	//Atributo de clase para contabilizar los objetos de tipo TV creados
	private static int numTV;
	
	//Constructor de TV
	public TV(Marca marca, Boolean estado) {
		this.estado = estado;
		this.marca = marca;
	}
	
	// Métodos get y set de marca
	public void setMarca(Marca nuevaMarca) {
		marca = nuevaMarca;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	// Métodos get y set de canal
	public void setCanal(int nuevoCanal) {
		if (nuevoCanal >= 1 && nuevoCanal <= 120) {
			canal = nuevoCanal;
		}
		else {
			return;
		}
	}
	
	public int getCanal() {
		return canal;
	}

	// Métodos get y set de precio
	public void setPrecio(int nuevoPrecio) {
		precio = nuevoPrecio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	// Métodos get y set de volumen
	public void setVolumen(int nuevoVolumen) {
		if (nuevoVolumen >= 0 && nuevoVolumen <= 7) {
			volumen = nuevoVolumen;
		}
		else {
			return;
		}
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	// Métodos get y set de control
	public void setControl(Control nuevoControl) {
		control = nuevoControl;
	}
		
	public Control getControl() {
		return control;
	}
	
	//Métodos para acceder y configurar numTV
	public static void setNumTV(int nuevoNumTV) {
		numTV += nuevoNumTV;
	}
	
	public static int getNumTV() {
		return numTV;
	}
	
	//Métodos para encender o apagar el tv
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	//Método get para atributo Estado
	public boolean getEstado() {
		return estado;
	}
	
	//Método para aumentar y disminuir volumen
	public void canalUp() {
		if (getEstado() == true) {
			if (getCanal() < 120) {
				canal++;
			}
			else {
				return;
			}
		}
		else {
			return;
		}	
	}
	
	public void canalDown() {
		if (getEstado() == true) {
			if (getCanal() > 1) {
				canal--;
			}
			else {
				return;
			}
		}
		else {
			return;
		}
	}
	
	
	//Método para aumentar y disminuir volumen
	public void volumenUp() {
		if (getEstado() == true) {
			if (getVolumen() < 7) {
				volumen++;
			}
			else {
				return;
			}
		}
		else {
			return;
		}
	}
	
	public void volumenDown() {
		if (getEstado() == true) {
			if (getVolumen() > 0) {
				volumen--;
			}
			else {
				return;
			}
		}
		else {
			return;
		}
	}
}
