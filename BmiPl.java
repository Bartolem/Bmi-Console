import java.util.Scanner;

public class BmiPl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj swój wzrost w m: ");
		double height = scanner.nextDouble();		
		
		System.out.println("Podaj swoj¹ wagê w kg: ");
		double weight = scanner.nextDouble();				
		
		scanner.close();
		double bmi = Math.round(weight / (height * height));
		System.out.println("Twój wskaik bmi wynosi: " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Masz niedowagê");
		}
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Twoja waga jest prawid³owa");
		}
		else if (bmi >= 25 && bmi < 30) {
			System.out.println("Masz nadwagê");
		}
		else if (bmi > 30) {
			System.out.println("Masz oty³oœæ");
		}
		else {
			System.out.println("Podana nieprawid³owa wartoœæ");
		}
	}

}
