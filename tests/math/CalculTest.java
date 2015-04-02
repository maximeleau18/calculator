package math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculTest {
	
	private Calcul calcul;

	@Before
	public void setUp() throws Exception {
		this.calcul = new Calcul();
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public void testAddition() 
	{
		long result1 = this.calcul.addition(1, 1);
		
		assertEquals(2, result1);
		
		long result2 = this.calcul.addition(Long.MAX_VALUE, 1);
		
		assertEquals(result2, -1);
	}
	
	@Test
	public void testSoustraction()
	{
		long result1 = this.calcul.soustraction(25, 18);
		
		assertEquals(7, result1);
	}
	
	@Test
	public void testMultiplication()
	{
		long result1 = this.calcul.multiplication(25, 4);
		
		assertEquals(result1, 100);
		
		long result2 = this.calcul.multiplication(Long.MAX_VALUE, 25);
		
		assertEquals(result2, -1);
		
		long result3 = this.calcul.multiplication(5000000, Long.MAX_VALUE);
		
		assertEquals(result3, -1);
	}
	
	@Test
	public void testDivisionReturnQuotient()
	{
		float result1 = this.calcul.divisionReturnQuotient(100.0F, 25.0F);
		
		assertEquals(result1, 4, 0.001);
		
		float result2 = this.calcul.divisionReturnQuotient(1.0F, 4.0F);
		
		assertEquals(result2, 0.25F, 0.0001);
		
		float result3 = this.calcul.divisionReturnQuotient(1.0F, 0);
		// Test if return value equals to -1 to indication there is a problem
		assertEquals(result3, -1.0F, 0.0001);
	}
	
	@Test
	public void testDivisionReturnRemainder()
	{
		float result1 = this.calcul.divisionReturnRemainder(100.0F, 25.0F);
		
		assertEquals(result1, 0, 0.001);
		
		float result2 = this.calcul.divisionReturnRemainder(1.0F, 4.0F);
		
		assertEquals(result2, 1.0F, 0.0001);
		
		float result3 = this.calcul.divisionReturnRemainder(1.0F, 0);
		// Test if return value equals to -1 to indication there is a problem
		assertEquals(result3, -1.0F, 0.0001);
	}
	

}
