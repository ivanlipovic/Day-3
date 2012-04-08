package tddbyexample.ch5;

public class ConflictDetector {

	Circumstance premise1;
	Circumstance premise2;
	boolean conflict;
	
	public ConflictDetector(Circumstance firstPremise,
			Circumstance secondPremise, boolean potentialConflict) {
		premise1 = firstPremise;
		premise2 = secondPremise;
		conflict = potentialConflict;
	}
	
	public void analyze(){
		if(conflict){
			compare(premise1, premise2);
		}
	}

	public void compare(Circumstance arg0, Circumstance arg1) {
		if(arg0.weight>arg1.weight){
			arg0.setWeight(100);
			arg1.setWeight(0);
		}
		if(arg1.weight>arg0.weight){
			arg1.setWeight(100);
			arg0.setWeight(0);
		}
		if(arg0.weight == arg1.weight){
			throw new RuntimeException("Don't know what to do!");
		}
	}

}
