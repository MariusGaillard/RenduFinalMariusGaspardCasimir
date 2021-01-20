package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;

public class Plateau
{
	public Detective[] mDetective = new Detective[3];
	public Quartier[][] mPlateau = new Quartier[3][3];
	public ArrayList<Personnage> mTasCarte;
	public ArrayList<JetonAction> jeton = new ArrayList<JetonAction>();
	public int nbJeton;
	public Mechant mMechant;
	public int flag;
	private int mNbCase0;
	private int mTour; // 0 correspond au tour des detective et 1 au tour du mechant
	// maintenant, c'est juste le nombre de tour et je ferai un %

	public Plateau() {
		Random rand = new Random();
		this.mTour = 0;
		this.mNbCase0 = 9;
		this.nbJeton = 4;
		
		jeton.add(new JetonHolmesAlibi());
		jeton.add(new JetonRotationEchange());
		jeton.add(new JetonRotationJoker());
		jeton.add(new JetonWatsonLeChien());
		for (int i = 0 ; i < 4 ; i++)
			jeton.get(i).ftHasard();
		
		flag = -1;
		mDetective[0] = new Detective("Holmes", 11);
		mDetective[1] = new Detective("Watson", 3);
		mDetective[2] = new Detective("M. Le Chien", 7);

		mTasCarte = new ArrayList<Personnage>();
		mTasCarte.add(new Personnage("Rose", 2));
		mTasCarte.add(new Personnage("Blanc", 1));
		mTasCarte.add(new Personnage("Orange", 1));
		mTasCarte.add(new Personnage("Violet", 1));
		mTasCarte.add(new Personnage("Vert", 1));
		mTasCarte.add(new Personnage("Jaune", 1));
		mTasCarte.add(new Personnage("Gris", 1));
		mTasCarte.add(new Personnage("Noir", 0));
		mTasCarte.add(new Personnage("Bleu", 0));
		Collections.shuffle(mTasCarte);

		mPlateau[0][0] = new Quartier(3, mTasCarte.get(0));
		mPlateau[0][1] = new Quartier(rand.nextInt(4), mTasCarte.get(1));
		mPlateau[0][2] = new Quartier(1, mTasCarte.get(2));
		mPlateau[1][0] = new Quartier(rand.nextInt(4), mTasCarte.get(3));
		mPlateau[1][1] = new Quartier(rand.nextInt(4), mTasCarte.get(4));
		mPlateau[1][2] = new Quartier(rand.nextInt(4), mTasCarte.get(5));
		mPlateau[2][0] = new Quartier(rand.nextInt(4), mTasCarte.get(6));
		mPlateau[2][1] = new Quartier(2, mTasCarte.get(7));
		mPlateau[2][2] = new Quartier(rand.nextInt(4), mTasCarte.get(8));

		Collections.shuffle(mTasCarte);
		mMechant = new Mechant(mTasCarte.get(0));
		mTasCarte.remove(0);
	}

	public void setNbCase0(int nbCase0) {
		this.mNbCase0 = nbCase0;
	}

	public int getNbCase0() {
		return (this.mNbCase0);
	}

	public void changeTour() {
		this.mTour++;
	}

	public int getTour() {
		return (this.mTour);
	}
}