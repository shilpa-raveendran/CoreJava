package dev.shilpa.coreJava;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] arr = {10,23,18,40,35};
        //System.out.println("as List: "+ Arrays.asList(arr));
        Arrays.sort(arr);
        for( int i = 0 ; i <arr.length ; i++){
            System.out.println("index: "+i+" || value: "+arr[i]);
        }
//        System.out.println("===============");
//        //for each
//        for(Integer x : arr){
//            System.out.println(x);
//        }

        //binary search
        int key=35;
        System.out.println("Binary search the key:"+ key +" at the index: "+ Arrays.binarySearch(arr,key));

        //jagged array
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the total rows of the array");
        int rows=scan.nextInt();
        int twoD_arr[][]= new int[rows][];

        //Initializing the 2d array
        for(int i =0 ; i <rows ; i++){
            System.out.println("Enter the # of cols of the "+(i+1)+"th row:");
            int col=scan.nextInt();
            twoD_arr[i]= new int[col];
        }
        //printing 2d array
        for(int i =0 ; i <rows; i++){
            for (int j = 0; j < twoD_arr[i].length; j++) {
                System.out.print(twoD_arr[i][j] + " ");
            }
            System.out.println();
        }
        scan.close();



    }
}
