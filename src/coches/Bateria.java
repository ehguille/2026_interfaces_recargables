package coches;

public class Bateria {
	
	private String tipoBateria;
	private final int cargaMaxima;
	private int bateriaActual;
	
	/**
	 * Constructor de la clase batería
	 * @param tipoBateria Elementos que componen la batería
	 * @param cargaMaxima Amperios máximos.
	 */
	public Bateria(String tipoBateria, int cargaMaxima) {
		this.tipoBateria=tipoBateria;
		this.cargaMaxima=cargaMaxima;
		this.bateriaActual=0;
	}
	
	/**
	 * Devuelve el tipo de batería usada
	 * @return Tipo de batería
	 */
	public String getTipoBateria() {
		return tipoBateria;
	}

	/**
	 * Devuelve la carga máxima
	 * @return Carga máxima
	 */
	public int getCargaMaxima() {
		return cargaMaxima;
	}

	/**
	 * Devuelve la batería actual
	 * @return
	 */
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
