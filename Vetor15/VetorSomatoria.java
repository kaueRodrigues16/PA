package Exercicios;
import java.util.Scanner;
public class VetorSomatoria {

	public static void main(String[]args) {
	
		Scanner in= new Scanner(System.in);	
		
		final int TAM=15;
		int a[],b[],j,x=0;
		a= new int[TAM];
		b= new int[TAM];
		
		for(j=0; j<TAM; j++) {
			System.out.print("digite o " + (j+1) +"numero");
			
			a[j]=in.nextInt();
		
			
			}
		
	       System.out.print("a[]=[ ");
			
			for(j=0; j<TAM; j++) {
			 
				
				System.out.print(a[j] + " ");
			}
			
			
			System.out.println( "]");

			
			for(j=0;j<TAM;j++) {
				x=x+a[j];
				
			
				
				b[j]=x;
			
			
			}
			 
			
			
			System.out.print("b[]=[ ");
			for(j=0;j<TAM;j++) {
				
				
			System.out.print(b[TAM-1-j]+" ");
			}
			
			System.out.println("]");
			
			
			in.close();
}
}
