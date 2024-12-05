import java.util.ArrayList;
import java.util.Collections;
public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(6);
        list.add(7);
        System.out.println("Before Sorting : "+ list);
        Collections.sort(list); //sorting in ascending order ## in built function
        System.out.println("After sorting in ascending order : "+list);
        Collections.sort(list,Collections.reverseOrder()); //sorting in descending order
        // here Collections.reverseOrder(); is a comparator used to define logic manner for sorting
        System.out.println("After sorting in descending order : "+list);  
    }
}
