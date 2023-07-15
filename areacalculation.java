package Jayasrijavapractice;
import java.util.Scanner;
public class areacalculation {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int side=sc.nextInt();
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        float radius=sc.nextFloat();
        //area of square side^2
        System.out.println(side*side);
        //area of rectangle l*b
        System.out.println(length*breadth);
        //area of circle pi*radius^2
        float pi=3.14f;
        System.out.printf("%.2f",pi*(radius*radius));
	}

}
