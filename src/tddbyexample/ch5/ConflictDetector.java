package tddbyexample.ch5;

import java.util.Comparator;

public class ConflictDetector implements Comparator<Circumstance> {

	Circumstance premise1;
	Circumstance premise2;
	
	public ConflictDetector(Circumstance ivanStatement,
			Circumstance dnaStatement) {
		premise1 = ivanStatement;
		premise2 = dnaStatement;
	}
	
	public int analyze(){
		return compare(premise1, premise2);
	}

	@Override
	public int compare(Circumstance arg0, Circumstance arg1) {
		return Integer.compare(arg0.weight, arg1.weight);
	}

}
