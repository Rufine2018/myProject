package main.java.myProjet;

import java.util.ArrayList;

public class Examen {

	// variables d'instance - remplacez l'exemple qui suit par le v�tre

	private String intitule;
	private int heure;
	ArrayList<Etudiant> etudiant;

	/**
	 * Constructeur d'objets de classe Examen
	 */
	public Examen(String intitule) {
		this.intitule = intitule;
	}

	public int getHeure() {
		// Ins�rez votre code ici
		return this.heure;
	}

	public int addHeure(int heure) {
		return this.heure = heure;

	}

}
