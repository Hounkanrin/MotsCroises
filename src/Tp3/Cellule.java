package Tp3;

import Tp1.Grille;

 class Cellule {
	private char solution; 
	private char proposition; 
	private char horizontal; 
	private char vertical;
	private boolean noire;
	
	//constructeur
	public Cellule (char sol, char prop, char defhoriz, char defvert, boolean n) {
		this.solution=sol;
		this.proposition=prop;
		this.horizontal=defhoriz;
		this.vertical=defvert;
		this.noire=n; 
	}
  public char getSolution(char solution) {
	  return solution;
  }
  public void setSolution(char sol) {
	  this.solution=sol;
  }
  public char getProposition() {
	return proposition;
}
  public void setProposition(char proposition) {
	this.proposition = proposition;
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
  
  
  
  
public char getHorizontal() {
	return horizontal;
}
public void setHorizontal(char horizontal) {
	this.horizontal = horizontal;
}
	public char getVertical(char vertical) {
		return vertical; 
	}
	
	public boolean isNoire() {
		return noire;
	}
	public void setNoire(boolean noire) {
		this.noire = noire;
	}
  
  
	
}
