package if_else;

//ax^2 + bx + c = 0
//x1=-b +sqrt(b^2-4*a*c)/2*a
//x2=-b -sqrt(b^2-4*a*c)/2*a

public class QuadraticEquation{
public static void main(String[] args) {        
  double a = 25;
  double b = 50;
  double c = 20;     
  double discriminant = b * b - 4 * a * c;   // Calculating the discriminant
  // Checking the nature of the roots
  if (discriminant > 0) {
      double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
      double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
      System.out.println("Two real and distinct roots: " + root1 + " and " + root2);
  } else if (discriminant == 0) {
      double root = -b / (2 * a);
      System.out.println("One real and equal root: " + root);
  } else {
      System.out.println("No real roots. The solutions are complex.");
  }
}

}
