package JavaCWH;

import java.util.ArrayList;
// import java.util.Scanner;

class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    MyGeneric(int val, T1 t1, T2 t2){
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }

    public void setVal(int val){
        this.val = val;
    }

    public int getVal(){
        return val;
    }

    public void setT1(T1 t1){
        this.t1 = t1;
    }

    public T1 getT1(){
        return t1;
    }

    public void setT2(T2 t2){
        this.t2 = t2;
    }

    public T2 getT2(){
        return t2;
    }
}

public class Lec110_JavaGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
//      ArrayList<int> ar = new ArrayList();   // --> this will produce an error
//      ar.add("str1");
        ar.add(54);
        ar.add(643);
//      ar.add(new Scanner(System.in));

        // int a = (int) ar.get(0);
        int a = ar.get(0);
        System.out.println(a);

        MyGeneric<String, Integer> mg = new MyGeneric<>(10, "Hello ", 50);
        String s = mg.getT1();
        Integer i = mg.getT2();
        System.out.println(s + i);
    }
}