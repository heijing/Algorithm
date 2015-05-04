public class S {
	public static String fractionToDecimal(int numerator, int denominator) {

	    if (denominator == 0)
	        return "NaN";
	    if (numerator == 0)
	        return "0";
	    StringBuilder result = new StringBuilder();
	    Long n = new Long(numerator);
	    Long d = new Long(denominator);
	    // negative or positive
	    if (n*d < 0)
	        result.append("-");
	    n = Math.abs(n);
	    d = Math.abs(d);
	    result.append(Long.toString(n / d));
		return result.toString();}
	public static void main (String[] args){
	  //int a=5,b=3;
	  //String z=fractionToDecimal(a,b);
	  //System.out.print(z);
	  int a = 2/3;
      System.out.println(a);
	  
	}
}

