package org.sid;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MaFenetre extends JDialog implements ActionListener{
	
	//Déclaration des composants
	private JLabel titre;
	private JTextField texte;
	private JButton btn1, btn2, btn3;
	private List list1, list2;
	private JLabel description;
	
	public MaFenetre() {
		
		//Instanciation des composants
		titre = new JLabel("Récepteur: ");
		texte = new JTextField(15);
		btn1 = new JButton("Ajouter");
		btn2 = new JButton("Charger");
		btn3 = new JButton("Sérialiser");
		list1 = new List();
		list2 = new List();
		description = new JLabel("Ok");
		
		//Disposition des éléments situés au nord
		JPanel panelNord = new JPanel();
		panelNord.setLayout(new FlowLayout());
		panelNord.add(titre);
		panelNord.add(texte);
		panelNord.add(btn1);
		panelNord.add(btn2);
		panelNord.add(btn3);
		
		this.setLayout(new BorderLayout());
		this.add(panelNord, BorderLayout.NORTH);
		
		JPanel panelCentre = new JPanel();
		panelCentre.setLayout(new GridLayout());
		panelCentre.add(list1);
		panelCentre.add(list2);
		this.add(panelCentre, BorderLayout.CENTER);
		
		this.add(description, BorderLayout.SOUTH);
		
		//Ajout du gestionnaire d'evênement aux boutons
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		
		//
		this.setBounds(10,10,700,500);
		this.setVisible(true);
		this.setModal(true);
		setAlwaysOnTop(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn1) {
			String valeur = texte.getText();
			if(valeur.length()!=0) {
				list1.add(valeur);
				texte.setText(null);
				description.setText("Ajout effectué avec succès!");
			}
		}
		if(e.getSource()==btn2) {
			System.out.println("btn2");
		}
		if(e.getSource()==btn3) {
			System.out.println("btn3");
		}
	}

}
