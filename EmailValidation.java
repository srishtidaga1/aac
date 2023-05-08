package p1;
import java.util.Scanner;
public class EmailValidation {

	public static void main(String[] args) {
		String[] EmployeeEmail = {"abc.b@example.com", "rdf.k@example.com", "smi.l@example.com"};
        Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter email ID  which you want to search: ");
		String Email = scanner.nextLine();
		        boolean Valid = false;
		        for (String emailId : EmployeeEmail) {
		            if (emailId.equals(Email)) {
		                Valid = true;
		                break;
		            }
		        }

		        
		        if (Valid) {
		            System.out.println("Valid Email ID");
		        } else {
		            System.out.println("Invalid Email ID");
		        }
		    }
		

	}


