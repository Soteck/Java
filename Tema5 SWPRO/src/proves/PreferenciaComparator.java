package proves;


public class PreferenciaComparator implements Comparable<PreferenciaComparator> {
	private int orden;
	private String plato;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public PreferenciaComparator(int ordern, String plato) {
		super();
		this.orden = ordern;
		this.plato = plato;
	}

	public int getOrdern() {
		return orden;
	}

	public void setOrdern(int ordern) {
		this.orden = ordern;
	}

	public String getPlato() {
		return plato;
	}

	public void setPlato(String plato) {
		this.plato = plato;
	}
	
	@Override
	public int compareTo(PreferenciaComparator b) {
		if(this.orden<b.orden){
		return 1;
		}else if(this.orden==b.orden)
		{
		return 0;}
		else return -1;
			
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orden;
		result = prime * result + ((plato == null) ? 0 : plato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PreferenciaComparator other = (PreferenciaComparator) obj;
		if (orden != other.orden)
			return false;
		if (plato == null) {
			if (other.plato != null)
				return false;
		} else if (!plato.equals(other.plato))
			return false;
		return true;
	}

	
	
	
	
	
	
	

}
