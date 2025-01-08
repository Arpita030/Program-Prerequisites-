import java.util.*;
public class Average{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 number:");
		double num1=sc.nextDouble();
		System.out.println("enter 2 number:");
		double num2=sc.nextDouble();
		System.out.println("enter 3 number:");
		double num3=sc.nextDouble();
		double avg=(num1+num2+num3)/3;
		System.out.println(avg);
	}
}