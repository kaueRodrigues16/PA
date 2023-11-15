package Exercicios;
import java.util.Scanner;
public class VetorFatorial {
	public static void main(String[] args) {
		
		
	Scanner in= new Scanner(System.in);	
	
	final int TAM=15;
	int a[],b[],i,n,r;
	a= new int[TAM];
	b= new int[TAM];
	
	for(i=0; i<TAM; i++) {
		System.out.print("digite o " + (i+1) +"numero");
		
		a[i]=in.nextInt();
	
		
		}
	
       System.out.print("a[]=[ ");
		
		for(i=0; i<TAM; i++) {
		 
			
			System.out.print(a[i] + " ");
		}
		
		System.out.print( "]");
		
		System.out.println(" ");
		
		  System.out.print("b[]=[ ");
		for(i=0; i<TAM; i++) {
		r=1;
		//esse r=1 antes "for n" é para que le sempre volte valendo 1.
			for(n=1;n<=a[i];n++) {
		
	   r=r*n;
		b[i]=r;
			
		
		}
			System.out.print(b[i] + " ");
		
		}
		System.out.print( "]");
		
		in.close();
	}
}
