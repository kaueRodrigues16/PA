package Exercicios;
import java.util.Scanner;
public class VetorParesEImpares {
   public static void main(String[]args) {
	
	   Scanner in= new Scanner(System.in);
	   
	   final int TAM=20;
	   int a[],b[],i;
	   a= new int[TAM];
       b= new int[TAM];
   
       
       for(i=0;i<TAM;i++) {
   
    	   System.out.print("digite o " + (i+1) +"numero");
			
			a[i]=in.nextInt();
      
			 b[i]=a[i];
   	      
      
       
       }
       System.out.print("b[]=[ ");
       for(i=0;i<TAM;i++) {
    	  
    	   if(a[i]%2==0) {
    	   //confere se a[i]=b[i] é par, CASO SEJA o b[i] é exibido.
    	  System.out.print(b[i]+" ");
    	   }
       }
      //ao completar o primeri for, o codigo inicia o segunndo for
    				   
       
       for(i=0;i<TAM;i++) {
    				       
    	  if((a[i]+1)%2==0) {
      //confere se o a[i]=b[i] é impar, CASO SEJA b[i] é exibido.
    	System.out.print(b[i]+" ");
    			    	   
    	 }
    }
       System.out.println(" ]");
    //temos esses dois "fors" para que primeiro os pares ejam exibidos e depois os impares
    in.close();
   }
}
