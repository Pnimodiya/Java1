import org.junit.Test;

import junit.framework.TestCase;
public class AddTest extends TestCase {

//Steps 3:
 Add add = null;
 // initialization code 
  public void setUp() {
     //Step 4:
     add = new Add(); 
  }
  //Step 6
  @Test
  public void testSum() {
   // Here i am passing expected value 30 so test case will be success.
    assertEquals(30, add.sum(10, 20));
  }
 // Cleanup code 
 public void tearDown() {
   //Step 5
   add = null; 
 }

}