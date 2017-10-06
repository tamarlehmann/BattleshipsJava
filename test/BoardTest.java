import org.junit.Test;
import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testBoardSize(){
        Board test = new Board();
        String[][] expectedArray = {
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""},
                {"", "", "", "", ""}
        };
        String[][] resultArray = test.createBoard();
        assertArrayEquals(expectedArray, resultArray);
    }

}