package epam.Task5_ConstructionCost;

import junit.framework.TestCase;

public class ConstructionCostTest {
	private static final Logger logger = LogManager.getLogger(ConstructionCostTest.class);
	//@Test
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {//testCalculateCost() {
		//fail("Not yet implemented");
		logger.entry();
		logger.trace("Testing");
		logger.debug("Testing Construction Cost");
		logger.info(ConstructionCost.CalculateCost("standard", 400, "NO"));
		logger.info(ConstructionCost.CalculateCost("High standard", 2000, "yes"));
		logger.exit();
	}

}