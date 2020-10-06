import java.util.Scanner;

public class ComputeTheVolumeOfACylinder {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Enter the radius and length:");
        double radius = input.nextDouble();
        double length = input.nextDouble();
        double area = (radius * radius * pi);
        double volume = (area * length);
        System.out.println("Area is " + area + " Volume is " + volume);

    }
}
