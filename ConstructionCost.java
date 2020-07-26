package House;

public class ConstructionCost {
	
	float calculateConstructionCost(String matstand,float square_feet)
	{
		
		if(matstand.equals("standard"))
		{
			return 1200*square_feet;
		}
		else if(matstand.equals("above standard"))
		{
			return 1500*square_feet;
		}
		else if(matstand.equals("high standard"))
		{
			return 1800*square_feet;
		}
		else if(matstand.equals("hidh standard and fully automated home"))
		{
			return 2500*square_feet;
		}
		else {
		return 0;
		}
	}

}
