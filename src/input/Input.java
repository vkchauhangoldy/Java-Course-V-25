package input;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;

        }
    }

//    void main(String[] args) throws Exception {
//        Scanner sc = new Scanner(new File("src/input/input.txt"));
//        int t = sc.nextInt();
//        IO.println("t :- " + t);
//
//        for (int test = 0; test < t; test++) {
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for (int i = 0; i < n; i++) {
//                arr[i] = sc.nextInt();
//            }
//            IO.println("Array : " + test + " : " + Arrays.toString(arr));
//
//            bubbleSort(arr,n);
//
//            IO.println("Sorted Arrays are: " + test + " : " + Arrays.toString(arr));
//
//        }
//
//    }


    void binarySearch(int[] arr, int n, int target) {
        int low = 0;
        int high = n-1;
        int ans = -1;
        while (low <= high) {
            int mid = low+ (high  - low)/2;
            if(arr[mid]==target){
               ans =   mid;
               break;
            } else if (arr[mid]<target) {
                low=mid+1;
            }else{
               high =  mid-1;
            }
        }
        IO.println("Index : "+ ans);
    }

    void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("src/input/input.txt"));

        int n = sc.nextInt();

        IO.println("N : " + n);
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        IO.println("Array is: " + Arrays.toString(arr));

        int target = sc.nextInt();
        IO.println("Target index is: " + target);

        binarySearch(arr, n, target);

        sc.close();

    }
}
