public class GallonsToLiters {
	public static void main(String[] args) {
		for(int gallons = 1; gallons <= 100; gallons++) {
			float liters = gallons * 3.78541f;
			System.out.println(gallons+" gallons     "+liters+" liters");	
			
			boolean gallonsIsDivisibleBy10 = gallons % 10 == 0;
			if(gallonsIsDivisibleBy10) {
				System.out.println("");
			}
		}
	}
}