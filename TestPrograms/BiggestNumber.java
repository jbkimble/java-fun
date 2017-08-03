public class BiggestNumber {
  public static void main(String[] args) {
    int number1 = Integer.parseInt(args[0]);
    int number2 = Integer.parseInt(args[1]);
    int result = 100 - number1;

    if (result < 50) {
      System.out.println("Bob selects card 1");
    } else {
      System.out.println("Bob selects card 2");
    }
  }
}
