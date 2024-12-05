import java.util.ArrayList;

public class Swap {

    public static void swapNUmbers(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(9);
        list.add(6);

        System.out.println("List Before Swapping : " + list);
        swapNUmbers(list, 1, 3);
        System.out.println("List After Swapping : " + list);

    }
}