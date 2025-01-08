import java.util.*;
	public class perimeterofrectangle{
		public static void main(String[]args){
			Scanner sc=new Scanner(System.in);
		System.out.print("Enter thE LENGTH ");
        double LENGTH = sc.nextDouble();

        System.out.print("Enter the WIDTH ");
        double WIDTH = sc.nextDouble();

        double Perimeter = 2 * (LENGTH + WIDTH);

        System.out.println("The volume of the cylinder is: " + Perimeter);
    }
}
