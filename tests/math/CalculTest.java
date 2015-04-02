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
	}
	
	@Test
	public void testSoustraction()
	{
		long result1 = this.calcul.soustraction(25, 18);
		
		assertEquals(7, result1);
	}

}
