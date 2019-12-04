public class QuadraticRunner
{
    public static int realCount = 0;
    public static int imaginaryCount = 0;
    public static void main(String[] args)
    {
      Quadratic eqn1 = new Quadratic(2,2,-24);
      System.out.println(eqn1);
      Quadratic eqn2 = new Quadratic(3,12,12);
      Quadratic eqn3 = new Quadratic(1,-10,34);
      eqn1.solve();
      eqn2.solve();
      eqn3.solve();
      System.out.println(eqn1);
      System.out.println(eqn2);
      System.out.println(eqn3);
      String res1 = eqn1.toString();
      String res2 = eqn2.toString();
      String res3 = eqn3.toString();
      
      if (res1.indexOf("imaginary") != -1)
      {
        ++imaginaryCount;
      }
      
      if (res2.indexOf("imaginary") != -1)
      {
        ++imaginaryCount;
      }
      
      if (res3.indexOf("imaginary") != -1)
      {
        ++imaginaryCount;
      }
      
      if (res1.indexOf("real") != -1)
      {
        ++realCount;
      }
      
      if (res2.indexOf("real") != -1)
      {
        ++realCount;
      }
      
      if (res3.indexOf("real") != -1)
      {
        ++realCount;
      }
      
      System.out.println("Real Roots = " + realCount);
      System.out.println("Imaginary Roots = " + imaginaryCount);
    }
}