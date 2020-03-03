public class Calculator
{
	//instance variables
	private double num1;
	private double num2;
	private char operator;
  private double result;
	
	//default constructor
	public Calculator()
	{
		num1 = 0;
		num2 = 0;
		operator = 0;
	}
	
	//inialization constructor
	public Calculator(char inputOperator, double n1, double n2){
    operator = inputOperator;
    num1 = n1;
    num2 = n2;
    
  }
	
	//modifier method for num1
	public void setNum1(double n1)
	{
		num1 = n1;
	}
	
	//modifider method for num2
	public void setNum2(double n2)
	{
		num2 = n2;
	}
	
	//modifier method for operator

  public void setOperator(char inputOperator)
  {
    operator = inputOperator;
  }
	
	//accessor method for num1
	public double getNum1()
	{
		return num1;
	}
	
	//accessor method for num2
	public double getNum2()
	{
		return num2;
	}
	
	//accessor method for operator
  public char getOperator()
  {
    return operator;
  }

	
	//Create method to calculate the result
  public void asmd(){
    if (operator == '+')
    {
      double sum;
      sum = num1 + num2;
      result = sum;
    }
    if (operator == '-')
    {
      double difference;
      difference = num1 - num2;
      result = difference;
    }
    if(operator == '*')
    {
      double product;
      product = num1*num2;
      result = product;
    }
    if(operator == '/')
    {
      double div;
      div = num1/num2;
      result = div;
    }
  }
	
	//Create the toString() method
	public String toString(){
    return "" + num1 + " " + operator + " " + num2 + " = " + result;
  }
	
}