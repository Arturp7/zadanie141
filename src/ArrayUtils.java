import java.util.ArrayList;
import java.util.Collections;

public class ArrayUtils {


    void reversedArray(ArrayList numb) {
        int j = numb.size();
        for (int i = 0; i < numb.size(); i++) {
            System.out.print(numb.get(j - 1));
            j--;
        }
    }
    void sumArray(ArrayList numb){
        int sum = 0;
         {for (int i = 0; i <numb.size() ; i++)
            sum = sum + (int)numb.get(i);
             for (int i = 0; i <numb.size()-1 ; i++)
            System.out.print(((int)numb.get(i))+"+");
        }
        System.out.print(numb.get(numb.size()-1));
        System.out.println(" = "+sum);
    }

    void smallest(ArrayList numb){
        System.out.println(Collections.min(numb));
    }

    void largest(ArrayList numb){
        System.out.println(Collections.max(numb));
    }




}
