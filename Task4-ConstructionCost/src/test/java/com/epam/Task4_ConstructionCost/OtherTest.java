package com.epam.Task4_ConstructionCost;

import static org.junit.Assert.*;

import org.junit.Test;

public class OtherTest 
{
	ConstructionCost constructionCost=Factory.constructionType("xyz",true);
	@Test
	public void test() 
	{
		assertNull(constructionCost.calculateCost(10,true));
	}

}
