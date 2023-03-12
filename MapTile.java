import java.util.ArrayList;

public class MapTile {
    private int x;
    private int y;

    public MapTile(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public ArrayList<MapTile> adjacentMoves() {
        ArrayList<MapTile> moves = new ArrayList<MapTile>();
        moves.add(new MapTile(x + 1, y));
        moves.add(new MapTile(x - 1, y));
        moves.add(new MapTile(x, y + 1));
        moves.add(new MapTile(x, y - 1));
        return moves;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
