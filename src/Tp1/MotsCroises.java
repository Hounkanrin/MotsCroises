package Tp1;

public class MotsCroises {
	private Grille solution; 
	private Grille proposition; 
	private Grille horizontal; 
	private Grille vertical;
	
	
	private int hauteur; 
	private int largeur; 
	
	
	public MotsCroises(int h, int l) {
		this.hauteur=h;
		this.largeur=l;
		solution=new Grille (hauteur, largeur);
		proposition=new Grille (hauteur, largeur);
		horizontal= new Grille (hauteur, largeur);
		vertical=new Grille (hauteur, largeur);
		
					
	}

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
	
	public boolean estCaseNoire(int lig, int col) {
		return(solution.getCellule(lig, col)==null);
}
	
	public void setCaseNoire(int lig, int col, boolean noire) {
		//if(lig<0 || col<0 || lig>hauteur || col>largeur){
			//System.out.println("Erreur"); 
		//}
		//else 
			if (noire) {
		solution.setCellule(lig, col,null);
		proposition.setCellule(lig, col, null); 
		horizontal.setCellule(lig, col, null);
		vertical.setCellule(lig, col, null);
		}
		}
		
	public char getSolution(int lig, int col) {
		return solution.getCellule(lig, col).charAt(0);
	}

	public void setSolution(int lig, int col, char sol) {
		solution.setCellule(lig, col, String.valueOf(sol));
	}
	

	public char getProposition(int lig, int col) {
		return proposition.getCellule(lig, col).charAt(0);
	}

	public void setProposition(int lig, int col, char prop) {
		this.proposition.setCellule(lig, col, String.valueOf(prop)); 
	}
	
	public String getDefinition(int lig, int col, boolean horiz) {
		if(horiz == true) {
			return horizontal.getCellule(lig, col);
	}
		else {
			return vertical.getCellule(lig, col);
		}	
	}
	
	public void setDefinition(int lig, int col, boolean horiz, String def) {
		if(horiz) {
			horizontal.setCellule(lig, col, def);
		}
		else {
			 vertical.setCellule(lig, col, def);
		}
	}

	
	
//afficher 
	public void AfficherMotsCroises() {
			 System.out.println();
			 
			 for(int i =0; i < solution.getHauteur(); i++) {
				 for(int j=0; j < solution.getLargeur(); j++) {
										 
				System.out.print("|" + solution.getCellule(i,j));
				 }
				 System.out.println("|");
			 }
			 System.out.println();
		 }
	
}
	/*public void AfficherGrille() {
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
*/


