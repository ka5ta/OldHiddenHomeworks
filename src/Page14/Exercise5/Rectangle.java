package Page14.Exercise5;

import Page14.Exercise2and3.Pointa;

public class Rectangle {
    public Pointa topLeft;
    public Pointa bottomRight;

    public Rectangle(Pointa topLeft, Pointa bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public Pointa getTopLeft() {
        return topLeft;
    }

    public Pointa getTopRight() {
        return new Pointa(bottomRight.getX(),topLeft.getY());
    }

    public Pointa getBottomLeft() {
        return bottomRight;
    }

    public Pointa getBottomRight() {
        return new Pointa(topLeft.getX(),bottomRight.getY());
    }


    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Pointa(0,1), new Pointa(1,0));

    }
}

