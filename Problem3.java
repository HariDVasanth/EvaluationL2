package evaluation;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] arr2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};

        int max = Math.max(arr.length, arr2.length);
        int min = Math.min(arr.length, arr2.length);

        int[] maxArray;
        int[] minArray;

        if (arr.length == max) {
            maxArray = Arrays.copyOf(arr, max);
            minArray = Arrays.copyOf(arr2, min);
        } else {
            maxArray = Arrays.copyOf(arr2, max);
            minArray = Arrays.copyOf(arr, min);
        }

        int[] maxFin = new int[max + 1];
        int carry = 0;

        int i = max - 1;
        int j = min - 1;
        int k = max;

        while (j >= 0) {
            int sum = maxArray[i] + minArray[j] + carry;
            maxFin[k] = sum % 10;
            carry = sum / 10;

            i--;
            j--;
            k--;
        }

        while (i >= 0) {
            int sum = maxArray[i] + carry;
            maxFin[k] = sum % 10;
            carry = sum / 10;

            i--;
            k--;
        }

        if (carry > 0) {
            maxFin[k] = carry;
        }

        for (int num : maxFin) {
            System.out.print(num);
        }
    }
}
//    package evaluation;
//
//import java.util.Arrays;
//
//    public class Problem3 {
//        public static void main(String[] args) {
//            int[]arr={9,2,8,1,3,5,6,7,3,1,1,6};
//            int[]arr2={7,8,4,6,2,1,9,9,7};
//
//            int max = Math.max(arr.length,arr2.length);
//            int min = Math.min(arr.length,arr2.length);
//            int[]maxArray;
//            int[]minArray;
//            if(arr.length==max){
//                maxArray = Arrays.copyOf(arr,max);
//                minArray = Arrays.copyOf(arr2,min);
//            if(arr2.length==min){
//                minArray = Arrays.copyOf(arr,min);
//                maxArray = Arrays.copyOf(arr2,max);
//            }
//            int[]maxFin= new int[max];
//            int temp=max-1;
//            int temp2=min-1;
//            int max1=max-1;
//            for(int j=min-1;j>=0;j--){
//                int num = maxArray[temp--]+minArray[temp2--];
//                if(num>10){
//                    int val = num - 10;
//                    maxArray[j-1]+=1;
//                    maxFin[max1]=val;
//                }else {
//                    maxFin[max1--]=num;
//                }
//            }
//            for(int i:maxFin){
//                System.out.print(i);
//            }
//        }
//    }
//
//}

