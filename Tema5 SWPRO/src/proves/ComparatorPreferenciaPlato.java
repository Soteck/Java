package proves;

import java.util.Comparator;

public class ComparatorPreferenciaPlato implements Comparator<Preferencia2> {

	public int compare(Preferencia2 a, Preferencia2 b) {
		return a.getPlato().compareTo(b.getPlato());
	}



}
