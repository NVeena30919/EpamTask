package com.epam.Task4_ConstructionCost;

public class AboveStandard extends ConstructionCost
{
	@Override
	public int calculateCost(int area, boolean automated) 
	{
		if(!automated)
			return 1500*area;
		return 0;
	}

}
