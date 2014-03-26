package proves;


public class Preferencia2 implements Comparable<Preferencia2> {
	private int orden;
	private String plato;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public Preferencia2(int ordern, String plato) {
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
	public int compareTo(Preferencia2 b) {
		if(this.orden<b.orden){
		return 1;
		}else if(this.orden==b.orden)
		{
		return 0;}
		else return -1;
			
	}

	
	
	
	
	
	
	

}
