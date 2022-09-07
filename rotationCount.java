public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {12, 15,7, 9, 11};
        System.out.println(rC(arr));

    }
    static int Rc(int[] arr){

    }








//using for loop
    static int rC(int[] arr) {
        int counter = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                counter++;
                return counter;
            }
        }
        return 0;
    }
}