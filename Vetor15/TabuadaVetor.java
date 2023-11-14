package Exercicios;
import java.util.Scanner;
public class TabuadaVetor {

	public static void main(String[]args) {
	
		Scanner in= new Scanner(System.in);
		
		int a[], i,n,r;
		
		a= new int[5];
		
		for(i=0; i<5; i++) {
		System.out.print("digite o " + (i+1) +"numero");
		
		a[i]=in.nextInt();
	
		
		}
	
		System.out.print("a[]=[ ");
		
		for(i=0; i<5; i++) {
		 
			
			System.out.print(a[i] + " ");
		}
		
		System.out.print( "]");
	
		for(i=0; i<5; i++) {
		for(n=0;n<11;n++) {
		
			r=a[i]*n;
			System.out.println(" ");
			System.out.println(a[i]+"x"+n+"="+r);
			
			
			
		}	
		}	
			
			
			in.close();
	
	}
}
