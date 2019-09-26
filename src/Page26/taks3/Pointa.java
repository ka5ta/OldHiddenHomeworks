package Page26.taks3;

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

    public int setX(Pointa point) {
        int oldX = x;
        this.x = point.x;
        return oldX;
    }

    public int setY(Pointa point) {
        int oldY = y;
        this.y = point.y;
        return oldY;
    }

    public Pointa setXY(Pointa point){
        /*int oldX = x;
        int oldY = y;
        this.x = point.x;
        this.y = point.y;
        return new Pointa(oldX, oldY);*/

        int oldX = setX(point);
        int oldY = setY(point);
        return new Pointa(oldX, oldY);
    }

    public String toString() {
        return String.format("(%d,%d)", x, y);
    }

    public static void main(String[] args) {



    }
}
