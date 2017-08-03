public class Ordered {
  public static void main(String[] args) {
    boolean b = true;
    int one = Integer.parseInt(args[0]);
    int two = Integer.parseInt(args[1]);
    int three = Integer.parseInt(args[2]);
    if ((one <= two && two <= three) || (one >= two && two >= three)) {
      System.out.println("True");
    } else {
      System.out.println("False");
    }
  }
}
