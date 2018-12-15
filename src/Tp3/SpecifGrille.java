package Tp3;

public interface SpecifGrille {

	int getHauteur();

	void setHauteur(int hauteur);

	int getLargeur();

	void setLargeur(int largeur);

	/*public int[][] getGrille() {
			return grille;
		}
	
		public void setGrille(int tab[][]) {
			this.grille = tab;
		}
	*/
	String getCellule(int lig, int col);

	void setCellule(int lig, int col, String ch);

	// affichage 
	void AfficherGrille();

}