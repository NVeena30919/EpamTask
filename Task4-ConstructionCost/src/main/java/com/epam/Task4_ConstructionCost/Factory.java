package com.epam.Task4_ConstructionCost;

public class Factory 
{
	public static ConstructionCost constructionType(String type, boolean automated)
	{
		if(type.equalsIgnoreCase("Standard") && !automated)
		{
			return new Standard();
		}
		if(type.equalsIgnoreCase("AboveStandard") && !automated)
		{
			return new AboveStandard();
		}
		if(type.equalsIgnoreCase("HighStandard") && !automated)
		{
			return new HighStandard();
		}
		if(type.equalsIgnoreCase("HighStandardAutomated") && automated)
		{
			return new HighStandardAutomated();
		}
		else
		{
			return null;
		}
	}

}

