import java.util.Scanner;

public class BmiPl {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Podaj sw�j wzrost w m: ");
		double height = scanner.nextDouble();		
		
		System.out.println("Podaj swoj� wag� w kg: ");
		double weight = scanner.nextDouble();				
		
		scanner.close();
		double bmi = Math.round(weight / (height * height));
		System.out.println("Tw�j wskaik bmi wynosi: " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("Masz niedowag�");
		}
		else if (bmi >= 18.5 && bmi < 25) {
			System.out.println("Twoja waga jest prawid�owa");
		}
		else if (bmi >= 25 && bmi < 30) {
			System.out.println("Masz nadwag�");
		}
		else if (bmi > 30) {
			System.out.println("Masz oty�o��");
		}
		else {
			System.out.println("Podana nieprawid�owa warto��");
		}
	}

}
