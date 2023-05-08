package JavaCWH;
import java.util.Scanner;

public class Lec29_PracticeSet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problem - 1
        float[] a = new float[5];
        System.out.print("Enter first number:- ");
        a[0] = sc.nextFloat();
        System.out.print("Enter second number:- ");
        a[1] = sc.nextFloat();
        System.out.print("Enter third number:- ");
        a[2] = sc.nextFloat();
        System.out.print("Enter fourth number:- ");
        a[3] = sc.nextFloat();
        System.out.print("Enter fifth number:- ");
        a[4] = sc.nextFloat();
        int b = 0;
        for(float element: a){
            b += element;
        }
        System.out.println(b);


        //Problem - 2
        int[] c = {40,50,60,70,80};
        System.out.print("Enter the number:- ");
        int d = sc.nextInt();
        boolean f = false;
        for(int e : c){
            if(e==d){
                f = true;
                break;
            }
        }
        if(f){
            System.out.println("Yes,The given element is in array.");
        }
        else {
            System.out.println("No,The given element is not in array.");
        }


        //  Problem - 3
        System.out.println("Enter marks of all students in physics: ");
        int[] g = new int[5];
        g[0] = sc.nextInt();
        g[1]  = sc.nextInt();
        g[2]  = sc.nextInt();
        g[3]  = sc.nextInt();
        g[4]  = sc.nextInt();
        int sum = 0;
        for(int element: g){
            sum += element;
        }
        System.out.println("The average marks is: "+ sum/ g.length);


        // Problem - 4
        int[][] h = {{1, 2, 3},
                      {4, 5, 6}};
        int[][] i = {{4, 5, 6},
                     {1, 2, 3}};
        int[][] result = {{0, 0, 0},
                          {0, 0, 0}};
        for (int j = 0; j < h.length; j++) {
            for (int k = 0; k < h[j].length; k++) {
                System.out.printf("Setting value for j=%d and k=%d\n", j, k);
            }
        }
        for (int j = 0; j < h.length; j++) {
            for (int k = 0; k < h[j].length; k++) {
                result[j][k]= h[j][k]+i[j][k];
                System.out.print(result[j][k]+" ");
            }
            System.out.println("");
        }


        // Problem - 5
        int[] l= {5,6,7,8,9};
        for(int m=l.length-1; m>=0; m--){
            System.out.print(l[m]+" ");
        }
        System.out.println("");

        // Code with harry solution
        int [] arr = {1, 21, 3, 4, 5, 34, 67};
        int n1 = arr.length;
        int n = Math.floorDiv(n1, 2);
        int temp;
        for(int p=0; p<n; p++){
            // Swap a[p] and a[l-1-p]
            // a   b   temp
            // |4| |3| ||
            temp = arr[p];
            arr[p] = arr[n1-p-1];
            arr[n1-p-1] = temp;
        }
        for(int element: arr){
            System.out.print(element + " ");
        }
        System.out.println(""); // for next question


        //General knowledge
        //The max and min value 'int' can hold is-
        System.out.println(Integer.MAX_VALUE);  // =  2147483647
        System.out.println(Integer.MIN_VALUE);  // = -2147483647


        // Problem - 6
        int[] q = {54,65,24,33,98,845,566,55};
        int max = Integer.MIN_VALUE;
        for(int r:q){
            if(r>=max){
                max = r;
            }
        }
        System.out.println("The maximum number in the array is: "+max);


        // Problem - 7
        int[] s = {5,68,45,335,98,124,7};
        boolean sorted = true;
        for(int t=0; t<s.length-1; t++){
            if(s[t]>s[t+1]){
                sorted = false;
                break;
            }
        }
        if (!sorted) {
            System.out.println("The array is not sorted.");
        } else {
            System.out.println("The array is sorted.");
        }


        int[] v = {5,26,45,335,987,1724,2000};
        boolean sorted1 = true;
        for(int u=0; u<s.length-1; u++) {
            if (v[u] > v[u + 1]) {
                sorted1 = false;
                break;
            }
        }
        if (!sorted1) {
            System.out.println("The array is not sorted.");
        } else {
            System.out.println("The array is sorted.");
        }
    }
}
