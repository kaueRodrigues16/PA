package Exercicio;
import java.util.Scanner;
public class Media {
public static void main(String[]args) {
		
		Scanner ler = new Scanner(System.in);
	
		final int A=10;
		int a[],i;
		double soma=0;
		a=new int[A];
		
       for(i=0;i<A;i++) {
			
			System.out.print("Coloque o "+(i+1)+"º numero");
			
			a[i]=ler.nextInt();
		
		soma=soma+a[i];
			
       }	
       System.out.print(soma/A);
		
}
}