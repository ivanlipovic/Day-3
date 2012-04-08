package tddbyexample.ch5;

import java.util.Iterator;
import java.util.Set;

public class Deduction {
	private Set<Circumstance> premise;
	public Deduction(Set<Circumstance> observation){
		premise = observation;
	}
	public boolean valid() {
		boolean conclusion = true;
		for(Circumstance claim : premise){
			if(claim.weight == 0){
				conclusion = false;
			}
		}
		return conclusion;
	}
}
