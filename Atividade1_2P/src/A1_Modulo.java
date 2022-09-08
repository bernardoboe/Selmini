import java.util.Scanner;

public class A1_Modulo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double p = 0, m = 0,a=0, acima = 0;
		int n = 0, na = 0;

		System.out.println("Quantas salas serão analisadas?");
		n = teclado.nextInt();
		int[] salas = new int[n];

		for (int i = 0; i < salas.length; i++) {

			System.out.println("Quantas alunos tem na " + (i + 1) + "a sala?");
			na = teclado.nextInt();
			double[] notas = new double[na];

			m = nota(notas, na);

			a = aprovados(notas, m);
		
			acima = 100 / (na/a);
			
			System.out.println(String.format("%.3f", acima) + "% dos alunos estão acima da média da turma.");
				}

	}

	public static double nota(double[] notas, int na) {

		Scanner teclado = new Scanner(System.in);
		double media=0;
		for (int j = 0; j < notas.length; j++) {

			System.out.println("Qual é a nota do " + (j + 1) + "o aluno?");
			notas[j] = teclado.nextInt();
			media = media + notas[j];
		}
				media = media / na;
				System.out.println("A média da turma é " + media);
			return media;
		}
	
	public static double aprovados(double[] notas, double m) {
		int p=0;
	for (int j = 0; j < notas.length; j++) {
		if (notas[j] > m) {
			p++;
		}

	}
	
	return p;
}
}