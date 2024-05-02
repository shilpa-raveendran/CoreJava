package Day2_Coding.Arrays;

public class FrequencyOfElements {

    public static void main(String[] args) {
        int[] arr = {3,2,1,2};
        int[] frequency= new int[arr.length];//store the frequencies

        int counted = -1; // skip the already counted element

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    frequency[j] = counted;
                }
            }
            if(frequency[i] != counted){
                frequency[i]=count;
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            if(frequency[i] != counted){
                System.out.println("Element: "+arr[i] + " Frequency: " +frequency[i]);
            }

        }
    }
}
