package s2b.tst.sum;

public class Sum {

	public static double sum(double d, double e) {
		// FIX TODO Auto-generated method stub // Fix = tem um defeito TODO =
		// tem algo para fazer FixMe = não passou no teste, programar o metodo
		if (d < 0) {
			throw new IllegalArgumentException(); // testa se o primeiro numero é negativo e lança a excessao
		}if(e < 0){
			throw new IllegalArgumentException(); // testa se o segundo numero for negativo, lança a excessão
		}
		return d + e;
	}

}
