public class ThreeSort {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    int c = Integer.parseInt(args[2]);
    int smallest = Math.min(a, Math.min(b, c));
    int largest = Math.max(a, Math.max(b, c));
    int middle = a + b + c - smallest - largest;

    System.out.println(smallest + " " + middle + " " + largest);
  }
}
