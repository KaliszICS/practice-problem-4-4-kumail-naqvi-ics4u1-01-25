public final class MyUtilityClass {
  //It's purpose is not to be an object

  //constants
  final static int MAXIMUM = 3000;
  
  private MyUtilityClass() {
    //create a private constructor so other classes can not create an instance of this (object)
  }

  public static int returnZero() {
    return 0;
  }

  //overloading methods and constructors work the same way
  public static int min(int num1, int num2) {
    if (num1 < num2) {
      return num1;
    }
    return num2;
  }
  
  public static double min(double num1, double num2) {
    if (num1 < num2) {
      return num1;
    }
    return num2;
  }

}
