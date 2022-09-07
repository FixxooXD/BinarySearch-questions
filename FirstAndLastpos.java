import java.util.Arrays;

public class FirstAndLastpos {
    public static void main(String[] args) {
        int[] arr = {5,7,7,7,7,8,8,10};
        int target = 6;
        System.out.println(Arrays.toString(firstLastpos(arr,target)));
    }static int[] firstLastpos(int[] nums,int target){
        int[] ans = {-1,-1};

        ans[0] = searchL(nums, target);
         ans[1]= searchF(nums, target);
        return ans;
    }

        static int searchF(int[] nums,int target) {
           int ans =-1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == target) {
                    ans = i;
                }
            }return ans;
        }

            static int searchL(int[] nums,int target) {
                  int ans = -1;
                for (int i = nums.length - 1; i >= 0; i--) {
                    if (nums[i] == target) {
                        ans = i;
                    }
                }

                return ans;
            }
}