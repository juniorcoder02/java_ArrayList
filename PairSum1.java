import java.util.ArrayList;
public class PairSum1{
    public static boolean pairSum(ArrayList<Integer> list , int target){
        // 2 pointer approach 
        int left = 0 , right = list.size()-1;
        while(left<right){
            if(list.get(left)+list.get(right)==target){
                return true;
            }else if(list.get(left)+list.get(right)<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false; // pair not found
    }
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target = 7;
        System.out.println(pairSum(list, target)); // true, 1+4 = 5
    }
}