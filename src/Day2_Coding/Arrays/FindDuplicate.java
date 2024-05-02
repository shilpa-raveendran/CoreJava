package Day2_Coding.Arrays;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] sorted_arr = {1, 2, 2, 3, 4, 4};
        int[] result=new int[sorted_arr.length];
        int j=0;
        for (int i = 0; i < sorted_arr.length-1; i++) {
            if(sorted_arr[i] == sorted_arr[i+1]){
                result[j++]=sorted_arr[i];
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(result[i]);
        }
    }
}
