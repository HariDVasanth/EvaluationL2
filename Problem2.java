//package evaluation;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Problem2 {
//    public static void main(String[] args) {
//        HashMap<Integer,Integer>hashMap = new HashMap<>();
//        int[]arr={4,1,2,3,1,2,5,2};
//
//        for(int i=0;i< arr.length;i++){
//            if(hashMap.containsKey(arr[i])){
//                int value = hashMap.get(arr[i]);
//                hashMap.put(arr[i],value+1);
//            }else {
//                hashMap.put(arr[i],1);
//            }
//        }
//
//        System.out.println(hashMap);
//        int ind=0;
//        int ind2=0;
//        int[]arr1=new int[arr.length];
//
//        for(Map.Entry<Integer,Integer>entry:hashMap.entrySet()){
//            int value = entry.getValue();
//            ind2+=value;
//            arr1[ind++]=value;
//        }
//        int[] finArray = new int[ind2];
//        int finIndex=0;
//        Arrays.sort(arr1);
//
//        for(int i:arr1){
//            if(hashMap.containsValue(i)){
//                int key= hashMap.get(i);
//
//                for(int i1=0;i1<i;i1++){
//                    finArray[finIndex++]=key;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(finArray));
//
//    }
//}



package evaluation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] arr = {4, 1, 2, 3, 1, 2, 5, 2};

       for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                int value = hashMap.get(arr[i]);
                hashMap.put(arr[i], value + 1);
            } else {
                hashMap.put(arr[i], 1);
            }
        }
    int[] frequencies = new int[hashMap.size()];
        int index = 0;
        for (int value : hashMap.values()) {
            frequencies[index++] = value;
        }
        Arrays.sort(frequencies);
        reverseArray(frequencies);

        int[] finArray = new int[arr.length];
        int finIndex = 0;
        for (int freq : frequencies) {
            for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
                if (entry.getValue() == freq) {
                    for (int i = 0; i < freq; i++) {
                        if(finIndex < finArray.length) {
                            finArray[finIndex++] = entry.getKey();
                        }
                    }
                }
            }
        }

        System.out.println(Arrays.toString(finArray));
    }


    private static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
