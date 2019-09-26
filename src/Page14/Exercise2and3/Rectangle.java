package Page14.Exercise2and3;

public class Rectangle {
    private Pointa topLeft, topRight, bottomLeft, bottomRight;

    public Rectangle(Pointa topLeft, Pointa topRight, Pointa bottomLeft, Pointa bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }

    public Pointa getTopLeft() {
        return topLeft;
    }

    public Pointa getTopRight() {
        return topRight;
    }

    public Pointa getBottomLeft() {
        return bottomLeft;
    }

    public Pointa getBottomRight() {
        return bottomRight;
    }

    public void validateFigure() throws Exception {
        boolean leftOK = getTopLeft().getX() == getBottomLeft().getX();
        boolean bottomOK = getBottomLeft().getY() == getBottomRight().getY();
        boolean rightOK = getTopRight().getX() == getBottomRight().getX();
        boolean topOK = getTopLeft().getY() == getTopRight().getY();
        if (leftOK && bottomOK && rightOK && topOK) {
            System.out.println("This is truly rectangle.");
        }else {
            System.out.println("This is NOT rectangle");
        }

/*        if(!(leftOK && bottomOK && rightOK && topOK)){                //this is the other way of
            throw new Exception("This is not rectangle!!");
        }*/
    }

    public void printCorners() {
        // topLeft: Point(1,2), topRight: Point(3,4)...
        System.out.printf("topLeft: %s, topRight: %s, bottomLeft: %s, bottomRight: %s\n", topLeft, topRight, bottomLeft, bottomRight);
    }


    public static void main(String[] args) throws Exception {
        Pointa topLeft = new Pointa(0, 1);
        Pointa topRight = new Pointa(1, 1);
        Pointa bottomLeft = new Pointa(0, 0);
        Pointa bottomRight = new Pointa(1, 0);
        Rectangle rectangle = new Rectangle(topLeft, topRight, bottomLeft, bottomRight);

        rectangle.printCorners();
        rectangle.validateFigure();

    }


}
