package org.sid;

import javax.swing.table.AbstractTableModel;

public class MonModele extends AbstractTableModel{ 
   
	Object donnees[][];
	String titres[];
	public MonModele(Object donnees[][], String titres[]){ 
      this.donnees = donnees; 
      this.titres = titres; 
   } 
	//Retourne le nombre d'enrégistrement
   public int getColumnCount(){ 
      return donnees[0].length; 
   }
   //Recupère un enrégistrement en fonction de ses coordonnées
   public Object getValueAt(int ligne, int colonne){ 
      return donnees[ligne][colonne]; 
   }
   //Retourne le nombre de colonne
   public int getRowCount() { 
      return donnees.length; 
   }
   //Retourne le nom de la colonne
   public String getColumnName(int col){ 
      return titres[col]; 
   } 
}