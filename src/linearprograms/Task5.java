package linearprograms;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(getTime(3434));
        System.out.println(getTime(56));
        System.out.println(getTime(43470));
    }

    public static String getTime(int seconds) {
        int h = seconds / 3600;
        int m = (seconds - h * 3600) / 60;
        int s = seconds - h * 3600 - m * 60;
        return h + "ч " + m + "мин " + s + "сек";
    }
}
