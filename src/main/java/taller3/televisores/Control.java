package taller3.televisores;

public class Control {
	
	private TV tv;
	
	//Método que permite enlazar el tv con el control para que este lo controle remotamente y a su vez el tv asigna este objeto control a su atributo
	public void enlazar(TV tv) {
		this.tv = tv;
		tv.setControl(this);
	}
	
	//Métodos get y set para tv
	public void setTv(TV nuevoTv) {
		tv = nuevoTv;
	}
	
	public TV getTv() {
		return tv;
	}
	
	//Métodos para encender y apagar el tv desde el control
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	//Métodos para aumentar y disminuir los canales desde el control
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	//Métodos para subir y bajar el volumen desde el control
	public void volumenUp() {
		tv.volumenUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	//Método para poner cualquier canal desde el control (1 y 120)
	public void setCanal(int nuevoCanal) {
		tv.setCanal(nuevoCanal);
	}
	
	//Método para poner el volumen desde el control (0 y 7)
	public void setVolumen(int nuevoVolumen) {
		tv.setVolumen(nuevoVolumen);
	}
}
