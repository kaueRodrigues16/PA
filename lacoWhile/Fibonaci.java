package cabograça;
import java.util.Scanner;
public class Fibonaci {

	 public static void main (String[] args) {
	
		 Scanner ler= new Scanner (System.in);
		 
		 int w, x=0, y=1, z=0, i=0;
		 
		 System.out.print("coloque qual a posição da sequencia Fiobnaci deseja, que lhe mostrarei qual termo corresponde a essa posiçaõ");
		 
		 
		 w=ler.nextInt();
	
		 
		 while(i!=w) {
		 
		 
		 
		x=y+z;
		 
		 y=z;
		 
		 
		 z=x;
		 
		 
		 
		 i++;
		 
		 System.out.println(z);
		
		 
		 }	 
		
		 
		 ler.close();
}
	   
}