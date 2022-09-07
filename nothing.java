public class nothing {
    public static void main(String[] args) {
        int[] arr = {1,2,1,3,5,6,4};
        System.out.println(peakIndex(arr));
    }
    static int peakIndex(int[] nums){

        int tempMax = nums[0];
        int maxIndex =0;

        for (int i =0;i<nums.length;i++){
            if (nums[i]>tempMax){
                tempMax =nums[i];
                maxIndex = i;
            }

        }return maxIndex;
    }
//        int start= 0;
//        int tempMax=0;
//        int end= arr.length-1;
//        while (start<=end){
//            int mid = start+(end-start)/2;
//            if (tempMax >arr[mid]){
//                start = mid+1;
//                tempMax=arr[1];
//            }else if (tempMax<arr[mid]){
//                end = mid-1;
//            }
//            else if (tempMax == arr[mid]){
//                return mid+1;
//            }
//        }return -1;
//    }
}