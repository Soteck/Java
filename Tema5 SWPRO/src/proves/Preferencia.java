package proves;


public class Preferencia implements Comparable<Preferencia> {
	private int orden;
	private String plato;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Preferencia(int ordern, String plato) {
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
	public int compareTo(Preferencia b) {
		if(this.orden<b.orden){
		return 1;
		}else if(this.orden==b.orden)
		{
		return 0;}
		else return -1;
			
	}

	@Override
	public String toString() {
		return "Preferencia [orden=" + orden + ", plato=" + plato + "]";
	}

	
	
	
	
	
	
	

}
