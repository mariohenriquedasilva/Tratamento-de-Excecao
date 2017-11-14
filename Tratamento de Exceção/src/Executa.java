import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i==0){
			try {

				Scanner leia = new Scanner(System.in);
				int numero1;
				int numero2;
				int resultado;

				System.out.println("Infome o primerio número: ");
				numero1 = leia.nextInt();
				System.out.println("Infome o segundo número: ");
				numero2 = leia.nextInt();

				resultado = numero1 / numero2;
				System.out.println("O resultado da divisão é: " + resultado);
				i=1;
			} catch (Exception e) {
				System.out.println("Erro,você informou algum número invalido!");
			}
		}
		

	}

}
