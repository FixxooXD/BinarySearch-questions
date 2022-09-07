public class infiniteArray {
    public static void main(String[] args) {
        int target = 15;
        int[] arr  = {5,6,8,9,12,15,16,18,22,25};
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int n){
//        int start = 0;
//        int end = 1;
//
//        // condition for the target to lie in the range
//        while (n > arr[end]) {
//            int temp = end + 1; // this is my new start
//            // double the box value
//            // end = previous end + sizeofbox*2
//            end = end + (end - start + 1) * 2;
//            start = temp;
//        }
//        return infi(arr, n, start, end);
//
//    }

       int start  = 0;
       int end = 1;
       while (n > arr[end]){
          int newStart  = end+1;
           end = end* 2;

       }
       return infi(arr,n,start,end);
    }

    static int infi(int[] arr,int n,int start,int end){
           while (start<=end){
            int mid = start+(end-start)/2;
            if (n >arr[mid]){
                start = mid+1;
            }else if (n<arr[mid]){
                end = mid-1;
            }
            else if (n == arr[mid]){
                return mid;
            }
        }return -1;
    }}

