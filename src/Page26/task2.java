package Page26;

import java.util.Arrays;

public class task2 {

    public static void main(String[] args) {
        //String output = Arrays.toString(args);
        //System.out.println(output);
        //System.out.print(String.join("", args));

        stringJoin(args);
    }

    public static void stringJoin(String[] args) {
        for (String arg: args) {
            System.out.print(arg);
        }

    }
}
