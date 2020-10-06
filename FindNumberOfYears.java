import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter minutes: ");
        double minutes = input.nextDouble();
        double minInYear = 60 * 24 * 365; 
        double year = minutes / minInYear;
        double day = (minutes / 60 / 24) % 365;
        System.out.println(Math.floor(year) + " years " + Math.floor(day) + "days"); 
    }

}
