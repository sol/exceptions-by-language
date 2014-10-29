public class Main {
  public static void main(String[] args) {
    try {
      int n = 1 / 0;
    } catch (Exception e) {
      System.out.println("1. Using .toString():\n\n    " + e.toString() + "\n");
      System.out.println("2. Using .getMessage():\n\n    " + e.getMessage() + "\n");
    }
    System.out.println("3. Default exception handler\n");
    int n = 1 / 0;
  }
}

