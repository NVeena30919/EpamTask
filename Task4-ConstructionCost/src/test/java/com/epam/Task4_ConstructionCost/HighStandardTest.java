package com.epam.Task4_ConstructionCost;

import static org.junit.Assert.*;

import org.junit.Test;

public class HighStandardTest 
{
	ConstructionCost constructionCost=Factory.constructionType("HighStandard",false);
	@Test
	public void test() 
	{
		assertEquals(18000,constructionCost.calculateCost(10,false));
	}

}
