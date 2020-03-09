package epam.Task5_CalculateInterest;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class InterestTest {
	private static final Logger logger = LogManager.getLogger(InterestTest.class);
	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{ 
		logger.entry();
		logger.trace("Testing");
		logger.debug("Testing Interest modules");
		SimpleInterest si = new SimpleInterest();
		CompoundInterest ci = new CompoundInterest();
		logger.info(si.CalculateInterest(2000, 4, 3));
		logger.info(ci.CalculateInterest(635, 2, 4));
		logger.exit();
	}
}