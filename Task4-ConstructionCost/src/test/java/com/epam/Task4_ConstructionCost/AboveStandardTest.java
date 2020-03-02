package com.epam.Task4_ConstructionCost;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AboveStandardTest 
{
	ConstructionCost constructionCost=Factory.constructionType("AboveStandard",false);
	@Test
	public void test() 
	{
		assertEquals(15000,constructionCost.calculateCost(10,false));
	}

}
