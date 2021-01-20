package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;
import javax.swing.ImageIcon;

public class JetonHolmesAlibi extends JetonAction
{
	public JetonHolmesAlibi() {
		this.mNom1 = "Holmes";
		this.mNom2 = "Alibi";
	}

	public void fonction1(Plateau plateau, MyWindowDuel myWindowDuel) {
		int pos = plateau.mDetective[0].getPosition();

		if (pos == 0) {
			myWindowDuel.BFlagH.setBounds(426, 36, 60, 60);
			myWindowDuel.BFlagH2.setBounds(570, 36, 60, 60);
		} else if (pos == 1) {
			myWindowDuel.BFlagH.setBounds(570, 36, 60, 60);
			myWindowDuel.BFlagH2.setBounds(675, 146, 60, 60);
		} else if (pos == 2) {
			myWindowDuel.BFlagH.setBounds(675, 146, 60, 60);
			myWindowDuel.BFlagH2.setBounds(675, 295, 60, 60);
		} else if (pos == 3) {
			myWindowDuel.BFlagH.setBounds(675, 295, 60, 60);
			myWindowDuel.BFlagH2.setBounds(675, 440, 60, 60);
		} else if (pos == 4) {
			myWindowDuel.BFlagH.setBounds(675, 440, 60, 60);
			myWindowDuel.BFlagH2.setBounds(570, 540, 60, 60);
		} else if (pos == 5) {
			myWindowDuel.BFlagH.setBounds(570, 540, 60, 60);
			myWindowDuel.BFlagH2.setBounds(430, 540, 60, 60);
		} else if (pos == 6) {
			myWindowDuel.BFlagH.setBounds(430, 540, 60, 60);
			myWindowDuel.BFlagH2.setBounds(294, 540, 60, 60);
		} else if (pos == 7) {
			myWindowDuel.BFlagH.setBounds(294, 540, 60, 60);
			myWindowDuel.BFlagH2.setBounds(185, 440, 60, 60);
		} else if (pos == 8) {
			myWindowDuel.BFlagH.setBounds(185, 440, 60, 60);
			myWindowDuel.BFlagH2.setBounds(185, 295, 60, 60);
		} else if (pos == 9) {
			myWindowDuel.BFlagH.setBounds(185, 295, 60, 60);
			myWindowDuel.BFlagH2.setBounds(185, 146, 60, 60);
		} else if (pos == 10) {
			myWindowDuel.BFlagH.setBounds(185, 146, 60, 60);
			myWindowDuel.BFlagH2.setBounds(283, 36, 60, 60);
		} else if (pos == 11) {
			myWindowDuel.BFlagH.setBounds(283, 36, 60, 60);
			myWindowDuel.BFlagH2.setBounds(426, 36, 60, 60);
		}
		myWindowDuel.BFlagH.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonHolmes.png")));
		myWindowDuel.BFlagH2.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonHolmes.png")));
		myWindowDuel.BFlagH.setVisible(true);
		myWindowDuel.BFlagH2.setVisible(true);
	}

	public void fonction2(Plateau plateau, MyWindowDuel myWindowDuel) {
		myWindowDuel.flag2 = 1;
		if ((plateau.getTour() % 2 == 0 && (plateau.nbJeton == 3 || plateau.nbJeton == 0))
				|| (plateau.getTour() % 2 == 1 && (plateau.nbJeton == 1 || plateau.nbJeton == 2))) { // detective
			int i2 = 0;
            int j2 = 0;

            for (int i = 0 ; i < 3 ; i++) {
            	for (int j = 0 ; j < 3 ; j++) {
            		if (plateau.mPlateau[i][j].getPerso() == plateau.mTasCarte.get(0)) {
            			i2 = i;
            			j2 = j;
            		}
            	}
            }
			if (plateau.mPlateau[i2][j2].getPileFace() == 0) {
				plateau.mPlateau[i2][j2].setPileFace(1);
				if (plateau.mPlateau[i2][j2].getPerso().getNom() == "Gris") {
					plateau.mPlateau[i2][j2].setPileFace(-1);
					plateau.mPlateau[i2][j2].setPosition(-1);
				}
				plateau.setNbCase0(plateau.getNbCase0() - 1);
			}
			myWindowDuel.ftQuartier();
			plateau.mTasCarte.remove(0);
		}
		else {
			plateau.mMechant.mTasCarteMechant.add(plateau.mTasCarte.get(0));
			plateau.mMechant.setSablierReel(plateau.mMechant.getSablierReel() + plateau.mTasCarte.get(0).getSablier());
			plateau.mTasCarte.remove(0);
			myWindowDuel.ftCarteP();
		}
		myWindowDuel.renew();
	}
}
