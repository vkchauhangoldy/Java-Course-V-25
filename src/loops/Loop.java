package loops;

import java.io.File;
import java.util.Scanner;

public class Loop {

      void bubbleSort(int[] arr,int n){

        for(int i =0;i<n-1;i++){
          boolean flag=false;
          for (int j =0;j<n-i-1;j++){
              if(arr[j] > arr[j+1]){
                  int temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                  flag=true;
              }
          }
          if(!flag)break;
        }
    }


      void main(String[] args) throws Exception {

        Scanner sc = new Scanner(new File("src/loops/input.txt"));

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr,n);

        for (int num : arr) {
            IO.println("number " + num);
        }
        sc.close();
    }
}
