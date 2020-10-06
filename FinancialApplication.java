import java.util.Scanner;

public class FinancialApplication {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your subtotal: ");
        double subtotal = input.nextDouble();
        double gratuityRate = (subtotal * 0.15);
        System.out.println("Total is " + (subtotal + gratuityRate));

    }
}
