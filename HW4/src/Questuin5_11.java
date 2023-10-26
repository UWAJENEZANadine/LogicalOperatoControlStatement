import java.util.Scanner;

public class Questuin5_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter any number you want for finding the smallest");
		int number = sc.nextInt();
		int counter = 1;

		
		System.out.println("enter a number");
		int smallest = sc.nextInt();
		while(counter <number) {
			System.out.println("enter a number");
			int num = sc.nextInt();
			if(num < smallest) {
				smallest = num;
				
			}
			counter ++; 
			
		}
		System.out.printf("The smallest number is %d",smallest);
		
	}

}
