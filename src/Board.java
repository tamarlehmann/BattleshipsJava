import java.util.ArrayList;

public class Board {

    public static String[][] createBoard(){
        String[][] board = new String[5][5];
        for(int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = "";
            }
        }
        return board;
    }
}
