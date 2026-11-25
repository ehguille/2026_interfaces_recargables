package interfaces;

public interface Recargable {
	
	default void recargar(int cantidad) {
		System.out.println("Se recarga "+cantidad+".");
	}
	
	void consultar();

}
