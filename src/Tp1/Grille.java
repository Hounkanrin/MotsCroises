package Tp1;

public class Grille {

	private int hauteur;
	private int largeur; 
	private String grille [] [] ; 
	
	//private String Cellule [] [];
	
	
	// accesseurs et modificateurs 
	
	public int getHauteur() {
		return hauteur;
	}

	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	public int getLargeur() {
		return largeur;
	}

	public void setLargeur(int largeur) {
		this.largeur = largeur;
	}
	/*public int[][] getGrille() {
		return grille;
	}

	public void setGrille(int tab[][]) {
		this.grille = tab;
	}
*/
	public String getCellule( int lig, int col) {
		String val; 
		val = grille[lig][col];
		return val;
	}
	
	public void setCellule( int lig, int col, String ch) {
		//lig= lig-1;
		//col= col-1; 
		if (lig<0 || col<0 || lig>hauteur || col>largeur) {
			System.out.println("Erreur"); 
		}
		else {
		
			grille[lig][col]=ch;
		}
		 	
	}
	
	
	// constructeur 
	
	 public Grille(int h, int l) {
		 hauteur= h; 
		 largeur = l; 
		grille = new String [hauteur] [largeur]; 
		//int lig= ligne; 
		
	    //String Cellule = int (lig, col);  
		
		// remplissage du de la grille 
		
		 //for(int i =0; i < hauteur; i++) {
			 //for(int j=0; j < largeur; j++) {
				 
				 //grille  [i] [j]= 2;
			 //}
			 
		 
	
	 }
	 
	 // affichage 
	 public void AfficherGrille() {
		 System.out.println();
		 
		 for(int i =0; i < hauteur; i++) {
			 for(int j=0; j < largeur; j++) {
				 
				System.out.print(" |  " +grille [i][j]);
			 }
			 System.out.println(" | ");
		 }
		 System.out.println();
	 }
	 
 }


