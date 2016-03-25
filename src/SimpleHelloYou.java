import java.util.Scanner;
public class SimpleHelloYou {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		
		System.out.println("Welcome to SQA Solutions!");
		System.out.println("Please enter your name");
		name = scanner.nextLine();
		System.out.println("Hello "+name+", pleased to meet you! Catch you later. Bye!");

	}

}
