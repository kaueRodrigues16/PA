package Exercicio;
import java.util.Scanner;
public class ParesEImpares {

public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
	
		
		final int A=5;
		
		int a[],i;
		a=new int[A];
	
             for(i=0;i<A;i++) {
			
			System.out.print("Coloque o "+(i+1)+"º numero");
			
			a[i]=ler.nextInt();
		
       }	
             System.out.print("[a]= [ ");
            for(i=0;i<A;i++) {
 
             if(a[i]%2==0) {
            	
            	 System.out.print(a[i] +" ");
             } 
            	 else {
            		 
            		 System.out.print(a[i] +" ");
            	 }
            	
            	
            }
             }
}