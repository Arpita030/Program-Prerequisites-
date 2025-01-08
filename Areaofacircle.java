import java.util.Scanner; // Import Scanner class

public class Areaofacircle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is: " + area);

        sc.close(); // Close Scanner
    }
}
