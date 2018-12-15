package Tp1;

public class TestGrille {

	public static void main(String[] args) {
		
		 /*System.out.println("entrer un nombre entier");
			Scanner sc1= new Scanner(System.in); 
			int nblu= sc1.nextInt(); 
			System.out.println("vous avez saisie :" + nblu); 
			
			
			System.out.println("entrer une chaine de caractère");
			Scanner sc2= new Scanner(System.in); 
			String nblu2= sc2.nextLine(); 
			System.out.println("vous avez saisie :" + nblu2); 
			
			*/
		Grille g1= new Grille(6, 6);
		//Grille g2= new Grille(3,4);
		//MotsCroises g1= new MotsCroises(6,6);
		
		
		
		g1.setCellule(0,0," ");
		g1.setCellule(0,1," ");
		g1.setCellule(0,2," ");
		g1.setCellule(0,3," ");
		g1.setCellule(0,4," ");
		g1.setCellule(0,5," ");
		
		g1.setCellule(1,0," ");
		g1.setCellule(1,1," ");
		g1.setCellule(1,2," ");
		g1.setCellule(1,3," ");
		g1.setCellule(1,4,"null");
		g1.setCellule(1,5," ");
		
		g1.setCellule(2,0," ");
		g1.setCellule(2,1," ");
		g1.setCellule(2,2," ");
		g1.setCellule(2,3," ");
		g1.setCellule(2,4," ");
		g1.setCellule(2,5,"null");
		
		g1.setCellule(3,0," ");
		g1.setCellule(3,1," ");
		g1.setCellule(3,2," ");
		g1.setCellule(3,3," ");
		g1.setCellule(3,4," ");
		g1.setCellule(3,5," ");
							
		g1.setCellule(4,0," ");
		g1.setCellule(4,1," ");
		g1.setCellule(4,2," ");
		g1.setCellule(4,3," ");
		g1.setCellule(4,4,"null");
		g1.setCellule(4,5," ");
		
		g1.setCellule(5,0," ");
		g1.setCellule(5,1," ");
		g1.setCellule(5,2," ");
		g1.setCellule(5,3," ");
		g1.setCellule(5,4," ");
		g1.setCellule(5,5," ");
		
		
		//g1.setDefinition(2,3,true, "b");
		
		
		g1.AfficherGrille();
		
		/*System.out.println();
		
		g2.setHauteur(2);
		g2.setLargeur(3);
		g2.AfficherGrille();
		
		System.out.println("la hauteur de la grille est :" + g2.getHauteur());
		System.out.println("la largeur de la grille est :" + g2.getLargeur());
		System.out.println("la cellule concernée est egal a : " + g2.getCelllule(3,2));
		}
		*/

	}

}
