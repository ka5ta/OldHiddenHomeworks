package Page14.Exercise1;

public class Integer {
    private int x;

    public Integer(int x){
        this.x = x;
    }

    /*public void setInteger(int x){
        this.x=x;
    }*/

    public void printInteger(){
        System.out.println(x);
    }

    public int getNumber(){
        return x;
    }

    public static void main(String[] args) {
        Integer integer = new Integer(15);
        //integer.setInteger(15);
        System.out.print("printInteger: ");
        integer.printInteger();

        int y = integer.getNumber();
        System.out.printf("y: %d\n", y);


    }
}
