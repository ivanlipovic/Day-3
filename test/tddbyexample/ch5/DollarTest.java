package tddbyexample.ch5;

import org.junit.Test;
import static org.junit.Assert.*;

public class DollarTest {
    
     @Test
     public void testMultiplication() {
         Dollar five= new Dollar(5);
         assertEquals(new Dollar(10), five.times(2));
         assertEquals(new Dollar(15), five.times(3));        
     }
     @Test
     public void testMultiplicationByZero() {
         Dollar five= new Dollar(5);
         Money product= five.times(0);
         assertEquals(new Dollar(0), product);        
     }
     
     @Test
     public void testEquality() {
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(5).equals(new Dollar(6)));
     }
       
}
