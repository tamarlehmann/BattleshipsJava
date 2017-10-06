import org.junit.Test;
import static org.junit.Assert.*;

public class ShipTest {

    @Test
    public void testShip(){
        Ship test = new Ship();
        String expectedShip = "X";
        String actualShip = test.createShip();
        assertEquals(expectedShip, actualShip);
    }
}