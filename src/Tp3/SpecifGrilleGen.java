package Tp3;

	public interface SpecifGrilleGen <E> {

		int getHauteur();

		void setHauteur(int hauteur);

		int getLargeur();

		void setLargeur(int largeur);

		E getCellule(int lig, int col);

		void setCellule(int lig, int col, E ch);
	 
		void AfficherGrille();
	}


