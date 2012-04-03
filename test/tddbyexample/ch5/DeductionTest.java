package tddbyexample.ch5;

import static org.junit.Assert.*;

import org.junit.Test;
import java.util.*;

public class DeductionTest {

	@Test
	public void testDeductionForCircumstances() {
		Set<Circumstance> premise = observation();
		Deduction ivan = new Deduction(premise);
		assertTrue(ivan.valid());
	}
	
	
	
	private Set<Circumstance> observation(){
		Set<Circumstance> circumstances = new LinkedHashSet<Circumstance>();
		Circumstance nickStatement = new Circumstance("Earlier in the night, Nick said he enjoys comfortable footwear");
		circumstances.add(nickStatement);
		return circumstances;
	}
	@Test
	public void testDeductionFromMultipleConflictingCircumstances() {
		Set<Circumstance> circumstances = sexStory();
		Deduction ivan = new Deduction(circumstances);
		assertFalse(ivan.valid());
	}



	private Set<Circumstance> sexStory() {
		Set<Circumstance> circumstances = new LinkedHashSet<Circumstance>();
		Circumstance shaniquaStatement = new Circumstance("Shaniqua came into the bar proclaiming Ivan was her BABBY DADDY!");
		Circumstance ivanStatement = new Circumstance("Ivan stated he never slept with this crazy bitch so he couldn't be her Babby daddy she just wants all his money he made from the byter IPO");
		Circumstance dnaStatement = new Circumstance("DNA sequencing found that Ivan had indeed slept with Shaniqua but was too ashamed to admit it in public");
		circumstances.add(shaniquaStatement);
		circumstances.add(ivanStatement);
		circumstances.add(dnaStatement);
		return circumstances;
	}
	@Test
	public void testGivingWeightToCircumstance() {
		Circumstance sunStatement = new Circumstance("Sun rise in the east");
		sunStatement.setWeight(100);
		assertEquals(100,sunStatement.weight);
		
	}
}