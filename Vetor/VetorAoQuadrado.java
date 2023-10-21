package Exercicios;
import java.util.Scanner;
public class VetorAoQuadrado {

	public static void main (String [] args) {
		 
		Scanner in = new Scanner (System.in);
		
		int a[]= new int [10], i;
		
	
		
		for(i=0; i<10; i++) {
		
		System.out.println("coloque o " +(i+1)+ "º numero");
		
		a[i]=in.nextInt();
		
		}
		
		System.out.print("[a] = [ ");
		for(i=0; i<10; i++) {
		
		System.out.print(a[i]*a[i] +" " );	
			
			}
       System.out.print(" ]");
	      
	}
}
