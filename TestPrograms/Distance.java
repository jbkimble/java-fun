public class Distance {
  public static void main(String[] args) {
    int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
    double result = Math.sqrt((x*x) + (y*y));
    System.out.print("distance to 0,0:" + result);
  }
}
