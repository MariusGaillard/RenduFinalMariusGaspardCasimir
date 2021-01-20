package fr.projet.JackPocket_G8C_Gaspard_Marius_Casimir;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class MyWindowEnd extends JFrame implements ActionListener {
	private static final long serialVersionUID = -4939544011287453046L;
    public JLabel LFond;
    public JLabel LMot;
    public JButton BCroix;
    public JLayeredPane layeredPane;
    public JTextField textField;
    public JTextField textField2;
    
    public MyWindowEnd(String str) {
    	
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
    	
    	LMot = new JLabel(str);
    	LMot.setBounds(100, 200, 740, 200);
    	LMot.setOpaque(true);
    	LMot.setBackground(Color.white);
    	
    	BCroix = new JButton();
        BCroix.setIcon(new ImageIcon(MyWindowRegle.class.getResource("/Image_MrJack2/Croix.png")));
        BCroix.setBounds(750, 690, 80, 80);
        BCroix.addActionListener((ActionListener) this);
    	
    	layeredPane.add(LFond, Integer.valueOf(-1));
    	layeredPane.add(LMot, Integer.valueOf(1));
    	layeredPane.add(BCroix);
    	this.add(layeredPane);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == BCroix) {
    		this.dispose();
    		MyWindowBase myWindowBase = new MyWindowBase();
    		myWindowBase.setVisible(true);
    	}
	}
}
