package Tp3;

public class TestMotsCroisesAvecHeritage {

	public static void main(String[] args) {
@SuppressWarnings("rawtypes")
MotsCroisesAvecHeritage g1= new MotsCroisesAvecHeritage(6,6);
		
		
		
		g1.setSolution(0,0,' ');
		g1.setSolution(0,1,'A');
		g1.setSolution(0,2,' ');
		g1.setSolution(0,3,' ');
		g1.setSolution(0,4,' ');
		g1.setSolution(0,5,'B');
		
		g1.setSolution(1,0,' ');
		g1.setSolution(1,1,' ');
		g1.setSolution(1,2,' ');
		g1.setSolution(1,3,' ');
		g1.setCaseNoire(1,4,true);
		g1.setSolution(1,5,' ');
	
		g1.setSolution(2,0,' ');
		g1.setSolution(2,1,' ');
		g1.setSolution(2,2,' ');
		g1.setSolution(2,3,' ');
		g1.setSolution(2,4,' ');
		g1.estCaseNoire(2, 5);
		g1.setCaseNoire(2,5,true);
				
		g1.setSolution(3,0,' ');
		g1.setSolution(3,1,' ');
		g1.setSolution(3,2,' ');
		g1.setSolution(3,3,' ');
		g1.setSolution(3,4,' ');
		g1.setSolution(3,5,' ');
						
		g1.setSolution(4,0,' ');
		g1.setSolution(4,1,' ');
		g1.setSolution(4,2,' ');
		g1.setSolution(4,3,' ');
		g1.setCaseNoire(4,4,true);
		g1.setSolution(4,5,' ');
		
		g1.setSolution(5,0,' ');
		g1.setSolution(5,1,' ');
		g1.setSolution(5,2,' ');
		g1.setSolution(5,3,' ');
		g1.setSolution(5,4,' ');
		g1.setSolution(5,5,' ');
						
		
		
		//g1.setDefinition(2,3,true, "b");
		
		
		g1.AfficherMotsCroisesAvecHeritage();
		
		
	}


		
	
	}


