package Tp3;

public class Grille implements SpecifGrille {
	private int hauteur;
	private int largeur; 
	private String grille [] [] ; 
	
	//private String Cellule [] [];
	
	
	// accesseurs et modificateurs 
	
	/* (non-Javadoc)
	 * @see Tp3.SpecifGrille#getHauteur()
	 */
	@Override
	public int getHauteur() {
		return hauteur;
	}

	/* (non-Javadoc)
	 * @see Tp3.SpecifGrille#setHauteur(int)
	 */
	@Override
	public void setHauteur(int hauteur) {
		this.hauteur = hauteur;
	}

	/* (non-Javadoc)
	 * @see Tp3.SpecifGrille#getLargeur()
	 */
	@Override
	public int getLargeur() {
		return largeur;
	}

	/* (non-Javadoc)
	 * @see Tp3.SpecifGrille#setLargeur(int)
	 */
	@Override
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
	/* (non-Javadoc)
	 * @see Tp3.SpecifGrille#getCellule(int, int)
	 */
	@Override
	public String getCellule( int lig, int col) {
		String val; 
		val = grille[lig][col];
		return val;
	}
	
	/* (non-Javadoc)
	 * @see Tp3.SpecifGrille#setCellule(int, int, java.lang.String)
	 */
	@Override
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
	 /* (non-Javadoc)
	 * @see Tp3.SpecifGrille#AfficherGrille()
	 */
	@Override
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


