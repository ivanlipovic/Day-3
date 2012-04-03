package tddbyexample.ch5;

public class Franc extends Money {
    
    Franc(int amount){
        this.amount= amount;
    }
    
    Money times(int multiplier) {
      return new Franc(amount * multiplier);
    }

public boolean equals(Object object) {
        Money money=(Money) object;
        return amount == money.amount;
}
}