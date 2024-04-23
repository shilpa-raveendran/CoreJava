package Day2_Coding.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] sorted_arr = {1, 2, 2, 3, 4, 4};
        System.out.print("Original Array: ");
        for (int j : sorted_arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        int resultLength=removeDuplicateSortedArray(sorted_arr);
        for (int i = 0; i < resultLength; i++){
            System.out.print(sorted_arr[i] + " ");
        }
    }

    private static int removeDuplicateSortedArray(int[] sorted_arr) {
        int[] temp = new int[sorted_arr.length];//holds temp array
        int j=0;
        for (int i = 0; i < sorted_arr.length-1; i++) {
            if(sorted_arr[i] !=sorted_arr[i+1]){
                temp[j++]=sorted_arr[i];
            }
        }
        temp[j++]=sorted_arr[sorted_arr.length-1];
        if (j >= 0) System.arraycopy(temp, 0, sorted_arr, 0, j);
        return j;

    }
}
