package org.sid;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MonMenu extends JFrame implements ActionListener{
	
	private JMenuBar bar;
	private JMenu fichier, edition, aide;
	private JMenuItem nouveau, fermer, copier,coller, contact;
	
	public MonMenu() {
		//arrêt du processus qui lance le programme à la fermeture de la fenêtre
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		bar = new JMenuBar();
		
		fichier = new JMenu("Fichier");
		edition = new JMenu("Edition");
		aide = new JMenu("Aide");
		
		nouveau = new JMenuItem("Nouveau");
		fermer = new JMenuItem("Fermer");
		copier = new JMenuItem("Copier");
		coller = new JMenuItem("Coller");
		contact = new JMenuItem("Contact");
		
		fichier.add(nouveau);
		fichier.add(fermer);
		edition.add(copier);
		edition.add(coller);
		aide.add(contact);
		bar.add(fichier);
		bar.add(edition);
		bar.add(aide);
		
		//Ajout du gestionnaire d'évênement
		nouveau.addActionListener(this);
		fermer.addActionListener(this);
		
		setLayout(new BorderLayout());
		add(bar, BorderLayout.NORTH);
		setSize(1200, 700);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MonMenu();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==nouveau) {
			new MaFenetre();
		}
		if(e.getSource()==fermer) {
			//new MaFenetre();
		}
	}

}
