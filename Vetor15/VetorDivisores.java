package Exercicios;
import java.util.Scanner;
public class VetorDivisores {

	public static void main (String[] args) {
	
		 Scanner in= new Scanner(System.in);
		   
		   final int TAM=10;
		   int a[],quociente,i,j;
		   a= new int[TAM];
	     
	   
	       
	       for(i=0;i<TAM;i++) {
	   
	    	   System.out.print("digite o " + (i+1) +"numero");
				
				a[i]=in.nextInt();
	       }

	       
	       for(i=0;i<TAM;i++) {
	    	   System.out.println(" para a["+i+ "]= "+a[i]);
	    	   for(j=0;j<a[i];j++) {
	    	 if(a[i]%(a[i]-j)==0) {
	    		//verifica se a divisao é exata, ou seja se um quociente inteiro
	    		
	   System.out.println(a[i]/(a[i]-j));
	    	//mostra quem são os quocientes
	    	 }
	     }
	       }
	
	in.close();
	}	
}