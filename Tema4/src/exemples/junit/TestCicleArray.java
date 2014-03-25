package exemples.junit;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import exemples.CicleArray;
import exemples.Modul;


public class TestCicleArray {
	
	public static CicleArray cicle;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		cicle=new CicleArray("Desenvolupament d'aplicacions web", 30, 10);
		Modul sistemes;
		sistemes = new Modul("Sistemes", 8);
		cicle.afegirModul(sistemes);
		
	}
	@Test
	public void testAfegirModul() {
		Modul programacio;
		programacio = new Modul("Programacio", 8);
		cicle.afegirModul(programacio);
		assertEquals(1, cicle.getNumeroModuls());
	}

	@Test
	public void testTornaModul() {
		Modul modul = cicle.tornaModul("Programacio");
		String resultat = modul.getNom();
		assertEquals("Programacio",resultat);
		
	}

	@Test
	public void testEsborrarModul() {
		boolean flag = cicle.esborrarModul("Sistemes");
		if(!flag){fail("Modul no borrat");}
		
	}

}
