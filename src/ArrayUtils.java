import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayUtils {

    ArrayList<Integer> creation() {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        Integer number ;
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
        return numbers ;
    }

    void reversedArray(ArrayList numb) {
        int j = numb.size();
        for (int i = 0; i < numb.size(); i++) {
            System.out.print(numb.get(j - 1));
            j--;
        }
    }

    void sumArray(ArrayList<Integer> numb) {
        int sum = 0;
        {
            for (int i = 0; i < numb.size(); i++)
                sum = sum + numb.get(i);
            for (int i = 0; i < numb.size() - 1; i++)
                System.out.print((numb.get(i)) + "+");
        }
        System.out.print((int)numb.get(numb.size() - 1));
        System.out.println(" = " + sum);
    }

    void smallest(ArrayList<Integer> numb) {
        System.out.println(Collections.min(numb));
    }

    void largest(ArrayList<Integer> numb) {
        System.out.println(Collections.max(numb));
    }


}
