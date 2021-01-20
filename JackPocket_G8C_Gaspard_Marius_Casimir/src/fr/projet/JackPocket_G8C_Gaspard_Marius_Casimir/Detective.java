package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

public class Detective {
	private String mNom;
	private int mPosition;

	public Detective(String nom, int position) {
		this.mNom = nom;
		this.mPosition = position;
	}

	public void setPosition(int position) {
		this.mPosition = position;
	}

	public int getPosition() {
		return (this.mPosition);
	}

	public String getNom() {
		return (this.mNom);
	}
}