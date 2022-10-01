package itec2610;
import java.util.Scanner;
public class FK_convertor {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter temperature in Fahrenheit:");
		double tf= scan.nextDouble();
		
		double tk = (tf + 459.67)*5/9;
		
		System.out.println("temperature in Kelvin: " + Math.round(tk * 100.0)/ 100.0);

	}

}
