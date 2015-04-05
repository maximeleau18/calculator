package math;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculTest {
	
	final double DELTA = 0.00001D;
	
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
			double result1 = this.calcul.addition(1.0D, 1.0D);
			
			assertEquals(2.0D, result1, DELTA);
			
			// Test if an exception is thrown
			this.calcul.addition(Double.MAX_VALUE, 1.0D);
			
		} catch (Exception e) {
			result2 = true;
		}
		assertTrue(result2);
	}
	
	@Test
	public void testSoustraction() throws Exception
	{
		try {
			double result1 = this.calcul.soustraction(25.5D, 18.5D);
			
			assertEquals(7.0D, result1, DELTA);
		} catch (Exception e) {
			
		}
	}
	
	@Test
	public void testMultiplication() throws Exception
	{
		boolean result2 = false;
		try {
			double result1 = this.calcul.multiplication(25.0D, 4.0D);
			
			assertEquals(100.0D, result1, DELTA);
			
			// Test if an exception is thrown
			this.calcul.multiplication(5000000.0D, Double.MAX_VALUE);
			
		} catch (Exception e) {
			result2 = true;
		}		
		assertTrue(result2);
	}
	
	@Test
	public void testDivisionRetourQuotient() throws Exception
	{
		boolean result3 = false;
		try {
			double result1 = this.calcul.divisionRetourQuotient(100.0D, 25.0D);
			
			assertEquals(4.0D, result1, DELTA);
			
			double result2 = this.calcul.divisionRetourQuotient(1.0D, 4.0D);
			
			assertEquals(0.25D, result2, DELTA);
			
			// Test if an exception is thrown
			this.calcul.divisionRetourQuotient(1.0D, 0.0D);
		} catch (Exception e) {
			result3 = true;
		}		
		assertTrue(result3);
	}
	
	@Test
	public void testDivisionRetourReste() throws Exception
	{
		boolean result3 = false;
		try {
			double result1 = this.calcul.divisionRetourReste(100.0D, 25.0D);
			
			assertEquals(0.0D, result1, DELTA);
			
			double result2 = this.calcul.divisionRetourReste(1.0D, 4.0D);
			
			assertEquals(1.0D, result2, DELTA);
			
			// Test if an exception is thrown
			this.calcul.divisionRetourReste(1.0D, 0.0D);
		} catch (Exception e) {
			result3 = true;
		}
		assertTrue(result3);
	}
	
	@Test
	public void testRacineCarree() throws Exception
	{
		boolean result2 = false;
		try {
			double result1 = this.calcul.racineCarree(4.0D);
			
			assertEquals(2.0D, result1, DELTA);
			
			this.calcul.racineCarree(-1.0D);
			
		} catch (Exception e) {
			result2 = true;
		}
		
		assertTrue(result2);
	}
}
