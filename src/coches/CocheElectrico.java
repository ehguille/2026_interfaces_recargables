package coches;
import interfaces.Recargable;

public class CocheElectrico extends Coche implements Recargable {

	private int nivelBateria;
	
	public CocheElectrico(int nivelBateria) {
		this.nivelBateria=nivelBateria;
	}
	
	public void consultar() {
		System.out.println("Bateria="+nivelBateria);
	}
	
	public void recargar(int cantidad) {
		nivelBateria+=cantidad;
	}

}
