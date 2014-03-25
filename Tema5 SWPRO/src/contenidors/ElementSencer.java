package contenidors;

public class ElementSencer {
	private ElementSencer seguent;
	private int info;

	public ElementSencer(ElementSencer seguent, int info) {
		super();
		this.seguent = seguent;
		this.info = info;
	}

	public ElementSencer getSeguent() {
		return seguent;
	}

	public void setSeguent(ElementSencer seguent) {
		this.seguent = seguent;
	}

	public int getInfo() {
		return info;
	}

	@Override
	public String toString() {
		return "ElementSencer [info=" + info + "]";
	}

}
