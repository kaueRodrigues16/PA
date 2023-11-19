package Exercicios;
import java.util.Scanner;
public class VetorInterseçao {
	public static void main(String[] args) {
		
		 Scanner in= new Scanner(System.in);
		   
		   final int TAM=5;
		   int a[],b[],c[],i,j;
		   a= new int[TAM];
	       b= new int[TAM];
	       c= new int[TAM];
	       
	       for(i=0;i<TAM;i++) {
	   
	    	   System.out.print("digite o " + (i+1) +"numero");
				
				a[i]=in.nextInt();
	      
	      
	       
	       }
	       
	       for(i=0;i<TAM;i++) {
	   
	    	   System.out.print("digite o " + (i+1) +"numero");
				
				b[i]=in.nextInt();
	      
	      
	       
	       }
		System.out.print("c[]=[ ");
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
			  //precisamos de dois fors pois se houvesse, apenas um for . 
				 //caso tivessemos um a[i] que fosse diferente de um b[i].
				//ele pararia de conferir sem conferir todos os valores de i.
				//mas nesse caso o vetor i só termina quando o j terminar, eu acho.
				if(a[j]==b[i]) {
				
					c[i]=a[j];
					
				System.out.print(c[i]+" ");
				
				}
				 if(a[j]!=b[i]) {
				
					j=TAM-1;
					i=TAM-1;
					//ain
				System.out.print("a[] e b[] são dijuntos ");
				
				}
			
			
			}
			
			
		}
		
		System.out.println("]");
		
	       
	       in.close();
	       
	}

}
