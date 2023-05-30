package p_06;

import java.util.Arrays;

public class StudyBubbleSortOptimal {
    public static void main(String[] args) {
        int[] a={10,9,8,7,6,5,4,3,2,1};
        int tmp;
        boolean flag=false;
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-i-1;j++){
                flag=false;
                if(a[j]>a[j+1]){
                    tmp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=tmp;
                    flag=true;
                }
            }
            if(flag==false)
                break;
        }
        System.out.println(Arrays.toString(a));
    }
}
