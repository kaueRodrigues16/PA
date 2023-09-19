import java.util.Scanner; 
public class Fatorial {

	public static void main (String [] args) {
	
	int n, i=1, r=1;
	
	Scanner in= new Scanner (System.in);
		
	 System.out.print("coloque um numero");
	
		n=in.nextInt();
		
		while(i<=n){

	 
	 
	 r=r*i;
	 
	 
	 
	 i++;
	}

		 System.out.print(r);

	}
	 

}