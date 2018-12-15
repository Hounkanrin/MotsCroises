package Tp3;

public class TestIterator {

	public static void main(String[] args) {
		Character [] tab= new Character[8];
			
		tab[0]=null;
		tab[1]='A';
		tab[2]='B';
		tab[3]=null;
		tab[4]=null; 
		tab[5]='C';
		tab[6]='D';
		tab[7]=null;
		IterateurMots iter=new IterateurMots(tab);
		while(iter.hasNext()) {
			System.out.print(iter.next()+ ",");
		
	}
		//for(int i=0; i<8; i++)
		
		//System.out.println(""+ i  +"="+tab[i]);
				}
}
