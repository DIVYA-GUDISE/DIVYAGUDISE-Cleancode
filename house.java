package House;
import java.util.*;

public class house {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.format("%s", "Enter  Material Standard: standard,above standard,high standar,high standard and fully automated" );
		String matstand = sc.nextLine();
		System.out.format("%s", "Enter  Square Feet" );
		float square_feet =sc.nextFloat();
		ConstructionCost obj = new ConstructionCost();
		float Cost = obj.calculateConstructionCost(matstand,square_feet);
		System.out.format("%s","Total Cost Of Construction is ");
		System.out.format("%f",Cost);
		
	}

}
