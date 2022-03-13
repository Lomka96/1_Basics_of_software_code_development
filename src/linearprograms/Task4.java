package linearprograms;

public class Task4 {

    public static void main(String[] args) {
        System.out.println(turnOverNumber(756.811));
        System.out.println(turnOverNumber(334.014));
        System.out.println(turnOverNumber(999.888));
    }

    public static double turnOverNumber(double R) {
        double a = (int) R / 1000d;
        double b = (int) ((R - (int) R) * 1000);
        return b + a;
    }
}
