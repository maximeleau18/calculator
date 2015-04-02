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
	public void testAddition() throws Exception
	{
		boolean result2 = false;
		try {
			long result1 = this.calcul.addition(1, 1);
			
			assertEquals(2, result1);
			
			// Test if an exception is thrown
			this.calcul.addition(Long.MAX_VALUE, 1);
			
			assertEquals(result2, -1);
		} catch (Exception e) {
			result2 = true;
		}
		assertTrue(result2);
	}
	
	@Test
	public void testSoustraction() throws Exception
	{
		try {
			long result1 = this.calcul.soustraction(25, 18);
			
			assertEquals(7, result1);
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testMultiplication() throws Exception
	{
		boolean result3 = false;
		try {
			long result1 = this.calcul.multiplication(25, 4);
			
			assertEquals(result1, 100);
			
			long result2 = this.calcul.multiplication(Long.MAX_VALUE, 25);
			
			assertEquals(result2, -1);
			
			// Test if an exception is thrown
			this.calcul.multiplication(5000000, Long.MAX_VALUE);
			
		} catch (Exception e) {
			result3 = true;
		}		
		assertTrue(result3);
	}
	
	@Test
	public void testDivisionReturnQuotient() throws Exception
	{
		boolean result3 = false;
		try {
			float result1 = this.calcul.divisionRetourQuotient(100.0F, 25.0F);
			
			assertEquals(result1, 4, 0.001);
			
			float result2 = this.calcul.divisionRetourQuotient(1.0F, 4.0F);
			
			assertEquals(result2, 0.25F, 0.0001);
			
			// Test if an exception is thrown
			this.calcul.divisionRetourQuotient(1.0F, 0);
		} catch (Exception e) {
			result3 = true;
		}		
		assertTrue(result3);
	}
	
	@Test
	public void testDivisionReturnRemainder() throws Exception
	{
		boolean result3 = false;
		try {
			float result1 = this.calcul.divisionRetourReste(100.0F, 25.0F);
			
			assertEquals(result1, 0, 0.001);
			
			float result2 = this.calcul.divisionRetourReste(1.0F, 4.0F);
			
			assertEquals(result2, 1.0F, 0.0001);
			
			// Test if an exception is thrown
			this.calcul.divisionRetourReste(1.0F, 0);
		} catch (Exception e) {
			result3 = true;
		}
		assertTrue(result3);
	}
}
