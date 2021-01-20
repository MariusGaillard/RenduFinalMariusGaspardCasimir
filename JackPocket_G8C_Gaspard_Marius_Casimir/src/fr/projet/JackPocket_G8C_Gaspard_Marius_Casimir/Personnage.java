package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

public class Personnage
{
	private String mNom;
	private int mSablier;
	public int flag;

	public Personnage(String nom, int sablier) {
		this.mNom = nom;
		this.mSablier = sablier;
		this.flag = 0;
	}

	public String getNom() {
		return (this.mNom);
	}

	public int getSablier() {
		return (this.mSablier);
	}

	public void displayPersonnage() {
		System.out.println(this.mNom + " et " + this.mSablier);
	}
}