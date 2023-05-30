package p_06;

import java.util.Arrays;

public class StudyBubbleSort {
    public static void main(String[] args) {
        int[] values={3,1,6,8,9,0,7,4,5,2};
        bubbleSort(values);
        System.out.println(Arrays.toString(values));
//        int[] a={10,9,8,7,6,5,4,3,2,1};
//        int length=a.length;
//        int temp;
//        System.out.println(Arrays.toString(a));
//        for(int j=0;j<length-1;j++) {
//            for (int i = 0; i < length - 1-j; i++) {
//                if (a[i] > a[i + 1]) {
//                    temp = a[i];
//                    a[i] = a[i + 1];
//                    a[i + 1] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(a));
    }

    public static void bubbleSort(int[] values){
        int temp;
        for(int i=0;i<values.length;i++){
            for(int j=0;j<values.length-1-i;j++){
                if(values[j]>values[j+1]){
                    temp=values[j];
                    values[j]=values[j+1];
                    values[j+1]=temp;
                }
            }
        }
    }
}

