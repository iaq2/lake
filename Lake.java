//Ittehad Qabid Java - Activities at Lake Lazy Days

import java.util.*;
public class Lake {
	public static void main (String[] args) {
		double temperature = 0;									// Temperature of lake 
		System.out.print("Give Temperature Details: ");			// Asks user the current temperature at Lake
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		temperature = Double.parseDouble(sc.nextLine());			// Number format for temperature of lake 
		if (temperature >= 80.0 && temperature < 95) {				// Recommends going swimming if the temperature is [80-95)
			System.out.println("Go for Swimming"); }
		else if (temperature >= 60.0 && temperature <= 80.0) {		// Recommends playing tennis if the temperature is [60-80] 
				System.out.println("Play Tennis");}
		else if (temperature >= 40.0 && temperature <= 60.0) {		// Recommends playing golf if the temperature is [40-60] 
				System.out.println("Play Golf"); }
		else if (temperature < 40.0 && temperature > 20.0)	{		// Recommends going skiing if the temperature is (20-40)
				System.out.println("Go for Skiing"); }
		else if (temperature >= 95.0 || temperature <= 20.0) {		// Recommends visiting shops if the temperature is [95]above or [20]below 
				System.out.println("Please visit our shops!"); }
							
	}
}
