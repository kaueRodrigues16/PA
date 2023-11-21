package Exercicio;
import java.util.Scanner;
public class DobroMatriz {

	public static void main(String[] args) {
	
		final int TAM=4;
		int m[][]= new int[TAM][TAM];
		int i,j,x=1;

		
		m[0][0]=2;
		
		 for(i=0;i<TAM;i++) {
		    	
	    	  for(j=0;j<TAM;j++) {
	    		 x=x*2;
	    		 m[i][j]=x;
	    		 
	    		
	    	 }
	      }
		
		
      for(i=0;i<TAM;i++) {
    	System.out.println();
    	 System.out.print("[");
    	for(j=0;j<TAM;j++) {
    		
   
    		 
    		System.out.print(m[i][j]+" "); 
    	 }
      System.out.println("]");
      }
		
}
}