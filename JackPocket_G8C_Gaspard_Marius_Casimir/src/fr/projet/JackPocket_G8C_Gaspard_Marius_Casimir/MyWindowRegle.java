package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class MyWindowRegle extends JFrame implements ActionListener {

    private static final long serialVersionUID = -4939544011287453046L;
    public JLayeredPane layeredPane;
    public JLabel LFond;
    public JLabel LRegle;
    public JButton BCroix;
    public JButton BFleche;
    public int i;
    
    public MyWindowRegle(boolean rules) {
    	i = 1;
    	
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
    	
    	LRegle = new JLabel();
    	if (rules == true)
    		LRegle.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Regles_page1.png")));
    	else
    		LRegle.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Appli.png")));
    	LRegle.setBounds(50, 20, 740, 670);
        
        BCroix = new JButton();
        BCroix.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Croix.png")));
        BCroix.setBounds(750, 690, 80, 80);
        BCroix.addActionListener((ActionListener) this);
        
        BFleche = new JButton();
        BFleche.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/image-2.png")));
        BFleche.setBounds(650, 690, 80, 80);
        BFleche.addActionListener((ActionListener) this);
        
        layeredPane.add(BCroix);
        layeredPane.add(LRegle);
        if (rules == true)
        	layeredPane.add(BFleche);
    	layeredPane.add(LFond, Integer.valueOf(-1));
    	this.add(layeredPane);

    }
    
    @Override
    public void actionPerformed( ActionEvent event) {
    	if (event.getSource() == BCroix) {
    		this.dispose();
    		MyWindowBase myWindowBase = new MyWindowBase();
    		myWindowBase.setVisible(true);
    	}
    	
    	if (event.getSource() == BFleche) {
    		i++;
    		if (i >= 4) {
    			//LRegle.setVisible(false);
    			LRegle.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Regles_page" + 4 + ".png")));
    			BFleche.setVisible(false);
    		}
    		else {
    			LRegle.setIcon(new ImageIcon(MyWindowBase.class.getResource("/Image_MrJack2/Regles_page" + i + ".png")));
    		}
    	}
    }
}