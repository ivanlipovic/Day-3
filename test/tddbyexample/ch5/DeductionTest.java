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

}
