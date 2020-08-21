import java.util.Scanner;
public class Userandpass {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String user, pass;
		
		System.out.print("Enter Username: ");
		user = input.nextLine();
		
		System.out.print("Enter Password: ");
		pass = input.nextLine();
		
		if(user.equals("Martin") && (pass.equals("Kasra"))) {
			System.out.println("Welcome Martin Kasra");
		} else {
			System.out.println("Something went wrong");
		}

	}

}
