import java.util.Scanner;

public class ReverseNumber{
	public static void Reverse(int num){
		if(num>0){
			System.out.print(num%10); //to get reminder value
			num=num/10; //get the integer value
			Reverse(num); //recursion the method
		}
	}
	public static void main(String args[]){
		int number=0;

		//take the number from the user
		System.out.print("Enter a number : ");
		Scanner s=new Scanner(System.in);
		number=s.nextInt();

		//print the reverse value
		System.out.print("Reverse number : ");
		Reverse(number);
		System.out.println("");
	}
}
