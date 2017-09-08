package s2b.tst.sum;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumTest {
	// teste tem que dar erro
	@Test(expected = IllegalArgumentException.class)
	// se o primero numero for negativo,nao é para aceitar
	
	//Segundo numero é negativo
	public void testSecondNumberIsNegativoGivesException() {
		Sum.sum(0, -10);
		
		/*Não pode esquecer de colocar a condição na classe se nao ira das erro no teste
		 * nunca ira passar*/
	}
	
	// teste tem que dar erro
	@Test(expected = IllegalArgumentException.class)
	
	//Primerio numero é negativo
	public void testFirstNumberIsNegativo() {
		Sum.sum(-10, 0);
	}
	
	@Test
	// anotacao
	
	//Zero mais Zero é Zero
	public void testThatZeroPlusZeroIsZero() {
		/*
		 * fail("Not yet implemented"); quando nenhum medoto é implementado
		 * sempre falhara
		 */

		double expected = 0;// expectativa do que está sendo esperado
		double actual = Sum.sum(0, 0);// actual o que o programa ira apresentar
										// 0 + 0
		assertEquals(expected, actual, 0.1); // 0.1 quantos numero depois da
												// virgula
		// assertEquals é um metodo do import static org.junit.Assert.*
	}

	@Test
	// anotacao
	//Zero mais Um é Zero
	public void testThatZeroPlusZeroIsOne() {
		/*
		 * fail("Not yet implemented"); quando nenhum medoto é implementado
		 * sempre falhara
		 */

		double expected = 1;// expectativa do que está sendo esperado
		double actual = Sum.sum(1, 0);// actual o que o programa ira apresentar
										// 1 + 0
		assertEquals(expected, actual, 0.1);
	}

	@Test
	// anotacao
	/* Meio mais meio da um */
	public void testThatHalfPlusHalfIsOne() {
		/*
		 * fail("Not yet implemented"); quando nenhum medoto é implementado
		 * sempre falhara
		 */

		double expected = 1;// expectativa do que está sendo esperado
		double actual = Sum.sum(0.5, 0.5);// actual o que o programa ira
											// apresentar 1 + 0
		assertEquals(expected, actual, 0.1);
	}

}
