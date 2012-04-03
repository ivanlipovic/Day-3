package tddbyexample.ch5;

import java.util.Set;

public class Deduction {
	private Set<Circumstance> premise;
	public Deduction(Set<Circumstance> observation){
		premise = observation;
	}
	public boolean valid() {
		return true;
	}
}
