import java.util.ArrayList;

public class PairSum2 {

    public static boolean PairSum(ArrayList<Integer> list, int target) {
        int breakPoint = -1;
        int n = list.size();
        for (int i = 0; i < n; i++) {
            if (list.get(i) > list.get(i + 1)) {
                breakPoint = i;
                break;
            }
        }
        int left = breakPoint + 1;
        int right = breakPoint;
        while (left != right) {
            if (list.get(left) + list.get(right) == target) {
                return true;
            } else if (list.get(left) + list.get(right) < target) {
                left = (left + 1) % n;
            } else {
                right = (right - 1 + n) % n; // to handle negative index
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;
        System.out.println(PairSum(list, target)); // true
    }
}
