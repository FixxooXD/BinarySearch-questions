public class SmallerLetter {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};                //  greatest or equal of n;
        //  int[] arr = {18,17,16,14,9,5,3,2};
        char n = 'm';
        System.out.println(nextGreatestLetter(arr,n));

    }

    static char nextGreatestLetter(char[] arr,char target) {   //smallest character larger than target;
        int start =0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                    end = mid - 1;
                }
            else    if (target == arr[arr.length-1] ||target >arr[arr.length-1] ){
                return arr[0];
            }

            else {
                start = mid +1;
            }


            }return arr[start];
        }

}

