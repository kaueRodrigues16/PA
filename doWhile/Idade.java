package Exercicio;
import java.util.Scanner;
public class Idade {

	
public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		 
		
	int AnoAtual, nascimento, idade, i=0;

	
		
		do {
			System.out.println("coloque seu ano ano atual");
			    
			AnoAtual=ler.nextInt();
			
			System.out.println("coloque sua data de nascimensto");
		
			nascimento = ler.nextInt();
			
			idade= AnoAtual-nascimento;
			
				if(idade<=18) {
					
					System.out.println("como sua idade é "+idade+" voce é menor de idade ");
				}
				
				else {
					
					System.out.println("como sua idade é "+idade+" voce é maior de idade ");
				}
			
				System.out.println("Deseja continuar o codigo");
				
				
				i= ler.nextInt();
			
				
		} 

		while(i!=2) ;


		System.out.println("Muito obrigado");
		


}



}