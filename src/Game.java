public class Game {

    Integer coords;

    public static void main(String[] args) {
        Board board = new Board();

        Object[] ships = new Object[3];
        for(int i = 1; i < ships.length; i++){
            Ship thisShip = new Ship();
            ships[i] = thisShip.createShip();
        }
    }
}
