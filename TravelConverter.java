public class TravelConverter {
  public static double kmToMiles(double km) {
  return km * 0.621371 ;
}
public static void main (String [] args) {
  double result=kmToMiles(10.0);
  System.out.println(result);
}
}