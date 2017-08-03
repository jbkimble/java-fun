public class WindChill {
  public static void main(String[] args) {
    double temp = Double.parseDouble(args[0]);
    double windSpeed = Double.parseDouble(args[1]);
    double windChill = 35.74 + .6215*temp + (0.4275*temp - 35.75)*Math.pow(windSpeed, 0.16);
    System.out.println(windChill);
  }
}
