package Exercicios;
public class PotenciaDeDoisVetor {

	public static void main(String[] args) {
	
	
	final int TAM=11;
	int a[],i,n=1;
	a= new int[TAM];
	
	for(i=0; i<TAM; i++) {
	
		if(i>0) {
	
			n=n*2;
	
		//n é uma variavel acumaltiva, ele começa como valendo 1 para que 2 posso se potencializar a vontade
	
	a[i]=n;
	
	System.out.println("para "+"a["+i+"]");
	
		System.out.println(a[i]);
		}
		else {
			System.out.println("para "+"a["+i+"]");
			
			System.out.println("1"); 
		}
	
	}
	
}
}
