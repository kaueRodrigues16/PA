package Exercicio;

public class MultiplosDeDez {

public static void main(String[] args) {
		
		
		int i;
		
		
		for(i=1;i!=101;i++  ) {
			
   if(i%10==i-(i*10-i*9)) {

	   System.out.println(i+" é multilo de 10");
   }
	   else{
	
		 System.out.println(i);  
	   }	   

}
}
}