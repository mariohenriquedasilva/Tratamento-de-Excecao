public class ValidaNumeros {
	int n1;
	int n2;

	ValidaNumeros() {

	}

	public void ValidaNumero() throws Exception {
		if (n1 <= 0) {
			throw new Exception("Número 1 precisa ser maior que 0");
		} else if (n2 <= 0) {
			throw new Exception("Número 2 precisa ser maior que 0");
		}

	}

	public double dividir() {
		return n1 / n2;
	}
}
