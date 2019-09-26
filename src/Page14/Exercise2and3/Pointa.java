package Page14.Exercise2and3;

public class Pointa {
    private int x;
    private int y;

    public Pointa(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }
}
