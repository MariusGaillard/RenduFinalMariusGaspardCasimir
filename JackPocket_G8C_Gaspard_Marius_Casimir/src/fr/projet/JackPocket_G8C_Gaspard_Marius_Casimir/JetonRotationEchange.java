package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

public class JetonRotationEchange extends JetonAction
{

	public JetonRotationEchange() {
		this.mNom1 = "Rotation";
		this.mNom2 = "Echange";
	}

	public void fonction1(Plateau plateau, MyWindowDuel myWindowDuel) {
		myWindowDuel.flag = 1;
	}

	public void fonction2(Plateau plateau, MyWindowDuel myWindowDuel) {
		myWindowDuel.flag = 2;
	}
}