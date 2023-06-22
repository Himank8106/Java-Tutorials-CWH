package JavaCWH;

import java.util.Scanner;

public class Lec82_NestedTryCatchBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];
        num[0]=10;
        num[1]=20;
        num[2]=30;

        boolean b = true;
        while(b){
            System.out.println("Enter the value of index.");
            int i = sc.nextInt();
            try{
                System.out.println("Hii");
                try{
                    System.out.println("Level 2");
                    System.out.println(num[i]);
                    b = false;
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Catch in Level 2. Reason -  "+e);
                }
            }
            catch(Exception e){
                System.out.println("Exception in level 1. Reason - "+e);
            }
        }
        sc.close();
    }
}

    /*
    * try{
    *     try{
    *         try{
    *              }
    *         catch{
    *               }
    *         }
    *     catch{
    *           }
    *     }
    * catch{
    *       }
    */
