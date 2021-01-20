package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MyWindowDuel extends JFrame implements ActionListener {

    private static final long serialVersionUID = -4939544011287453046L;
    public JLayeredPane layeredPane;
    public JButton BCroix;
    public JPanel panel;
    public JButton[][] BQuartier = new JButton[3][3];
    public JButton[] BDetective = new JButton[3];
    public JLabel[] LSablier = new JLabel[6];
    public JLabel LTeteDetective;
    public JLabel LTeteMrJack;
    public JLabel LTour;
    public JButton BCarte;
    public JButton[] BCarteP = new JButton[4];
    public JLabel LFleche;
    public JButton[] BJeton = new JButton[4];
    public JButton BFlagH;
    public JButton BFlagH2;
    public JButton BFlagW;
    public JButton BFlagW2;
    public JButton BFlagC;
    public JButton BFlagC2;
    public JButton BCoche;
    public JLabel LTexte;
    Game game;
    Quartier quartierFlag;
    Plateau plateau;
    String name;
    String nom1;
    String nom2;
    int flag;
    int flag3;
    int i;
    int i2;
    int j;
    int j2;
    int a;
    int flag2;
    ArrayList<JetonAction> jetonFlag;
    
    public MyWindowDuel(String Nnom1, String Nnom2, Plateau Pplateau) {
    	this.nom1 = Nnom1;
    	this.flag3 = -1;
    	this.i2 = -1;
		this.j2 = -1;
    	this.game = new Game();
    	this.nom2 = Nnom2;
    	this.plateau = Pplateau;
    	this.flag = -1;
    	this.a = 0;
    	this.flag2 = 1;

    	this.setTitle("MrJackAndPocket");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setResizable(false);
    	this.setSize(840, 800);
    	this.setLocationRelativeTo(null);
    	
    	layeredPane = new JLayeredPane();
    	layeredPane.setBounds(0, 0, 840, 800);
    	
    	init();
    }
    
    public void init() {
    	ftReste();
    	ftQuartier();
    	ftCarteP();
    	ftDetectivePlace();
    	ftSablier();
    	ftFleche();
    	ftJeton();
    	
    	ftQuartier2();
    	BFlagH.addActionListener((ActionListener) this);
    	BFlagH2.addActionListener((ActionListener) this);
    	BFlagW.addActionListener((ActionListener) this);
    	BFlagW2.addActionListener((ActionListener) this);
    	BFlagC.addActionListener((ActionListener) this);
    	BFlagC2.addActionListener((ActionListener) this);
    	BCoche.addActionListener((ActionListener) this);
    	BJeton[0].addActionListener((ActionListener) this);
    	BJeton[1].addActionListener((ActionListener) this);
    	BJeton[2].addActionListener((ActionListener) this);
    	BJeton[3].addActionListener((ActionListener) this);
    	BCarteP[0].addActionListener((ActionListener) this);
    	BCarteP[1].addActionListener((ActionListener) this);
    	BCarteP[2].addActionListener((ActionListener) this);
    	BDetective[0].addActionListener((ActionListener) this);
    	BDetective[1].addActionListener((ActionListener) this);
    	BDetective[2].addActionListener((ActionListener) this);
    	BQuartier[0][0].addActionListener((ActionListener) this);
    	BQuartier[0][1].addActionListener((ActionListener) this);
    	BQuartier[0][2].addActionListener((ActionListener) this);
    	BQuartier[1][0].addActionListener((ActionListener) this);
    	BQuartier[1][1].addActionListener((ActionListener) this);
    	BQuartier[1][2].addActionListener((ActionListener) this);
    	BQuartier[2][0].addActionListener((ActionListener) this);
    	BQuartier[2][1].addActionListener((ActionListener) this);
    	BQuartier[2][2].addActionListener((ActionListener) this);
    	layeredPane.add(LTeteDetective, Integer.valueOf(-20));
    	layeredPane.add(LTexte, Integer.valueOf(20));
    	layeredPane.add(LTeteMrJack, Integer.valueOf(-20));
    	layeredPane.add(BCroix, Integer.valueOf(20));
    	layeredPane.add(LTour, Integer.valueOf(-20));
    	layeredPane.add(BCarte, Integer.valueOf(5));
    	layeredPane.add(BCarteP[0]);
    	layeredPane.add(BCarteP[1]);
    	layeredPane.add(BCarteP[2]);
    	layeredPane.add(BCarteP[3]);
    	layeredPane.add(BDetective[0], Integer.valueOf(0));
    	layeredPane.add(BDetective[1], Integer.valueOf(1));
    	layeredPane.add(BDetective[2], Integer.valueOf(2));
    	layeredPane.add(LFleche);
    	layeredPane.add(LSablier[0]);
    	layeredPane.add(LSablier[1]);
    	layeredPane.add(LSablier[2]);
    	layeredPane.add(LSablier[3]);
    	layeredPane.add(LSablier[4]);
    	layeredPane.add(LSablier[5]);
    	layeredPane.add(BJeton[0]);
    	layeredPane.add(BJeton[1]);
    	layeredPane.add(BJeton[2]);
    	layeredPane.add(BJeton[3]);
    	layeredPane.add(BFlagH);
    	layeredPane.add(BFlagH2);
    	layeredPane.add(BFlagW);
    	layeredPane.add(BFlagW2);
    	layeredPane.add(BFlagC);
    	layeredPane.add(BFlagC2);
    	layeredPane.add(BCoche);
    	layeredPane.add(panel, Integer.valueOf(-1));
    	this.add(layeredPane);
    }
    
    public void ftReste() {
    	BCroix = new JButton();
        BCroix.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Croix.png")));
        BCroix.setBounds(750, 10, 80, 80);
        BCroix.addActionListener((ActionListener) this);
        
        LTexte = new JLabel("Tour de " + this.nom1);
        LTexte.setBounds(10, 600, 250, 20);
        
        LTeteDetective = new JLabel();
    	LTeteDetective.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Detective.png")));
    	LTeteDetective.setBounds(0, 0, 160, 110);
        
    	LTeteMrJack = new JLabel();
    	LTeteMrJack.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/MrJack.png")));
    	LTeteMrJack.setBounds(780, 705, 60, 75);
    	
    	LTour = new JLabel();
    	LTour.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Temps.png")));
    	LTour.setBounds(0, 160, 47, 400);
    	
    	BCarte = new JButton();
    	BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Carte.png")));
    	BCarte.setBounds(10, 630, 89, 150);
    	BCarte.addActionListener((ActionListener) this);
    	
    	panel = new JPanel();
    	panel.setLayout(new GridLayout(3, 3, 3, 3));
    	panel.setBounds(250, 115, 426, 426);
    	LFleche = new JLabel();
    	BFlagH = new JButton();
    	BFlagH2 = new JButton();
    	BFlagW = new JButton();
    	BFlagW2 = new JButton();
    	BFlagC = new JButton();
    	BFlagC2 = new JButton();
    	
    	BCoche = new JButton();
    	BCoche.setBounds(730, 650, 50, 50);
    	BCoche.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Coche.png")));
    	BCoche.setVisible(false);
    	
    	BCarteP[0] = new JButton();
    	BCarteP[1] = new JButton();
    	BCarteP[2] = new JButton();
    	BCarteP[3] = new JButton();
    	LSablier[0] = new JLabel();
    	LSablier[1] = new JLabel();
    	LSablier[2] = new JLabel();
    	LSablier[3] = new JLabel();
    	LSablier[4] = new JLabel();
    	LSablier[5] = new JLabel();
    	BQuartier[0][0] = new JButton();
    	BQuartier[0][1] = new JButton();
    	BQuartier[0][2] = new JButton();
    	BQuartier[1][0] = new JButton();
    	BQuartier[1][1] = new JButton();
    	BQuartier[1][2] = new JButton();
    	BQuartier[2][0] = new JButton();
    	BQuartier[2][1] = new JButton();
    	BQuartier[2][2] = new JButton();
    	BDetective[0] = new JButton();
    	BDetective[1] = new JButton();
    	BDetective[2] = new JButton();
    	BJeton[0] = new JButton();
    	BJeton[1] = new JButton();
    	BJeton[2] = new JButton();
    	BJeton[3] = new JButton();
    }
    
    public void ftJeton() {
    	for (int i = 0 ; i < 4 ; i++) {
    		if (plateau.jeton.get(i).getPileFace() == 1) {
    			switch (plateau.jeton.get(i).getNom1()) {
    			case "Holmes" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonHolmes.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			case "Rotation" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonTourner.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			case "Watson" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonWatson.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			}
    		}
    		else if (plateau.jeton.get(i).getPileFace() == 2) {
    			switch (plateau.jeton.get(i).getNom2()) {
    			case "Alibi" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonCarte.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			case "Echange" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonEchanger.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			case "Joker" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonJoker.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			case "LeChien" :
    				BJeton[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonChien.png")));
            		BJeton[i].setBounds(280 + i*85, 643, 65, 65);
            		break;
    			}
    		}
    	}
    }
    
    public void ftFleche() {
        LFleche.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Fleche.png")));
        LFleche.setBounds(60, 155 + (plateau.getTour() * 50), 60, 60);
    }
    
    public void ftCarteP() {
    	for (int i = 0 ; i < plateau.mMechant.mTasCarteMechant.size() ; i++) {
    		if (i > 3)
    			break;
        	BCarteP[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/CartePetit.png")));
        	BCarteP[i].setBounds(110 + (i * 40), 730, 30, 50);
    	}
    }
    
    public void ftSablier() {
    	int x = 700;
    	int i = 0;
    	
    	while (i < plateau.mMechant.getSablier()) {
    		if (i > 5)
    			break;
    		LSablier[i].setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Sablier.png")));
    		LSablier[i].setBounds(x, 730, 26, 40);
    		x -= 40;
    		i++;
    	}
    	while (i < 6) {
    		LSablier[i].setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/SablierVide.png")));
    		LSablier[i].setBounds(x, 730, 26, 40);
    		x -= 40;
    		i++;
    	}
    }
    
    public void ftQuartier() {
    	for (int i = 0 ; i < 3 ; i++) {
    		for (int j = 0 ; j < 3 ; j++) {
    			name = plateau.mPlateau[i][j].getPerso().getNom();
    			if (plateau.mPlateau[i][j].getPileFace() == 0) {
    				switch(name) {
	    			case "Rose":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Rose" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Blanc":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Blanc" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Noir":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Noir" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Bleu":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Bleu" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Jaune":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Jaune" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Gris":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Gris" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Vert":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Vert" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Violet":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Violet" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
	    			case "Orange":
	    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Orange" + plateau.mPlateau[i][j].getPosition() + ".png")));
	    				break;
    				}
    			} else if (plateau.mPlateau[i][j].getPileFace() == 1) {
    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Retourne" + plateau.mPlateau[i][j].getPosition() + ".png")));
    			} else if (plateau.mPlateau[i][j].getPileFace() == -1) {
    				BQuartier[i][j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Retourne-2.png")));
    			}
    		}
    	}
    }
    
    public void ftQuartier2() {
    	for (int i = 0 ; i < 3 ; i++) {
    		for (int j = 0 ; j < 3 ; j++)
    			panel.add(BQuartier[i][j]);
    	}
    }
    
    public void ftDetective(int i, int plus) {
    	int pos = plateau.mDetective[i].getPosition();
    	
    	switch (pos) {
    	case 0: BDetective[i].setBounds(283, 36 - plus, 65, 65); break;
    	case 1: BDetective[i].setBounds(426, 36 - plus, 65, 65); break;
    	case 2: BDetective[i].setBounds(570, 36 - plus, 65, 65); break;
    	case 3: BDetective[i].setBounds(675 + plus, 146, 65, 65); break;
    	case 4: BDetective[i].setBounds(675 + plus, 295, 65, 65); break;
    	case 5: BDetective[i].setBounds(675 + plus, 440, 65, 65); break;
    	case 6: BDetective[i].setBounds(570, 540 + plus, 65, 65); break;
    	case 7: BDetective[i].setBounds(430, 540 + plus, 65, 65); break;
    	case 8: BDetective[i].setBounds(294, 540 + plus, 65, 65); break;
    	case 9: BDetective[i].setBounds(185 - plus, 440, 65, 65); break;
    	case 10: BDetective[i].setBounds(185 - plus, 295, 65, 65); break;
    	case 11: BDetective[i].setBounds(185 - plus, 146, 65, 65); break;
    	}
    }
    
    public void ftDetectivePlace() {
    	for (int i = 0 ; i < 3 ; i++) {
    		name = plateau.mDetective[i].getNom();
    		switch(name) {
    		case "Holmes":
    			BDetective[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonHolmes.png")));
    			ftDetective(i, 0);
    			break;
    		case "Watson":
    			BDetective[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonWatson.png")));
    			ftDetective(i, 15);
    			break;
    		case "M. Le Chien":
    			BDetective[i].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/JetonChien.png")));
    			ftDetective(i, 30);
    			break;
    		}
    	}
    }
    
    public void ftCarteP(ActionEvent event) {
    	int j = -1;
    	
    	if (event.getSource() == BCarteP[0])
    		j = 0;
    	else if (event.getSource() == BCarteP[1])
    		j = 1;
    	else if (event.getSource() == BCarteP[2])
    		j = 2;
    	else
    		j = 3;
    	
    	if (plateau.mMechant.mTasCarteMechant.get(j).flag == 0) {
    		if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Blanc")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PBlanc2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Bleu")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PBleu2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Gris")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PGris2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Vert")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PVert2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Violet")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PViolet2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Jaune")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PJaune2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Orange")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/POrange2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Noir")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PNoir2.png")));
    		else if (plateau.mMechant.mTasCarteMechant.get(j).getNom() == "Rose")
    			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PRose2.png")));
    		plateau.mMechant.mTasCarteMechant.get(j).flag = 1;
		}
		else {
			BCarteP[j].setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/CartePetit.png")));
			plateau.mMechant.mTasCarteMechant.get(j).flag = 0;
		}
    }
    
    public void renew() {
    	String str;
    	
    	if ((plateau.getTour() % 2 == 0 && (plateau.nbJeton == 1 || plateau.nbJeton == 4))
    			|| (plateau.getTour() % 2 == 1 && (plateau.nbJeton == 2 || plateau.nbJeton == 3)))
    		LTexte.setText("Tour de " + this.nom1);
    	else
    		LTexte.setText("Tour de " + this.nom2);
    	if (plateau.nbJeton <= 0) {
			plateau.changeTour();
			plateau.nbJeton = 4;
			ftFleche();
			
			game.update(plateau);
			str = game.end(plateau, plateau.getTour());
			if (!str.equals("non")) {
				this.dispose();
				MyWindowEnd myWindowEnd = new MyWindowEnd(str);
				myWindowEnd.setVisible(true);
			}
			ftSablier();
			ftQuartier();
			
			if (plateau.getTour() % 2 == 0) {
				plateau.jeton.get(0).ftHasard();
				plateau.jeton.get(1).ftHasard();
				plateau.jeton.get(2).ftHasard();
				plateau.jeton.get(3).ftHasard();
			} else {
				plateau.jeton.get(0).changePileFace();
				plateau.jeton.get(1).changePileFace();
				plateau.jeton.get(2).changePileFace();
				plateau.jeton.get(3).changePileFace();
			}
			ftJeton();
			BJeton[0].setVisible(true);
			BJeton[1].setVisible(true);
			BJeton[2].setVisible(true);
			BJeton[3].setVisible(true);
		}
    }
    
    @SuppressWarnings("unchecked")
	public void ftChangeJeton(int i) {
    	this.flag2 = 0;
    	plateau.nbJeton--;
    	this.i2 = -1;
		this.j2 = -1;
		if (plateau.nbJeton == 3) {
			jetonFlag = (ArrayList<JetonAction>)plateau.jeton.clone();
		}
		BJeton[i].setVisible(false);
		if (plateau.jeton.get(i).getPileFace() == 1) {
			plateau.jeton.get(i).fonction1(plateau, this);
		} else if (plateau.jeton.get(i).getPileFace() == 2) {
			plateau.jeton.get(i).fonction2(plateau, this);
		}
		//renew();
    }

	@Override
    public void actionPerformed( ActionEvent event) {
    	if (event.getSource() == BCroix) {
    		this.dispose();
    		MyWindowBase myWindowBase = new MyWindowBase();
    		myWindowBase.setVisible(true);
    	} else if (event.getSource() == BCarte) {
    		if (plateau.mMechant.getCarteMechant().flag == 0) {
	    		if (plateau.mMechant.getCarteMechant().getNom() == "Blanc")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PBlanc.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Bleu")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PBleu.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Gris")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PGris.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Vert")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PVert.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Violet")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PViolet.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Jaune")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PJaune.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Orange")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/POrange.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Noir")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PNoir.png")));
	    		else if (plateau.mMechant.getCarteMechant().getNom() == "Rose")
	    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/PRose.png")));
	    		plateau.mMechant.getCarteMechant().flag = 1;
    		}
    		else {
    			BCarte.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Carte.png")));
    			plateau.mMechant.getCarteMechant().flag = 0;
    		}
    	} else if (event.getSource() == BCarteP[0] || event.getSource() == BCarteP[1]
    			|| event.getSource() == BCarteP[2] || event.getSource() == BCarteP[3]) {
    		ftCarteP(event);
    	} else if (event.getSource() == BJeton[0] && flag2 == 1) {
    		ftChangeJeton(0);
    	} else if (event.getSource() == BJeton[1] && flag2 == 1) {
    		ftChangeJeton(1);
    	} else if (event.getSource() == BJeton[2] && flag2 == 1) {
    		ftChangeJeton(2);
    	} else if (event.getSource() == BJeton[3] && flag2 == 1) {
    		ftChangeJeton(3);
    	} else if (event.getSource() == BFlagH) {
    		BFlagC.setVisible(false);
    		BFlagC2.setVisible(false);
    		BFlagH.setVisible(false);
    		BFlagH2.setVisible(false);
    		BFlagW.setVisible(false);
    		BFlagW2.setVisible(false);
    		if (plateau.mDetective[0].getPosition() != 11)
    			plateau.mDetective[0].setPosition(plateau.mDetective[0].getPosition() + 1);
    		else
    			plateau.mDetective[0].setPosition(0);
    		ftDetectivePlace();
    		flag2 = 1;
    		renew();
    	} else if (event.getSource() == BFlagH2) {
    		BFlagC.setVisible(false);
    		BFlagC2.setVisible(false);
    		BFlagH.setVisible(false);
    		BFlagH2.setVisible(false);
    		BFlagW.setVisible(false);
    		BFlagW2.setVisible(false);
    		if (plateau.mDetective[0].getPosition() != 10 && plateau.mDetective[0].getPosition() != 11)
    			plateau.mDetective[0].setPosition(plateau.mDetective[0].getPosition() + 2);
    		else if (plateau.mDetective[0].getPosition() == 10)
    			plateau.mDetective[0].setPosition(0);
    		else
    			plateau.mDetective[0].setPosition(1);
    		ftDetectivePlace();
    		flag2 = 1;
    		renew();
    	} else if (event.getSource() == BFlagW) {
    		BFlagC.setVisible(false);
    		BFlagC2.setVisible(false);
    		BFlagH.setVisible(false);
    		BFlagH2.setVisible(false);
    		BFlagW.setVisible(false);
    		BFlagW2.setVisible(false);
    		if (plateau.mDetective[1].getPosition() != 11)
    			plateau.mDetective[1].setPosition(plateau.mDetective[1].getPosition() + 1);
    		else
    			plateau.mDetective[1].setPosition(0);
    		ftDetectivePlace();
    		flag2 = 1;
    		renew();
    	} else if (event.getSource() == BFlagW2) {
    		BFlagC.setVisible(false);
    		BFlagC2.setVisible(false);
    		BFlagH.setVisible(false);
    		BFlagH2.setVisible(false);
    		BFlagW.setVisible(false);
    		BFlagW2.setVisible(false);
    		if (plateau.mDetective[1].getPosition() != 10 && plateau.mDetective[1].getPosition() != 11)
    			plateau.mDetective[1].setPosition(plateau.mDetective[1].getPosition() + 2);
    		else if (plateau.mDetective[1].getPosition() == 10)
    			plateau.mDetective[1].setPosition(0);
    		else
    			plateau.mDetective[1].setPosition(1);
    		ftDetectivePlace();
    		flag2 = 1;
    		renew();
    	} else if (event.getSource() == BFlagC) {
    		BFlagC.setVisible(false);
    		BFlagC2.setVisible(false);
    		BFlagH.setVisible(false);
    		BFlagH2.setVisible(false);
    		BFlagW.setVisible(false);
    		BFlagW2.setVisible(false);
    		if (plateau.mDetective[2].getPosition() != 11)
    			plateau.mDetective[2].setPosition(plateau.mDetective[2].getPosition() + 1);
    		else
    			plateau.mDetective[2].setPosition(0);
    		ftDetectivePlace();
    		flag2 = 1;
    		renew();
    	} else if (event.getSource() == BFlagC2) {
    		BFlagC.setVisible(false);
    		BFlagC2.setVisible(false);
    		BFlagH.setVisible(false);
    		BFlagH2.setVisible(false);
    		BFlagW.setVisible(false);
    		BFlagW2.setVisible(false);
    		if (plateau.mDetective[2].getPosition() != 10 && plateau.mDetective[2].getPosition() != 11)
    			plateau.mDetective[2].setPosition(plateau.mDetective[2].getPosition() + 2);
    		else if (plateau.mDetective[2].getPosition() == 10)
    			plateau.mDetective[2].setPosition(0);
    		else
    			plateau.mDetective[2].setPosition(1);
    		ftDetectivePlace();
    		flag2 = 1;
    		renew();
    	} else if (event.getSource() == BQuartier[0][0] || event.getSource() == BQuartier[0][1] || event.getSource() == BQuartier[0][2]
    			|| event.getSource() == BQuartier[1][0] || event.getSource() == BQuartier[1][1] || event.getSource() == BQuartier[1][2]
    			|| event.getSource() == BQuartier[2][0] || event.getSource() == BQuartier[2][1] || event.getSource() == BQuartier[2][2]) {
    		if (this.flag == 1) {
    			BCoche.setVisible(true);
    			if (event.getSource() == BQuartier[0][0] && ((i2 == 0 && j2 == 0) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[0][0].getPosition();
    				plateau.mPlateau[0][0].upPosition(); i2 = 0; j2 = 0;
    			} else if (event.getSource() == BQuartier[0][1] && ((i2 == 0 && j2 == 1) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[0][1].getPosition();
    				plateau.mPlateau[0][1].upPosition(); i2 = 0; j2 = 1;
    			} else if (event.getSource() == BQuartier[0][2] && ((i2 == 0 && j2 == 2) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[0][2].getPosition();
    				plateau.mPlateau[0][2].upPosition(); i2 = 0; j2 = 2;
    			} else if (event.getSource() == BQuartier[1][0] && ((i2 == 1 && j2 == 0) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[1][0].getPosition();
    				plateau.mPlateau[1][0].upPosition(); i2 = 1; j2 = 0;
    			} else if (event.getSource() == BQuartier[1][1] && ((i2 == 1 && j2 == 1) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[1][1].getPosition();
    				plateau.mPlateau[1][1].upPosition(); i2 = 1; j2 = 1;
    			} else if (event.getSource() == BQuartier[1][2] && ((i2 == 1 && j2 == 2) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[1][2].getPosition();
    				plateau.mPlateau[1][2].upPosition(); i2 = 1; j2 = 2;
    			} else if (event.getSource() == BQuartier[2][0] && ((i2 == 2 && j2 == 0) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[2][0].getPosition();
    				plateau.mPlateau[2][0].upPosition(); i2 = 2; j2 = 0;
    			} else if (event.getSource() == BQuartier[2][1] && ((i2 == 2 && j2 == 1) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[2][1].getPosition();
    				plateau.mPlateau[2][1].upPosition(); i2 = 2; j2 = 1;
    			} else if (event.getSource() == BQuartier[2][2] && ((i2 == 2 && j2 == 2) || i2 == -1)) {
    				if (this.flag3 == -1)
    					this.flag3 = plateau.mPlateau[2][2].getPosition();
    				plateau.mPlateau[2][2].upPosition(); i2 = 2; j2 = 2;
    			}
    			if (this.flag3 == plateau.mPlateau[i2][j2].getPosition())
    				plateau.mPlateau[i2][j2].upPosition();
    			ftQuartier();
    		}
    		else if (this.flag == 2) {
    			if (event.getSource() == BQuartier[0][0]) {
    				quartierFlag = plateau.mPlateau[0][0]; i = 0 ; j = 0 ;}
    			else if (event.getSource() == BQuartier[0][1]) {
    				quartierFlag = plateau.mPlateau[0][1]; i = 0 ; j = 1 ;}
    			else if (event.getSource() == BQuartier[0][2]) {
    				quartierFlag = plateau.mPlateau[0][2]; i = 0 ; j = 2 ;}
    			else if (event.getSource() == BQuartier[1][0]) {
    				quartierFlag = plateau.mPlateau[1][0]; i = 1 ; j = 0 ;}
    			else if (event.getSource() == BQuartier[1][1]) {
    				quartierFlag = plateau.mPlateau[1][1]; i = 1 ; j = 1 ;}
    			else if (event.getSource() == BQuartier[1][2]) {
    				quartierFlag = plateau.mPlateau[1][2]; i = 1 ; j = 2 ;}
    			else if (event.getSource() == BQuartier[2][0]) {
    				quartierFlag = plateau.mPlateau[2][0]; i = 2 ; j = 0 ;}
    			else if (event.getSource() == BQuartier[2][1]) {
    				quartierFlag = plateau.mPlateau[2][1]; i = 2 ; j = 1 ;}
    			else if (event.getSource() == BQuartier[2][2]) {
    				quartierFlag = plateau.mPlateau[2][2]; i = 2 ; j = 2 ;}
    			this.flag++;
    		}
    		else if (this.flag == 3) {
    			a = 0;
    			
    			if (event.getSource() == BQuartier[0][0] && (i != 0 || j != 0)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[0][0];
    				plateau.mPlateau[0][0] = flag;
    			}
    			else if (event.getSource() == BQuartier[0][1] && (i != 0 || j != 1)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[0][1];
    				plateau.mPlateau[0][1] = flag;
    			}
    			else if (event.getSource() == BQuartier[0][2] && (i != 0 || j != 2)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[0][2];
    				plateau.mPlateau[0][2] = flag;
    			}
    			else if (event.getSource() == BQuartier[1][0] && (i != 1 || j != 0)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[1][0];
    				plateau.mPlateau[1][0] = flag;
    			}
    			else if (event.getSource() == BQuartier[1][1] && (i != 1 || j != 1)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[1][1];
    				plateau.mPlateau[1][1] = flag;
    			}
    			else if (event.getSource() == BQuartier[1][2] && (i != 1 || j != 2)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[1][2];
    				plateau.mPlateau[1][2] = flag;
    			}
    			else if (event.getSource() == BQuartier[2][0] && (i != 2 || j != 0)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[2][0];
    				plateau.mPlateau[2][0] = flag;
    			}
    			else if (event.getSource() == BQuartier[2][1] && (i != 2 || j != 1)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[2][1];
    				plateau.mPlateau[2][1] = flag;
    			}
    			else if (event.getSource() == BQuartier[2][2] && (i != 2 || j != 2)) {
    				Quartier flag = plateau.mPlateau[i][j];
    				plateau.mPlateau[i][j] = plateau.mPlateau[2][2];
    				plateau.mPlateau[2][2] = flag;
    			}
    			else {
    				a = 1;
    			}
    			if (a != 1) {
    				ftQuartier();
    				this.flag = 0;
    				flag2 = 1;
    				renew();
    			}
    		}
    	} else if (event.getSource() == BCoche) {
    		if (this.flag == 1) {
    			this.flag = 0;
    			this.flag3 = -1;
    			flag2 = 1;
    			BCoche.setVisible(false);
    		}
    		renew();
    	}
    }
}