package tarjetas;

public abstract class Tarjeta {
	
	protected final int saldoMaximo;
	protected int saldoActual;
	
	public Tarjeta(int saldoMaximo) {
		this.saldoMaximo=saldoMaximo;
		saldoActual=0;
	}

}
