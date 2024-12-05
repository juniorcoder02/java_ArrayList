import java.util.ArrayList;

public class MostWaterContainer {

    /**
     * Function to find the maximum water area that can be trapped between two bars.
     * 
     * @param height - ArrayList of integers representing the heights of the bars.
     * @return - Maximum water area that can be trapped.
     * 
     * Time Complexity: O(n)
     * - We traverse the array once using two pointers, so the complexity is linear.
     * 
     * Space Complexity: O(1)
     * - Only a few variables are used for calculations, so the space usage is constant.
     */
    public static int findMaxWater(ArrayList<Integer> height) {
        // Initialize the maximum water area to 0. This handles edge cases like empty or single-element lists.
        int maxWater = 0;

        // Use two pointers to represent the left and right boundaries of the container.
        int leftBoundary = 0;
        int rightBoundary = height.size() - 1;

        // Loop until the two pointers meet.
        while (leftBoundary < rightBoundary) {
            // Calculate the height of water that can be trapped between the two boundaries.
            int ht = Math.min(height.get(leftBoundary), height.get(rightBoundary)); // Minimum of two heights.
            
            // Calculate the width of the container (distance between the two boundaries).
            int wt = rightBoundary - leftBoundary;

            // Calculate the water area and update the maximum water area if the current area is larger.
            int waterArea = ht * wt;
            maxWater = Math.max(maxWater, waterArea);

            // Move the pointer pointing to the smaller boundary inward, as the container size
            // depends on the smaller height, and we aim to maximize it.
            if (height.get(leftBoundary) < height.get(rightBoundary)) {
                leftBoundary++;
            } else {
                rightBoundary--;
            }
        }

        // Return the maximum water area found.
        return maxWater;
    }

    public static void main(String[] args) {
        // Create an ArrayList to represent the heights of the bars.
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(3);
        height.add(4);
        height.add(7);

        // Call the function and print the result.
        System.out.println(findMaxWater(height));
    }
}
