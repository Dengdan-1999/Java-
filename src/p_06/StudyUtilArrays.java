package p_06;

import java.util.Arrays;

public class StudyUtilArrays {
    public static void main(String[] args) {
        int[] a={1,2};
        System.out.println(a);
        System.out.println(Arrays.toString(a));//打印数组元素的值


        // 数组排序
        int[] b={1,2,343,23,546,12,69};
        System.out.println(Arrays.toString(b));
        Arrays.sort(b);
        System.out.println(Arrays.toString(b));

        //实现二分查找法
        int[] c={1,12,2,6,136,36,59};
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        System.out.println("该元素的索引："+Arrays.binarySearch(c,12));

        //数组填充
        int[] d={1,12,2,6,136,36,59};
        System.out.println(Arrays.toString(d));
        Arrays.fill(d,2,4,100);//将2到4索引的元素替换为100
        System.out.println(Arrays.toString(d));
    }
}
