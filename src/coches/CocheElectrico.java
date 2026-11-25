package coches;
import interfaces.Recargable;

public class CocheElectrico extends Coche implements Recargable {

	private Bateria unaBateria;
	
	public CocheElectrico(String materialBateria, int cargaMaxima) {
		this.unaBateria=new Bateria(materialBateria,cargaMaxima);
	}
	
	public String getTipoBateria() {
		return unaBateria.getTipoBateria();
	}
	
	public void consultar() {
		System.out.println(unaBateria);
	}
	
	public void recargar(int cantidad) {
		unaBateria.setBateriaActual(unaBateria.getBateriaActual()+cantidad);
	}

}
