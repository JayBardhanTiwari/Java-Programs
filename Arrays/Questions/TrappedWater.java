package Questions;

public class TrappedWater {

    public static int trappedWater(int height[]) {
        int n = height.length;
        // to find left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        // to find right max boundary
        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);

        }

        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            // waterlevel = min(leftmax,rightmax)
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            // trappedWater = waterlevel - height[i]
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;

    }

    public static void main(String[] args) {
        // Test cases

        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int height2[] = { 4, 2, 0, 3, 2, 5 };

        System.out.println(trappedWater(height));// Output: 11
        System.out.println(trappedWater(height2));// Output: 9

    }
}
