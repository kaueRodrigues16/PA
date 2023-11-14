package MatrizesDobro;

public class Exercicio {

	public static void main(String[] args) {

		final int TAM = 4;
		int v[][] = new int[TAM][TAM];
		int i, j, k;

		k = 2;

		for (i = 0; i < TAM; i++) {
			for (j = 0; j < TAM; j++) {

				v[i][j] = k;
				System.out.print(v[i][j] + " ");
				k = k * 2;
			}
			System.out.println();
		}

	}
}