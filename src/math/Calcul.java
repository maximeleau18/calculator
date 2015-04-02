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
	public long addition(long a, long b)
	{
		return a + b;
	}
	
	/**
	 * Subtraction of two numbers
	 * @param a first number
	 * @param b second number
	 * @return result of subtraction
	 */
	public long soustraction(long a, long b)
	{
		return a - b;
	}
	
	/**
	 * Multiplication of two numbers
	 * @param a first number
	 * @param b first number
	 * @return
	 */
	public long multiplication(long a, long b)
	{
		return a * b;
	}

	/**
	 * Division of two numbers	
	 * @param a numerator number
	 * @param b divisor number
	 * @return quotient
	 */
	public float divisionReturnQuotient(float a, float b)
	{
		// Test if b > 0 
		if (b > 0.F){
			return a / b;
		}else{
			return -1;
		}
	}
	
	/**
	 * Division of two numbers	
	 * @param a numerator number
	 * @param b divisor number
	 * @return quotient
	 */
	public float divisionReturnRemainder(float a, float b)
	{
		// Test if b > 0 
		if (b > 0.F){
			return a % b;
		}else{
			return -1;
		}
	}
}
