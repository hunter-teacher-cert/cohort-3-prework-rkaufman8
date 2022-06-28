// Rachel Kaufman
// 7.9 Exercises 2, 3, 4
// 6/27/22

public class Loops {
  
  public static void main(String[] args) {
    System.out.println(squareRoot(16));
    }

  // EXERCISE 2
  public static double squareRoot(double a) {
    double n = a/2, m = a;
    while (Math.abs(m-n) >= 0.0001) {
      m = n;
      n = (n + a/n) / 2;
    }
    return n;
  }

  
}