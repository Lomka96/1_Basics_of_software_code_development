package linearprograms;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(area(-3, 1));
        System.out.println(area(4, 1));
        System.out.println(area(0, 0));
    }

    public static boolean area(int x, int y) {
        return y <= 0 && y >= -3 && x >= -4 && x <= 4 || y > 0 && y <= 4 && x >= -2 && x <= 2;
    }
}
