package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import javax.swing.ImageIcon;

public class JetonWatsonLeChien extends JetonAction
{
	public JetonWatsonLeChien() {
		this.mNom1 = "Watson";
		this.mNom2 = "LeChien";
	}

	public void fonction1(Plateau plateau, MyWindowDuel myWindowDuel) {
		int pos = plateau.mDetective[1].getPosition();

		if (pos == 0) {
			myWindowDuel.BFlagW.setBounds(426, 21, 60, 60);
			myWindowDuel.BFlagW2.setBounds(570, 21, 60, 60);
		} else if (pos == 1) {
			myWindowDuel.BFlagW.setBounds(570, 21, 60, 60);
			myWindowDuel.BFlagW2.setBounds(690, 146, 60, 60);
		} else if (pos == 2) {
			myWindowDuel.BFlagW.setBounds(690, 146, 60, 60);
			myWindowDuel.BFlagW2.setBounds(690, 295, 60, 60);
		} else if (pos == 3) {
			myWindowDuel.BFlagW.setBounds(690, 295, 60, 60);
			myWindowDuel.BFlagW2.setBounds(690, 440, 60, 60);
		} else if (pos == 4) {
			myWindowDuel.BFlagW.setBounds(690, 440, 60, 60);
			myWindowDuel.BFlagW2.setBounds(570, 555, 60, 60);
		} else if (pos == 5) {
			myWindowDuel.BFlagW.setBounds(570, 555, 60, 60);
			myWindowDuel.BFlagW2.setBounds(430, 555, 60, 60);
		} else if (pos == 6) {
			myWindowDuel.BFlagW.setBounds(430, 555, 60, 60);
			myWindowDuel.BFlagW2.setBounds(294, 555, 60, 60);
		} else if (pos == 7) {
			myWindowDuel.BFlagW.setBounds(294, 555, 60, 60);
			myWindowDuel.BFlagW2.setBounds(170, 440, 60, 60);
		} else if (pos == 8) {
			myWindowDuel.BFlagW.setBounds(170, 440, 60, 60);
			myWindowDuel.BFlagW2.setBounds(170, 295, 60, 60);
		} else if (pos == 9) {
			myWindowDuel.BFlagW.setBounds(170, 295, 60, 60);
			myWindowDuel.BFlagW2.setBounds(170, 146, 60, 60);
		} else if (pos == 10) {
			myWindowDuel.BFlagW.setBounds(170, 146, 60, 60);
			myWindowDuel.BFlagW2.setBounds(283, 21, 60, 60);
		} else if (pos == 11) {
			myWindowDuel.BFlagW.setBounds(283, 21, 60, 60);
			myWindowDuel.BFlagW2.setBounds(426, 21, 60, 60);
		}
		myWindowDuel.BFlagW.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonWatson.png")));
		myWindowDuel.BFlagW2.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonWatson.png")));
		myWindowDuel.BFlagW.setVisible(true);
		myWindowDuel.BFlagW2.setVisible(true);
	}

	public void fonction2(Plateau plateau, MyWindowDuel myWindowDuel) {
		int pos = plateau.mDetective[2].getPosition();

		if (pos == 0) {
			myWindowDuel.BFlagC.setBounds(426, 6, 60, 60);
			myWindowDuel.BFlagC2.setBounds(570, 6, 60, 60);
		} else if (pos == 1) {
			myWindowDuel.BFlagC.setBounds(570, 6, 60, 60);
			myWindowDuel.BFlagC2.setBounds(705, 146, 60, 60);
		} else if (pos == 2) {
			myWindowDuel.BFlagC.setBounds(705, 146, 60, 60);
			myWindowDuel.BFlagC2.setBounds(705, 295, 60, 60);
		} else if (pos == 3) {
			myWindowDuel.BFlagC.setBounds(705, 295, 60, 60);
			myWindowDuel.BFlagC2.setBounds(705, 440, 60, 60);
		} else if (pos == 4) {
			myWindowDuel.BFlagC.setBounds(705, 440, 60, 60);
			myWindowDuel.BFlagC2.setBounds(570, 570, 60, 60);
		} else if (pos == 5) {
			myWindowDuel.BFlagC.setBounds(570, 570, 60, 60);
			myWindowDuel.BFlagC2.setBounds(430, 570, 60, 60);
		} else if (pos == 6) {
			myWindowDuel.BFlagC.setBounds(430, 570, 60, 60);
			myWindowDuel.BFlagC2.setBounds(294, 570, 60, 60);
		} else if (pos == 7) {
			myWindowDuel.BFlagC.setBounds(294, 570, 60, 60);
			myWindowDuel.BFlagC2.setBounds(155, 440, 60, 60);
		} else if (pos == 8) {
			myWindowDuel.BFlagC.setBounds(155, 440, 60, 60);
			myWindowDuel.BFlagC2.setBounds(155, 295, 60, 60);
		} else if (pos == 9) {
			myWindowDuel.BFlagC.setBounds(155, 295, 60, 60);
			myWindowDuel.BFlagC2.setBounds(155, 146, 60, 60);
		} else if (pos == 10) {
			myWindowDuel.BFlagC.setBounds(155, 146, 60, 60);
			myWindowDuel.BFlagC2.setBounds(283, 6, 60, 60);
		} else if (pos == 11) {
			myWindowDuel.BFlagC.setBounds(283, 6, 60, 60);
			myWindowDuel.BFlagC2.setBounds(426, 6, 60, 60);
		}
		myWindowDuel.BFlagC.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonChien.png")));
		myWindowDuel.BFlagC2.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonChien.png")));
		myWindowDuel.BFlagC.setVisible(true);
		myWindowDuel.BFlagC2.setVisible(true);
	}
}