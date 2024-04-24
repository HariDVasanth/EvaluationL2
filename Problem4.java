//package evaluation;
//
//import java.util.ArrayList;
//
//
//public class Problem4 {
//    public static void main(String[] args) {
//        int[]arr={3,-1,6,1,-5,1,3,-8};
//        int sum=0;
//        ArrayList<Integer>arrayList = new ArrayList<>();
//        for(int i=0;i< arr.length;i++){
//            int temp=0;
//            ArrayList<Integer>arrayList1 = new ArrayList<>();
//            for(int j=0;j< i+1;j++){
//                if(arr[j]<0){
//                    if(temp>sum){
//                        arrayList=arrayList1;
//                        temp=0;
//                        arrayList1.clear();
//                    }
//                    continue;
//                }
//                temp+=arr[i];
//                arrayList1.add(arr[j]);
//
//            }
//        }
//        System.out.println(arrayList);
//
//    }
//}
package evaluation;

import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {2,7,5,-1,-3,2,9,7};
        int maxSum = 0;
        ArrayList<Integer> subArray = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int tempSum = 0;
            ArrayList<Integer> temp = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < 0) {
                    break;
                }
                tempSum += arr[j];
                temp.add(arr[j]);

                if (tempSum > maxSum) {
                    maxSum = tempSum;
                    subArray.clear();
                    subArray.addAll(temp);
                }
            }
        }

        System.out.println(subArray);
    }
}
