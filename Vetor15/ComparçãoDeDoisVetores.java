package Exercicios;
import java.util.Scanner;
public class ComparçãoDeDoisVetores {

	public static void main(String[] args) {
		
		 Scanner in= new Scanner(System.in);
		   
		   final int TAM=10;
		   int a[],b[],c[],i;
		   a= new int[TAM];
	       b= new int[TAM];
           c= new int[TAM];
	    
	    for(i=0;i<TAM;i++) {

	 	   System.out.print("digite o " + (i+1) +"numero do vetor a[]");
				
				a[i]=in.nextInt();
	  
	    }
		
	    for(i=0;i<TAM;i++) {

		 	   System.out.print("digite o " + (i+1) +"numero do vetor b[]");
					
					 b[i]=in.nextInt();
			      
		    }
			
	    System.out.print("c[]=[ ");
	    for(i=0;i<TAM;i++) {
		
			if(a[i]>b[i]) {
				
			c[i]=1;	
			
			System.out.print(c[i]+" ");
			
			}
		
			else if(a[i]<b[i]) {
				
				c[i]=-1;	
				
				System.out.print(c[i]+" ");
				
				}
			
			else {
				c[i]=0;
				System.out.print(c[i]+" ");
			}
		
		}
		
	    System.out.print(" ]");	
	    
	    
	    
	    
	    
		in.close();
	}

}
