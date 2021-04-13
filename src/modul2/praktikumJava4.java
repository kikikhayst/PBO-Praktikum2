package modul2;

public class praktikumJava4 {

    public static void main(String[] args) {
        int a = 11, b = 5, c = 4, d = 12, e = 13;

        System.out.println("a = " + (a += 2));
        System.out.println("b = " + (b -= 2));
        System.out.println("c = " + (c *= 2));
        System.out.println("d = " + (d /= 2));
        System.out.println("e = " + (e %= 2));
    }
}
