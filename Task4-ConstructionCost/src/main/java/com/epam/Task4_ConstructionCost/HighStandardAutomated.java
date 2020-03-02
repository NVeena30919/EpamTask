package com.epam.Task4_ConstructionCost;

public class HighStandardAutomated extends ConstructionCost
{
	@Override
	public int calculateCost(int area, boolean automated) 
	{
		if(automated)
			return 2500*area;
		else
			return 0;
	}

}
