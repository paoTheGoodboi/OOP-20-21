package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Cvicenie2 {
    public static void main(String[] args){
        int x = 5;
        int[] y = new int[] {1,2,3};

        System.out.println(x);
        pokusRAW(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        pokusArray1(y);
        System.out.println(Arrays.toString(y));
        pokusArray2(y);
        System.out.println(Arrays.toString(y));

    }

    public static void pokusRAW(int cislo){
        cislo = 7;
        System.out.println(cislo);
    }

    public static void pokusArray1(int[] array){
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }

    public static void pokusArray2(int[] array){
        array = new int[]{4,5,6};
        System.out.println(Arrays.toString(array));
    }
}
