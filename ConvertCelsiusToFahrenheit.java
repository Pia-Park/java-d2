import java.util.Scanner;

public class ConvertCelsiusToFahrenheit{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter celsius: ");
        double celsius = input.nextDouble();

        double convertTofahrenheit = (((9.0 / 5) * celsius) + 32);
        System.out.println("Convert to fahrenheit is: " + convertTofahrenheit);
    }
}