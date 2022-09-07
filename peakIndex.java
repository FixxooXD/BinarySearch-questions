public class peakIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 9, 5, 6,9, 4};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] nums) {

        int tempMax = nums[0];
        int maxIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > tempMax) {
                tempMax = nums[i];
                maxIndex = i;
            }

        }
        return maxIndex;
    }
}