public class DayOfWeek {
  public static void main(String[] args) {
    int month = Integer.parseInt(args[0]);
    int day = Integer.parseInt(args[1]);
    int year = Integer.parseInt(args[2]);
    int dayOfWeek

    int temp = year - (14-month)/12;
    temp = temp + temp/4 - temp/100 + temp/400;
    int temp2 = month + 12 *((14 - month)/12) -2;
    dayOfWeek = (day + temp + (31*(temp2))/12)%7;
    
    System.out.println("The day of the week is: " + dayOfWeek);
  }
}
