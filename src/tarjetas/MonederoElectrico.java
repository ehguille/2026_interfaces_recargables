package tarjetas;
import interfaces.Recargable;

public class MonederoElectrico extends Tarjeta implements Recargable {

	public MonederoElectrico(int saldoMaximo) {
		super(saldoMaximo);
	}

	public void recargar(int cantidad) {
		saldoActual+=cantidad;//saldoMaximo=saldoMaximo+cantidad;
	}

	public void consultar() {
		System.out.println("Saldo actual="+saldoActual);
	}


}
