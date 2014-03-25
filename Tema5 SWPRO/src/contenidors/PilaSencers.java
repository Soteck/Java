package contenidors;

public class PilaSencers {

	private ElementSencer inici;

	public PilaSencers() {
		super();
		this.inici = null;
	}

	public boolean empty() {
		return inici == null;
	}

	public void push(int valor) {
		ElementSencer element = new ElementSencer(null, valor);
		if (inici == null) {
			this.inici = element;
		} else {
			element.setSeguent(this.inici);
			this.inici = element;

		}

	}

	public int peek() {
		return inici.getInfo();
	}

	public void pop() {
		this.inici = inici.getSeguent();
	}

	public ElementSencer poll() {
		ElementSencer torna = inici;
		this.inici = inici.getSeguent();
		return torna;
	}

}
