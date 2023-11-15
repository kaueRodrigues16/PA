package Exercicios;
import java.util.Scanner;
public class VetorParesAtéOInfinito {

public static void main(String[]args) {
		
		Scanner in= new Scanner(System.in);
		final int TAM=10;
		int a[], i,n,r;
		a= new int[TAM];
		
		for(i=0; i<TAM; i++) {
		System.out.print("digite o " + (i+1) +"numero");
		
		a[i]=in.nextInt();
	
		
		}
	
       System.out.print("a[]=[ ");
		
		for(i=0; i<TAM; i++) {
		 
			
			System.out.print(a[i] + " ");
		}
		
		System.out.print( "]");
		
		for(i=0; i<TAM; i++) {
			System.out.println("Para a["+i+"]"+"=" +a[i]);
		if(a[i]%2==0) {
			for(n=a[i]-2; n>=0; n=n-2) {
		//a[i]-2 para que o proprio a[i] naõ esteja incluso
			 System.out.println(" ");
			 System.out.println(n);
			}
		}
			
			else {
				
					
					for(n=a[i]-1; n>=0; n=n-2) {
						//a[i]-1 pois a[i] é impar
							 System.out.println(" ");
							 System.out.println(n);
							}
			
				}
		 
		 
		
		in.close();
		}
}
}