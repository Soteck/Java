package contenidors;

public class ElementParametritzat<parametre> {
	private ElementParametritzat<parametre> seguent;
	private parametre info;

	public ElementParametritzat(ElementParametritzat<parametre> seguent,
			parametre info) {
		super();
		this.seguent = seguent;
		this.info = info;
	}

	public ElementParametritzat<parametre> getSeguent() {
		return seguent;
	}

	public void setSeguent(ElementParametritzat<parametre> seguent) {
		this.seguent = seguent;
	}

	public parametre getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return "ElementSencer [info=" + info + "]";
	}

}
