import java.util.Scanner;

public class Userandpass {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		for( int x=0; x<3; x++) {
		String user, pass;
		
		System.out.print("Enter Username: ");
		user = input.nextLine();
		
		System.out.print("Enter Password: ");
		pass = input.nextLine();
		
		if(user.equals("Martin") && (pass.equals("Kasra"))) {
			System.out.println("Welcome Martin Kasra"); break;
		} else 
			if (x>=2)
			{ System.out.println ("denied access");}
			
			else
				
			{ System.out.println("Wrong try again");}

		}}}

// Jag missade sista delen av din första lektion för jag blev utloggad från mitt konto och koden blev till en ny slupmad kod så blev tvungen att kontakta stina men jag antar att du ville ha en ny egen kod från varje person annars får du kontakta mig.
// Detta är en simple kod på en inlogg, vi kan simpelt säga att vi anger string till user och pass
//som vi sedan kommer använda till till 2 stycken olika inputs. Programet kommer fråga dig efter ett Usernamn
//som jag då har har satt till Martin som man ser i user equal till "Martin" och samma sak med Enter password
//som jag har satt till "Kasra" som man ser i den andra equalen och om kraven uppnås så kommer if kommandot in och du får 
// meddelandet "Welcome Martin Kasra" om du inte anger det jag har satt i equal kommandonen så kommer else kommandot in 
// och du får meddelandet "something went wrong"