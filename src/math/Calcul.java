package math;

/**
 * Class of calcul methods
 * 
 * @author Maxime Léau
 *
 */
public class Calcul {
	
	/**
	 * Addition of two numbers
	 * @param a first number
	 * @param b second number
	 * @return result of addition
	 */
	public long addition(long a, long b) throws Exception
	{
		if (Long.MAX_VALUE == a || Long.MAX_VALUE == b){
			throw new Exception();
		}else{
			return a + b;
		}
	}
	
	/**
	 * Subtraction of two numbers
	 * @param a first number
	 * @param b second number
	 * @return result of subtraction
	 */
	public long soustraction(long a, long b) throws Exception
	{
		return a - b;
	}
	
	/**
	 * Multiplication of two numbers
	 * @param a first number
	 * @param b first number
	 * @return result of multiplication
	 */
	public long multiplication(long a, long b) throws Exception
	{
		if ((Long.MAX_VALUE == a || Long.MAX_VALUE == b) && (a > 1 || b > 1)){
			throw new Exception();
		}else{
			return a * b;
		}
	}

	/**
	 * Division of two numbers	
	 * @param a numerator number
	 * @param b divisor number
	 * @return quotient
	 */
	public float divisionRetourQuotient(float a, float b) throws Exception
	{
		// Test if b > 0 
		if (b > 0.F){
			return a / b;
		}else{
			throw new Exception();
		}
	}
	
	/**
	 * Division of two numbers	
	 * @param a numerator number
	 * @param b divisor number
	 * @return quotient
	 */
	public float divisionRetourReste(float a, float b) throws Exception
	{
		// Test if b > 0 
		if (b > 0.F){
			return a % b;
		}else{
			throw new Exception();
		}
	}
}
