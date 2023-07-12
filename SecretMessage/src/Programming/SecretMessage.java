package Programming;
import java.util.Scanner;

public class SecretMessage {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a character");
		char ch=scan.next().charAt(0);

		SecretMessageApp decoder = new SecretMessageApp();

		System.out.println(decoder.decodeCharacter('A'));
		
	}

}
