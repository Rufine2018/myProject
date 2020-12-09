package main.java.myProjet;

public class Etudiant {

	// variables d'instance - remplacez l'exemple qui suit par le vôtre
	private String name;
	private int note;
	private Examen examen;

	/**
	 * Constructeur d'objets de classe Etudiant
	 * 
	 * 
	 */
	public Etudiant() {

	}
	public Etudiant(String name) {
		this.name = name;
	}

	public int getNote() {
		return note;
	}

	public String getName() {
		return name;
	}

	public void setNotes(int note) {
		// Insérez votre code ici
		this.note = note;

	}

	public void addNoteExam(Examen exam, int note) {
		this.examen = exam;
		this.note = note;
	}

	public static void main(String[] args) {


	}

}
