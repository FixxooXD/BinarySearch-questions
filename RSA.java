public class RSA {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(peak(arr));
        System.out.println(answer(arr,target));
    }
    static int answer(int[] nums,int target) {
        int peak = peak(nums);
        if (peak == -1) {
            return binary(nums, 0, nums.length - 1, target);
        } else if (target == nums[peak]) {
            return peak;
        } else if (target >= nums[0]) {
            return binary(nums, 0, peak - 1, target);
        }
        return binary(nums, peak + 1, nums.length - 1, target);
    }

        static int binary ( int[] nums, int start, int end, int target){
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (nums[start] < nums[end]) {
                    if (target < nums[mid]) {
                        end = mid - 1;
                    } else if (target > nums[mid]) {
                        start = mid + 1;
                    }
                } else if (target == nums[mid]) {
                    return mid;
                }

            }
            return -1;
        }


        static int peak ( int[] nums){
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start);
                if (mid < end && nums[mid] > nums[mid + 1]) {
                    end = mid;
                }
                if (mid > start && nums[mid] < nums[mid - 1]) {
                    return mid - 1;
                } else if (nums[0] > nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
        }
    }
