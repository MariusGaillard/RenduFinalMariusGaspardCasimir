package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import javax.swing.ImageIcon;

public class JetonRotationJoker extends JetonAction
{
	public JetonRotationJoker() {
		this.mNom1 = "Rotation";
		this.mNom2 = "Joker";
	}

	public void fonction1(Plateau plateau, MyWindowDuel myWindowDuel) {
		myWindowDuel.flag = 1;
	}

	public void fonction2(Plateau plateau, MyWindowDuel myWindowDuel) {
		int pos1 = plateau.mDetective[0].getPosition();
		int pos2 = plateau.mDetective[1].getPosition();
		int pos3 = plateau.mDetective[2].getPosition();

		if (pos1 == 0)
			myWindowDuel.BFlagH.setBounds(426, 36, 60, 60);
		else if (pos1 == 1)
			myWindowDuel.BFlagH.setBounds(570, 36, 60, 60);
		else if (pos1 == 2)
			myWindowDuel.BFlagH.setBounds(675, 146, 60, 60);
		else if (pos1 == 3)
			myWindowDuel.BFlagH.setBounds(675, 295, 60, 60);
		else if (pos1 == 4)
			myWindowDuel.BFlagH.setBounds(675, 440, 60, 60);
		else if (pos1 == 5)
			myWindowDuel.BFlagH.setBounds(570, 540, 60, 60);
		else if (pos1 == 6)
			myWindowDuel.BFlagH.setBounds(430, 540, 60, 60);
		else if (pos1 == 7)
			myWindowDuel.BFlagH.setBounds(294, 540, 60, 60);
		else if (pos1 == 8)
			myWindowDuel.BFlagH.setBounds(185, 440, 60, 60);
		else if (pos1 == 9)
			myWindowDuel.BFlagH.setBounds(185, 295, 60, 60);
		else if (pos1 == 10)
			myWindowDuel.BFlagH.setBounds(185, 146, 60, 60);
		else if (pos1 == 11)
			myWindowDuel.BFlagH.setBounds(283, 36, 60, 60);
		
		if (pos3 == 0)
			myWindowDuel.BFlagC.setBounds(426, 6, 60, 60);
		else if (pos3 == 1)
			myWindowDuel.BFlagC.setBounds(570, 6, 60, 60);
		else if (pos3 == 2)
			myWindowDuel.BFlagC.setBounds(705, 146, 60, 60);
		else if (pos3 == 3)
			myWindowDuel.BFlagC.setBounds(705, 295, 60, 60);
		else if (pos3 == 4)
			myWindowDuel.BFlagC.setBounds(705, 440, 60, 60);
		else if (pos3 == 5)
			myWindowDuel.BFlagC.setBounds(570, 570, 60, 60);
		else if (pos3 == 6)
			myWindowDuel.BFlagC.setBounds(430, 570, 60, 60);
		else if (pos3 == 7)
			myWindowDuel.BFlagC.setBounds(294, 570, 60, 60);
		else if (pos3 == 8)
			myWindowDuel.BFlagC.setBounds(155, 440, 60, 60);
		else if (pos3 == 9)
			myWindowDuel.BFlagC.setBounds(155, 295, 60, 60);
		else if (pos3 == 10)
			myWindowDuel.BFlagC.setBounds(155, 146, 60, 60);
		else if (pos3 == 11)
			myWindowDuel.BFlagC.setBounds(283, 6, 60, 60);
		
		if (pos2 == 1)
			myWindowDuel.BFlagW.setBounds(426, 21, 60, 60);
		else if (pos2 == 1)
			myWindowDuel.BFlagW.setBounds(570, 21, 60, 60);
		else if (pos2 == 2)
			myWindowDuel.BFlagW.setBounds(690, 146, 60, 60);
		else if (pos2 == 3)
			myWindowDuel.BFlagW.setBounds(690, 295, 60, 60);
		else if (pos2 == 4)
			myWindowDuel.BFlagW.setBounds(690, 440, 60, 60);
		else if (pos2 == 5)
			myWindowDuel.BFlagW.setBounds(570, 555, 60, 60);
		else if (pos2 == 6)
			myWindowDuel.BFlagW.setBounds(430, 555, 60, 60);
		else if (pos2 == 7)
			myWindowDuel.BFlagW.setBounds(294, 555, 60, 60);
		else if (pos2 == 8)
			myWindowDuel.BFlagW.setBounds(170, 440, 60, 60);
		else if (pos2 == 9)
			myWindowDuel.BFlagW.setBounds(170, 295, 60, 60);
		else if (pos2 == 10)
			myWindowDuel.BFlagW.setBounds(170, 146, 60, 60);
		else if (pos2 == 11)
			myWindowDuel.BFlagW.setBounds(283, 21, 60, 60);
		
		myWindowDuel.BFlagH.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonHolmes.png")));
		myWindowDuel.BFlagW.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonWatson.png")));
		myWindowDuel.BFlagC.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonChien.png")));
		myWindowDuel.BFlagH.setVisible(true);
		myWindowDuel.BFlagW.setVisible(true);
		myWindowDuel.BFlagC.setVisible(true);
	}
}