public class TemperatureConverter {
   public static double convertToFahrenheit (double celsius) {
   return (celsius * 9/5) + 32;
}
public static void main(String [] args) {
   double result=convertToFahrenheit(34);
   System.out.println(result);
}
}
   