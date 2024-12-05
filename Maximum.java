import java.util.ArrayList;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(-2);
        list.add(25);
        list.add(0);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Maximum value in the list: " + max);
    }
}