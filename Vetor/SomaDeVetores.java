package Exercicio;
import java.util.Scanner;
public class SomaDeVetores {

	
	public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
	
		final int A=5;
		int a[], b[], c[],i;
		
		a=new int[A];
		b=new int[A];
		c=new int[A];
	
		for(i=0;i<A;i++) {
			
			System.out.print("Coloque o "+(i+1)+"º numero");
			
			a[i]=ler.nextInt();
			
			
		}
		
       for(i=0;i<A;i++) {
			
			System.out.print("Coloque o "+(i+1)+"º numero");
			
			b[i]=ler.nextInt();
			
			
			c[i]=b[i]+a[i];
		}
       
       
       
       System.out.print("\nC =");
       for(i=0;i<A; i++) {
    	   System.out.print(c[i]+ "  ");
       }
	
	}
		
	}	

