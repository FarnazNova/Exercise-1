import java.util.Scanner; 

public class Login {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Validate username and password	
		
		String username = "Farnaz";
		String password = "123456";
		System.out.println("Please enter your username:");
		
		String username1 = scanner.next();
		System.out.println("Please enter your password:");
		String userpassword = scanner.next();
		if (username.equals(username) && userpassword.equals(password)) 
		{
			System.out.println("Welcome " + username + "!");
		}
		else
		{
			System.out.println("Invalid Username and password!");
		}
		
	}

}
