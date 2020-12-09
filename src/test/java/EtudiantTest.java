package test.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.myProjet.Etudiant;

public class EtudiantTest {

	@Test
	public void testAddNote() {
		Etudiant etudiant = new Etudiant();
		etudiant.setNotes(11);
		assertEquals(2, etudiant.getNote());
	}
}
