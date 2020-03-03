public class GCD
{
	//instance variables - DO NOT ADD ANY MORE INSTANCE VARIABLES
	private int numerator;
	private int denominator;
	
	//default constructor
	public GCD() {
    numerator = 0;
    denominator = 0;
  }
	
	//initialization constructor
	public GCD(int num1, int num2){
    numerator = num1;
    denominator = num2;
  }
	
	//modifier method for numerator
	public void setNumerator(int num1){
    numerator = num1;
  }
	
	//modifier method for denominator
	public void setDenominator(int num2){
    denominator = num2;
  }
	
	//accessor method for numerator
	public int getNumerator(){
    return numerator;
  }
	
	//accessor method for denominator
	public int getDenominator(){
    return denominator;
  }
	//method to determine gcd
	public int gcd(){
    int gcdVal = 0;
    boolean solved = false;
    int num = numerator;
    int den = denominator;
    int temp = 0;
    int low = Math.min(num,den);
    int high = Math.max(num,den);
    while (solved == false){
      if (high==0){
        return denominator;
      }
      else if (low==0){
        return numerator;
      }
      else{
        temp = low;
        low = high%low;
        high = temp;
        if ((high==0)||(low==0)){
          if (high == 0){
            solved = true;
            gcdVal = low; 
          }
          else if (low == 0){
            solved = true;
            gcdVal = high;
          }
        }
      }
    }
  return gcdVal;
  }

	
	//method to determine lowest term of numerator
  public int lowestNum(){
    return numerator/gcd();
  }
	
	
	//method to determine lowest term of denominator
	public int lowestDen(){
    return denominator/gcd();
  }
	//toString() method
	public String toString(){
    return "The GCD is: " + gcd() + "\nThe fraction in lowest terms is: " + lowestNum() + "/" + lowestDen();
  }
}