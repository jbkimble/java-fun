public class RGBtoYIQ {
  public static void main(String[] args) {
    int red = Integer.parseInt(args[0]);
    int green = Integer.parseInt(args[1]);
    int blue = Integer.parseInt(args[2]);

    int y = (int) (.2999 * red + .587 * blue + .114 * blue);
    int i = (int) (.595716 * red - .274453 * blue - .321264 * blue);
    int q = (int) (.211456 * red - .522591 * blue + .31135 * blue);

    System.out.println(y);
    System.out.println(i);
    System.out.println(q);
  }
}
