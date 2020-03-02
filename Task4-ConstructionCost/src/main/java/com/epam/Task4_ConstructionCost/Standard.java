package com.epam.Task4_ConstructionCost;

public class Standard extends ConstructionCost 
{
	public int calculateCost(int area,boolean automated) 
	{
		System.out.println(1200*area);
		if(!automated)
			return 1200*area;
		else
			return 0;
	}

}
