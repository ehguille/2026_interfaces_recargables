package coches;

public class Bateria {
	
	private String tipoBateria;
	private final int cargaMaxima;
	private int bateriaActual;
	
	public Bateria(String tipoBateria, int cargaMaxima) {
		this.tipoBateria=tipoBateria;
		this.cargaMaxima=cargaMaxima;
		this.bateriaActual=0;
	}
	
	public String getTipoBateria() {
		return tipoBateria;
	}

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public int getBateriaActual() {
		return bateriaActual;
	}

	public void setBateriaActual(int bateriaActual) {
		this.bateriaActual = bateriaActual;
	}
	
	public String toString() {
		return "Batería de "+tipoBateria+" y carga "+bateriaActual+" de "+cargaMaxima;
	}

}
