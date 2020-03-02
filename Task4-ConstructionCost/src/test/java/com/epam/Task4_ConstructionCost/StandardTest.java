package com.epam.Task4_ConstructionCost;

import static org.junit.Assert.*;

import org.junit.Test;

public class StandardTest 
{
	ConstructionCost constructionCost=Factory.constructionType("Standard",false);
	@Test
	public void test() 
	{
		assertEquals(12000,constructionCost.calculateCost(10,false));
	}

}
