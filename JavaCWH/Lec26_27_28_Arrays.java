package JavaCWH;

public class Lec26_27_28_Arrays {
    public static void main(String[] args) {
    //  Method 1 to print array - Declaration then Memory Allocation
        int [] marks ;
        marks = new int[5];
        marks[0] = 100;
        marks[1] = 95;
        marks[2] = 90;
        marks[3] = 93;
        marks[4] = 97;
        marks[4] = 99;  // 97 se change ho kar 99 ho jayega
    //  marks[5] = 91;    throws an error
        System.out.println(marks[4]);

    //  Method 2 to print array - Declaration + Memory Allocation
        int [] marks1 = new int[5];
        marks1[0] = 100;
        marks1[1] = 95;
        marks1[2] = 90;
        marks1[3] = 93;
        marks1[4] = 97;
        System.out.println(marks1[3]);

    // Method 3 to print array - Declaration + Initialization
        int[] marks2 = {81,82,83,84,85};
        System.out.println(marks2[1]);

        String[] student = {"Himank","Lakshya","Jiyu"};
        System.out.println(student[2]);

    //  Length of an array -
        System.out.println(marks.length);
        System.out.println(student.length);

    //  Displaying an array -
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        for(int j = marks.length-1; j>=0; j--){
            System.out.println(marks[j]);
        }

    //  Displaying an array in for-each loop -
        for (int element : marks1) {
            System.out.println(element);
        }

    //  Multidimensional Array
        // 2-D Array -
        int[][] flats = new int[5][10];
        // five floors(ground+4) and 10 flats on each floor
        flats[0][0]=001;
        flats[0][1]=002;
        flats[2][5]=106;
        flats[2][8]=109;
        flats[2][9]=110;
        System.out.println(flats[0][1]);

        for(int a = 0; a<flats.length; a++){
            for(int b = 0; b< flats[a].length; b++){
                System.out.println(flats[a][b]);
            }
        }

        // 4-D Array -
        int [][][][] element = new int[5][4][9][6];
        element[3][2][5][1] = 100;
        System.out.println(element[3][2][5][1]);
    }
}
