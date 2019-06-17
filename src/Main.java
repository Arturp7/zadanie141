import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayUtils util1 = new ArrayUtils();

        Integer number = 0;

        do {
            System.out.println("Podaj kilka liczb całkowitych większych od zera, dodanie liczby mniejszej od 0 kończy podawanie liczb  ");
            number = scan.nextInt();
            if (number >= 0) {
                numbers.add(number);
            }
        }
        while (number >= 0);
        {
            System.out.println("Podałeś liczbę mniejszą od zera");
        }
        // System.out.println(numbers);
        util1.reversedArray(numbers);
        System.out.println();
        util1.sumArray(numbers);
        util1.smallest(numbers);
        util1.largest(numbers);



    }
}
