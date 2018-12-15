package Tp3;

public class GrilleGen <E> implements SpecifGrilleGen<E> {
	
	protected int hauteur;
	protected int largeur; 
	private E tab [] [] ; 
	
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
	
	public E getCellule( int lig, int col) {
		E val; 
		val = tab [lig][col];
		return val;
	}
	
	public void setCellule(int lig, int col, E ch) {
		tab[lig][col]= ch;
		
	}
	public IterateurMots iterateurMots (boolean horizontal, int num) {
		 if(horizontal) {
			 IterateurMots iterCol;
			 iterCol= new IterateurMots(tab[num]);
			 return iterCol;
		 }
		 else 
		 { IterateurMots iterLig;
		 
			 iterLig=new IterateurMots(tab);
			 return iterLig;
		 }	
		 
	 }
	 	
	
	// constructeur 
	
	 @SuppressWarnings("unchecked")
	public GrilleGen(int h, int l) {
		 hauteur= h; 
		 largeur = l; 
		tab = (E[][]) new Object [hauteur] [largeur]; 
		
	 }
	 
	 // affichage 
	 public void AfficherGrille() {
		 System.out.println();
		 
		 for(int i =0; i < hauteur; i++) {
			 for(int j=0; j < largeur; j++) {
				 
				System.out.print(" |  " +tab [i][j]);
			 }
			 System.out.println(" | ");
		 }
		 System.out.println();
	 }


}
