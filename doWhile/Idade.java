import java.util.Scanner;
public class Idade {

public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int nascimento, AnoAtual,idade;
		
		
		do {
		
		System.out.println("coloque seu ano ano atual");
		    
		AnoAtual=ler.nextInt();
		
		System.out.println("coloque sua data de nascimensto");
	
		nascimento=ler.nextInt();
		
		idade=AnoAtual-nascimento;
		
			if(idade<=18) {
				
				System.out.println("como sua idade � "+idade+" voce � menor de idade ");
			}
			
			else {
				
				System.out.println("como sua idade � "+idade+" voce � maior de idade ");
			}
			System.out.println("como sua idade � "+idade+" voce � maior de idade ");
			
		} while()
}
}

