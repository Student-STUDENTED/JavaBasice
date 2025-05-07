package ArraysProgramming;

public class ArrayIntro {
    public static void main(String[] args) {

        int a  = 10; // this variable.

        // we can store multiple values in single variable.

        // syntax creation.

        //First Syntax
        //datatype[] arrayName = new datatype[size];
        int[] array = new int[10];
        array[0] = 30;
        array[1] = 60;
        array[2] = 10;
        array[3] = 20;
        array[4] = 30;
        array[5] = 40;
        array[6] = 30;
        array[7] = 20;
        array[8] = 10;
        array[9] = 20;
        System.out.println(array.length); // 10

        // Second Syntax
        //datatype[] arrayName = {value specifiy};
        int[] array1 = {20, 40, 30, 20, 10, 30, 10 ,40, 60, 50};
        System.out.println("size is array1`is " + array1.length); //10   // starting index = 0  // last = 9

        System.out.println("Element present at 0 index is : " +array1[3]); // 10

        String[] names = {"java","Program", "Develpment"};

        // Array is indexed base data structure.

        //Type casting
        // 1.widening
        // 2.Narrowing

        int s = 33;
        long b = s;     // widening

        double d = 3.2;
        int i =(int) d;   // Narrowing

        // pass by value  -> java is always pass by value.
        // pass by reference -> not reference.














         }
}
