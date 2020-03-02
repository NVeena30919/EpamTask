package com.epam.Task4_ConstructionCost;

import static org.junit.Assert.*;

import org.junit.Test;

public class HighStandardAutomatedTest 
{
	ConstructionCost constructionCost=Factory.constructionType("HighStandardAutomated",true);
	@Test
	public void test() 
	{
		assertEquals(25000,constructionCost.calculateCost(10,true));
	}

}

