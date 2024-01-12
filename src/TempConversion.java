import java.util.Scanner;

public class TempConversion{
  public static void main(String[] args){
      
      // Below this comment: declare and instantiate a scanner
      Scanner scan = new Scanner(System.in); 

      // Below this comment: declare any other variables you may need 
      // to store the user's input and the Kelvin equivalent value
      double temp_fah = 0.00;
      double temp_kel = 0.00;

      // Below this comment: collect the required inputs from the user
      System.out.print("Enter temperature in Fahrenheit : ");
      temp_fah = scan.nextDouble();

      // Below this comment: call your FahrenheitToKelvin method
      temp_kel = FahrenheitToKelvin(temp_fah);
      
      // Below this comment: display the required results
      System.out.println(String.format("%.2f", temp_fah) + " degrees Fahrenheit is " + String.format("%.2f", temp_kel) + " Kelvin");
  }

  public static double FahrenheitToKelvin(double temp_fah){
    double temp_kel = (temp_fah - 32)*5/9 + 273.15;
    return temp_kel;
  }
}