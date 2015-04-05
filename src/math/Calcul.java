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
	public double addition(double a, double b) throws Exception
	{
		if (Double.MAX_VALUE == a || Double.MAX_VALUE == b){
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
	public double soustraction(double a, double b) throws Exception
	{
		return a - b;
	}
	
	/**
	 * Multiplication of two numbers
	 * @param a first number
	 * @param b first number
	 * @return result of multiplication
	 */
	public double multiplication(double a, double b) throws Exception
	{
		if ((Double.MAX_VALUE == a || Double.MAX_VALUE == b) && (a > 1.0D || b > 1.0D)){
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
	public double divisionRetourQuotient(double a, double b) throws Exception
	{
		// Test if b > 0 
		if (b > 0.0D){
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
	public double divisionRetourReste(double a, double b) throws Exception
	{
		// Test if b > 0 
		if (b > 0.0D){
			return a % b;
		}else{
			throw new Exception();
		}
	}
	
	public double racineCarree(double a) throws Exception
	{
		double x = 0.0D;
		double x1 = 0.0D;
		double x0 = 0.0D;
		double precision = 20.0D;
		
		if (a < 0){
			throw new Exception();
		}else if (a == 0){
			return 0.0D;
		}
        x0 = (1 + a) / 2.0D;
        while (precision > 0.00001) {
            x = (1.0D / 2.0D) * (x0 + a / x0);
            x0 = x;
            x1 = (1.0D / 2.0D) * (x + a / x);
            if ((x1 - x) / x > 0) {
            	precision = (x1 - x) / x;
            } else {
            	precision = -(x1 - x) / x;
            }
         }
        return x1;
	}
}
