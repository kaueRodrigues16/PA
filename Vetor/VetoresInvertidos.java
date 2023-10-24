package Exercicio;
import java.util.Scanner;
public class VetoresInvertidos {
	public static void main (String []args) {
		
		   Scanner in= new Scanner (System.in);	
		   
		   final int TAM=10;
		   int a[], b[], i ;
		   
		   a=new int [TAM];
		   b=new int[TAM];
		   
		   for(i=0;i<TAM;i++) {
		   
			   System.out.println("coloque o" +(i+1)+ "numero");
			   
			   a[i]=in.nextInt();
		   }
		   
		   System.out.print("[b]= [ ");
		   for(i=0;i<TAM;i++) {
		  
			   b[i]=a[TAM-1-i];
			    
		   System.out.print(b[i] +" ");
			}
		   System.out.print(" ]");
			   
			   in.close();
		}
}
