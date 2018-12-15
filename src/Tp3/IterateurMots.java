package Tp3;

import java.util.Iterator;

public class IterateurMots implements Iterator<String>{
	
	private Object[] tab;
	private int lcurseur;

	//constructeur
	public IterateurMots(Object[] t) {
		this.tab=t;
		lcurseur=0; 
		while(lcurseur<tab.length && tab[lcurseur]==null){
			lcurseur++;
		}
		
	}
	@Override
	public boolean hasNext() {
		if(lcurseur<tab.length)
			return true; 
		else 
			return false;
	}

	@Override
	public String next() {
		String val="";
		while(tab[lcurseur]==null && lcurseur<tab.length) {
			lcurseur++; 			
		}
		 while(lcurseur<tab.length && tab[lcurseur]!=null) {
			 val = val + tab[lcurseur].toString();
			 lcurseur++;
		 }
		lcurseur++;
		return val;
	}
}