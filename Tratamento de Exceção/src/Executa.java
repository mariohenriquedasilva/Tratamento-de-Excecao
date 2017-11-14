import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i == 0) {
			try {
				ValidaNumeros n = new ValidaNumeros();
				Scanner leia = new Scanner(System.in);
				// int n1;
				// int n2;
				double resultado;

				System.out.println("Infome o primerio número: ");
				n.n1 = leia.nextInt();
				System.out.println("Infome o segundo número: ");
				n.n2 = leia.nextInt();

				n.ValidaNumero();

				resultado = n.dividir();

				System.out.println("O resultado da divisão é: " + resultado);
				i = 1;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
