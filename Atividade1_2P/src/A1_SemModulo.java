import java.util.Scanner;

public class A1_SemModulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double p = 0, media = 0, acima = 0;
		int n = 0, na = 0;

		System.out.println("Quantas salas serão analisadas?");
		n = teclado.nextInt();
		int[] salas = new int[n];

		for (int i = 0; i < salas.length; i++) {

			System.out.println("Quantas alunos tem na " + (i + 1) + "a sala?");
			na = teclado.nextInt();
			int[] notas = new int[na];

			for (int j = 0; j < notas.length; j++) {

				System.out.println("Qual é a nota do " + (j + 1) + "o aluno?");
				notas[j] = teclado.nextInt();
				media = media + notas[j];
				if (na == (j + 1)) {
					media = media / na;
					System.out.println("A média da turma é " + media);

				}
			}
			for (int j = 0; j < notas.length; j++) {
				if (notas[j] > media) {
					p++;
				}

			}
			acima = 100 / (na / p);
			System.out.println(String.format("%.3f", acima) + "% dos alunos estão acima da média da turma.");
			media=0;
			p=0;
		}

	}

}
