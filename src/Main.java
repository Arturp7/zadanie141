import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {


        ArrayUtils util1 = new ArrayUtils();
        ArrayList<Integer> numbers = new ArrayList<>(util1.creation());


        // System.out.println(numbers);
        util1.reversedArray(numbers);
        System.out.println();
        util1.sumArray(numbers);
        util1.smallest(numbers);
        util1.largest(numbers);



    }
}
