package p_08;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StudyException02 {
    public static void main(String[] args) {
        Animal a=new Dog();
//        Cat c=(Cat)a;
        if(a instanceof Cat){
            Cat c=(Cat)a;
        }

        int[] arr=new int[5];
//        System.out.println(arr[5]);
        int b=5;
        if(b<arr.length){
            System.out.println(arr[b]);
        }

        String str="1234abcf";
//        System.out.println(Integer.parseInt(str));
        Pattern p=Pattern.compile("^\\d+$");
        Matcher m=p.matcher(str);
        if(m.matches()){
            System.out.println(Integer.parseInt(str));
        }
    }

}

class Animal{

}

class Dog extends Animal{

}

class Cat extends Animal{

}