import java.util.Scanner;

public class BmiEn {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your height in m: ");
		double height = scanner.nextDouble();		
		
		System.out.println("Enter your weight in kg: ");
		double weight = scanner.nextDouble();				
		
		scanner.close();
		double bmi = Math.round(weight / (height * height));
		System.out.println("Your BMI is: " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Underweight");
		}
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Normal");
		}
		else if (bmi >= 25 && bmi < 30) {
			System.out.println("Overweigth");
		}
		else if (bmi > 30) {
			System.out.println("Obese");
		}
		else {
			System.out.println("Invalid value");
		}
	}
}
