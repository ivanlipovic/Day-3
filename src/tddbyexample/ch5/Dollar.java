package tddbyexample.ch5;


/**
 *
 * @author nvaidyan
 */
public class Dollar extends Money {
        
    Dollar(int amount){
        this.amount= amount;
    }
    
    Money times(int multiplier) {
      return new Dollar(amount * multiplier);
    }

public boolean equals(Object object) {
        Money money=(Money) object;
        return amount == money.amount;
}
}