import java.util.*;
 class Calculatesimpleinterest{
  public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
    System.out.println("Enter the principal: ");
        double principal = sc.nextDouble();

        System.out.println("Enter the Rate:");
        double Rate = sc.nextDouble();
		System.out.println("Enter the time:");
		double Time = sc.nextDouble();

        double SimpleInterest = (principal * Rate * Time) / 100;

        System.out.println(SimpleInterest );

        sc.close(); 
    }
}