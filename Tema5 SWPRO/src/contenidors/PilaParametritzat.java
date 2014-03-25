package contenidors;

public class PilaParametritzat<parametre> {

	private ElementParametritzat<parametre> inici;

	public PilaParametritzat() {
		super();
		this.inici = null;
	}

	public boolean empty() {
		return inici == null;
	}

	public void push(parametre valor) {
		ElementParametritzat<parametre> element = new ElementParametritzat<>(null, valor);
		if (inici == null) {
			this.inici = element;
		} else {
			element.setSeguent(this.inici);
			this.inici = element;

		}

	}

	public parametre peek() {
		return inici.getInfo();
	}

	public void pop() {
		this.inici = inici.getSeguent();
	}

	public parametre poll() {
		ElementParametritzat<parametre> torna = inici;
		this.inici = inici.getSeguent();
		return torna.getInfo();
	}

}
