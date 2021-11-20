package org.sid;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class ExempleJTable extends JFrame{
	
	private JLabel titre;
	private JTable table;
	private List<Etudiant> etudiants;
	

	public ExempleJTable() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		titre = new JLabel("Liste des étudiants");
		String entete[] = {"Numéro","Noms","Adresse","Téléphone"};
		etudiants = new ArrayList<ExempleJTable.Etudiant>();
		etudiants.add(new Etudiant(1, "", "", ""));
		etudiants.add(new Etudiant(2, "", "", ""));
		etudiants.add(new Etudiant(3, "", "", ""));
		etudiants.add(new Etudiant(4, "", "", ""));
		etudiants.add(new Etudiant(5, "", "", ""));
		etudiants.add(new Etudiant(6, "", "", ""));
		etudiants.add(new Etudiant(7, "", "", ""));
		Object[][] donnees = new Object[etudiants.size()][entete.length];
		for(int i=0; i<etudiants.size(); i++) {
			donnees[i][0] = etudiants.get(i).getId();
			donnees[i][1] = etudiants.get(i).getNames();
			donnees[i][2] = etudiants.get(i).getAddress();
			donnees[i][3] = etudiants.get(i).getPhone();
		}
		MonModele modele = new MonModele(donnees, entete);
		table = new JTable(modele);
		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout());
		pane.add(table);
		
		setLayout(new BorderLayout());
		add(titre, BorderLayout.NORTH);
		add(pane, BorderLayout.CENTER);
		
		setSize(1000, 500);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new ExempleJTable();
	}
	
	 class Etudiant{
		private int id;
		private String names;
		private String address;
		private String phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNames() {
			return names;
		}
		public void setNames(String names) {
			this.names = names;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		Etudiant(int id, String names, String address, String phone) {
			this.id = id;
			this.names = names;
			this.address = address;
			this.phone = phone;
		}
		
	}
}
