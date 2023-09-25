package Exercicio;

public class Tabuadas1A10 {

	public static void main (String[] args) {
	
		int i=1, r=0, n, m;
		for(n=1;n!=11; n++) {

		for(m=0; m!=11;m++) {
		
		r= n*m;
		
		System.out.println(" ");
		
		System.out.println(n+"x"+m+"="+r);
			
		}
     i++;
		
		}
}
}