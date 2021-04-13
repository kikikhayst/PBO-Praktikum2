package modul2;

public class praktikumJava7 {

    public static void main(String[] args) {
        int a = 5, b = 7;

        System.out.println("=== Operasi Logika ===");
        if ((a < 2) && (b++ < 10)) {
            b += 2;
        }
        System.out.println(b);

        System.out.println("=== Operasi Logika OR ===");
        if ((a > 2) || (b++ < 10)) {
            b += 2;
        }
        System.out.println(b);
    }
}
