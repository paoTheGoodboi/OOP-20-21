package sk.stuba.fei.uim.oop;

import java.util.Arrays;

public class Cvicenie2 {
    public static void main(String[] args){
        int x = 5;
        int[] y = new int[] {1,2,3};
        FakeStruktura z = new FakeStruktura();

        System.out.println(x);
        pokusRAW(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        pokusArray1(y);
        System.out.println(Arrays.toString(y));
        pokusArray2(y);
        System.out.println(Arrays.toString(y));

        System.out.println(z.x);
        z.x = 7;
        System.out.println(z.x);
        pokusObjekt(z);
        System.out.println(z.x);

        FakeStruktura bod = bod();
        System.out.println(bod.x + " " + bod.y);
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

    public  static void pokusObjekt(FakeStruktura struktura){
        struktura.x = 10;
        System.out.println(struktura.x);
    }

    public  static FakeStruktura bod(){
        FakeStruktura f = new FakeStruktura();
        f.y = 10;
        f.x = 10;
        return f;
    }
}
