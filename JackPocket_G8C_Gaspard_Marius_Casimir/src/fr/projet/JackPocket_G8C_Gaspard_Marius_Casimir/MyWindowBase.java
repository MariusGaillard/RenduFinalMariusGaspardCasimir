package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

import java.awt.Font;

public class MyWindowBase extends JFrame implements ActionListener {

    private static final long serialVersionUID = -4939544011287453046L;
    public JLabel LFond;
    public JLayeredPane layeredPane;
    public JButton BRegle;
    public JButton BDuel;
    public JButton BAppli;
    public JButton BCoche;
    public JTextField textField;
    public JTextField textField2;
    
    public MyWindowBase() {
    	
    	layeredPane = new JLayeredPane();
    	layeredPane.setBounds(0, 0, 840, 800);
    	
    	this.setTitle("MrJackAndPocket");
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	this.setResizable(false);
    	this.setSize(840, 800);
    	this.setLocationRelativeTo(null);

    	LFond = new JLabel();
    	LFond.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/ArrierePlan.png")));
    	LFond.setBounds(0, 0, 840, 800);
    	
    	BRegle = new JButton( "Didactitiel - Regle" );
        BRegle.setFont(new Font("Roboto", Font.PLAIN, 25));
        BRegle.setBounds(50, 300, 366, 50);
        BRegle.addActionListener((ActionListener) this);
        
        BAppli = new JButton( "Jouer avec cette application" );
        BAppli.setFont(new Font("Roboto", Font.PLAIN, 25));
        BAppli.setBounds(50, 375, 366, 50);
        BAppli.addActionListener((ActionListener) this);
        
        BDuel = new JButton( "Duel (meme ecran)" );
        BDuel.setFont(new Font("Roboto", Font.PLAIN, 25));
        BDuel.setBounds(50, 450, 366, 50);
        BDuel.addActionListener((ActionListener) this);
    	
        layeredPane.add(BRegle);
        layeredPane.add(BDuel);
        layeredPane.add(BAppli);
    	layeredPane.add(LFond, Integer.valueOf(-1));
    	this.add(layeredPane);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BRegle) {
    		this.dispose();
    		MyWindowRegle myWindowRegle = new MyWindowRegle(true);
    		myWindowRegle.setVisible(true);
    	} else if (e.getSource() == BAppli) {
    		this.dispose();
    		MyWindowRegle myWindowRegle = new MyWindowRegle(false);
    		myWindowRegle.setVisible(true);
    	} else if (e.getSource() == BDuel) {
    		BCoche = new JButton();
            BCoche.setFont(new Font("Roboto", Font.PLAIN, 25));
            BCoche.setBounds(430, 548, 50, 50);
            BCoche.addActionListener((ActionListener) this);
            BCoche.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Coche.png")));
            layeredPane.add(BCoche);
            
            textField = new JTextField();
            textField.setBounds(125, 525, 291, 50);
            textField.setFont(new Font("Roboto", Font.PLAIN, 25));
            textField.setText("Detective");
            layeredPane.add(textField);
            
            textField2 = new JTextField();
            textField2.setBounds(125, 575, 291, 50);
            textField2.setFont(new Font("Roboto", Font.PLAIN, 25));
            textField2.setText("MrJack");
            layeredPane.add(textField2);
    	} else if (e.getSource() == BCoche) {
    		this.dispose();
    		MyWindowDuel myWindowDuel = new MyWindowDuel(textField.getText(), textField2.getText(), new Plateau());
    		myWindowDuel.setVisible(true);
    	}
	}
}

















