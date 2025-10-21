package java_study;
import java.util.*;


public class Day4_classwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Username: ");
		String User = sc.nextLine();
		System.out.println("Enter the password: ");
		String Password = sc.nextLine();
		if (User.equals("admin") && Password.equals("java123"))
		{
			System.out.println("Login Successfull");
		}
		else
		{
			System.out.println("Access Denied");
		}
	}

}
