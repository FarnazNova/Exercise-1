import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// Printing even numbers between 1-100

				Scanner scanner = new Scanner(System.in);
				System.out.println("Even Numbers:");
				for (int i = 0; i<=100; i++) 
				{			
					if(i%2 == 0)
						{				
						System.out.print(i + " ");
						}				
				}
				
				scanner.next();
			}

		}
