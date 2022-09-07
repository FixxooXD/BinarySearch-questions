public class FloorNumb {
    public static void main(String[] args) {
//        int[] arr = {2,3,5,9,14,16,17,18}; // n  = 14: greatest or equal of n;
        int[] arr = {18,17,16,14,9,5,3,2};
        int n = 0;
        System.out.println(FloorNum(arr,n));
    }




    static int FloorNum(int[] arr,int n) {
        int start =0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
//            if target == mid
            if (n == arr[mid]) {
                return mid;
            }
            // IF ARRAY IS ASCENDING
            if (arr[0] < arr[arr.length-1]) {
                if (n > arr[mid]) {

                    start = mid + 1;
                } else if (n < arr[mid]) {
                    end = mid - 1;
                }
            }
            // IF ARRAY IS DESCENDING
            else {
                if (n <arr[mid]){
                    start = mid+1;
                }
                else if (n>arr[mid]){
                    end = mid-1;
                }
            }
        }return end;
    }
}

