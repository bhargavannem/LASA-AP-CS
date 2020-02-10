import java.lang.Math;
public class Quadratic
{
  private double a;
  private double b;
  private double c;
  private String root1 = null;
  private String root2 = null;

  public Quadratic(){
    a = 0;
    b = 0;
    c = 0;
  }

  public Quadratic(double aVal, double bVal, double cVal){
    a = aVal;
    b = bVal;
    c = cVal;
  }

  public void setA(double aVal){
    a = aVal;
  }

  public void setB(double bVal){
    b = bVal;
  }

  public void setC(double cVal){
    c = cVal;
  }

  public double getA(){
    return a;
  }

  public double getB(){
    return b;
  }

  public double getC(){
    return c;
  }

  public void solve()
  {
    double discriminant;
    double sol1;
    double sol2;
    char i = 'i';
    discriminant = Math.sqrt(Math.pow(b,2)-4*a*c);
    if (discriminant > 0){
      sol1 = (-b + discriminant)/(2*a);
      sol2 = (-b - discriminant)/(2*a);
      root1 = "" + sol1;
      root2 = "" + sol2;
    }
    else if (discriminant == 0){
      sol1 = (-b + discriminant)/(2*a);
      root1 = "" + sol1;
    }
    else{
      sol1 = -b/2*a;
      sol2 = -b/2*a;
      root1 = "" + sol1 + " + " + Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c))/(2*a) + i;
      root2 = "" + sol2 + " - " + Math.sqrt(Math.abs(Math.pow(b,2)-4*a*c))/(2*a) + i;
    }
    
  }
  
  public String toString()
  {
    
    if ((root1 == null) && (root2 == null)){
      return "" + a + "x^2 + " + b + "x + " + c + " has not been solved yet.";
    }
    else if ((root1 != null) && (root2 == null)){
      return "" + a + "x^2 + " + b + "x + " + c + " has one real root at " + root1 + ".";
    }
    else if ((root1.indexOf('+') != -1) && (root2.indexOf('-') != -2)){
      return "" + a + "x^2 + " + b + "x + " + c + " has two imaginary roots at " + root1 + " & " + root2 + ".";  
    }
    else{
    return "" + a + "x^2 + " + b + "x + " + c + " has two real solutions at " + root1 + " & " + root2 + ".";
    }
  }

}
