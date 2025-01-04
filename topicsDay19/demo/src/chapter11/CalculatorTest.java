package chapter11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//assertEquals(expected, actual, message): Verifies that two values are equal
public class CalculatorTest {

   @Test
    void testAddition() {
     
	   Calculator cal = new Calculator();
	   int result = cal.add(0, 0);
    
   assertEquals("0",0,"0+1 = 0");
   }
   
   @Test
   void testIntParamaeterAddition() {
    
   
  }
}
