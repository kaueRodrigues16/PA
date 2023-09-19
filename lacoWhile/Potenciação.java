package cabograça;
import java.util.Scanner;
public class Potenciação {

 public static void main (String[] args) {
	
	 Scanner ler = new Scanner (System.in);

   int n, i=0,p, s=1;
   
   System.out.print("coloque um numero");
   
   n=ler.nextInt();
   
   System.out.print("muito bem agora informe o quanto ele sera elevado");

   p=ler.nextInt();
   
   
   
   
   
   while(i!=p) {
	 
	   s=s*n;
	   
	  
	   
	i++; 
}
   
   System.out.print("sua potencia resulta em "+s);
   
   
   
   ler.close();
   
 
 }
 
    
}