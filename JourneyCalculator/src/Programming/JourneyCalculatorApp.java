package Programming;
import java.util.Scanner;

public class JourneyCalculatorApp {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		float speed=scan.nextFloat();
		float time=scan.nextFloat();
		
		JourneyCalculator journeyCalculator = new JourneyCalculator();

		System.out.printf("%.2f",journeyCalculator.calculateDistance(speed, time));
		
	}

}
