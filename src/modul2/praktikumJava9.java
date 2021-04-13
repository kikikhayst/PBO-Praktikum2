package modul2;

public class praktikumJava9 {

    public static void main(String[] args) {
        int v = 8, w = ~v, x = 5, y = 6, z = 7;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("x & y = " + (x & y));
        System.out.println("x | y = " + (x | y));
        System.out.println("x ^ y = " + (x ^ y));
        System.out.println("v = " + v);
        System.out.println("w = " + w);
        System.out.println("z >> 2 = " + (z >> 2));
        System.out.println("z << 1 = " + (z << 1));
        System.out.println("z >>> 1 = " + (z >>> 1));
    }
}
