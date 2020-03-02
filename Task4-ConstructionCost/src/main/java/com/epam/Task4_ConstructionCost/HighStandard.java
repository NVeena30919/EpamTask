package com.epam.Task4_ConstructionCost;

public class HighStandard extends ConstructionCost 
{
	@Override
	public int calculateCost(int area, boolean automated) 
	{
		if(!automated)
			return 1800*area;
		return 0;
	}

}
