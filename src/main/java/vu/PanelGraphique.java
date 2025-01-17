package vu;

import controleur.Controleur;

import javax.swing.*;
import java.awt.*;

public class PanelGraphique extends JPanel{
	/**
	 * Serial Id
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Le texte
	 */
	JLabel texte;
	
	/**
	 * Le bouton pour ouvir le Popup
	 */
	JButton ouvrir;
	
	GridBagConstraints gridbag = new GridBagConstraints();
	
	public PanelGraphique() {
		
		setLayout(new GridBagLayout());
    	gridbag.insets = new Insets(0, 0, 50, 0);
		texte = new JLabel("Diagramme Heure par Heure");
		add(texte,gridbag);
		gridbag.gridy = 2;
		ouvrir = new JButton("Ouvrir");
		ouvrir.setFocusPainted(false);
		add(ouvrir,gridbag);
	}
	
	public void enregistreEcouteur(Controleur controleur) {
		ouvrir.setActionCommand("ouvrir");
		ouvrir.addActionListener(controleur);
	}
}
