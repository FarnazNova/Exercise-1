import java.util.Scanner;
public class OddNumbers {

	public static void main(String[] args) {
		// Printing odd numbers between 1-100

		Scanner scanner = new Scanner(System.in);
		System.out.println("Odd Numbers:");
		for (int i = 0; i<100; i++) 
		{			
			if(i%2 != 0)
				{				
				System.out.print(i + " ");
				}				
		}
		
		scanner.next();
	}

}
