package p_06;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
//        TestBinarySearch c=new TestBinarySearch();
//        c.test();

        int[] arr={1,3,5,7,9,2,4,8,6,10,666};
        int[] brr;
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int i=0,j=arr.length,temp;
        int q=0;
        int x;
        System.out.println("请输入你要查找的数字：");
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        System.out.println(q);
        while(i<=j&&i<arr.length){
            q=(i+j)/2;
            temp=arr[q];
            if(x==temp){
                System.out.println("你要查找的数字下标是："+temp);
                break;
            }
            if(x<temp){
                j=q-1;
            }
            if(x>temp){
                i=q+1;
            }
            }
        if(i>j){
            System.out.println("没找到");
        }
        if(i>= arr.length){
            System.out.println("超过上限，没找到");
        }
    }
}

class TestBinarySearch{
    public void test(){
        int[] arr={1,3,5,7,9,2,4,8,6,10,666};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("请输入你要查找的数字：");
        int x;
        Scanner scanner=new Scanner(System.in);
        x=scanner.nextInt();
        int index;
        index=binarySearch(arr,x);
        System.out.println("要查找的数字下标为："+index);

    }
    public static int binarySearch(int[] array,int value){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int middle=(low+high)/2;
            if(value==array[middle]){
                return middle;
            }
            if(value>array[middle]){
                low=middle+1;
            }
            if(value<array[middle]){
                high=middle-1;
            }
        }
        return -1;
    }
}