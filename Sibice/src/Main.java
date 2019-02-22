import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int count = scan.nextInt();

        int L = scan.nextInt();
        int W = scan.nextInt();
        for (int i = 0; i < count; i++) {
            int match = scan.nextInt();
            System.out.println(doesItFit(L, W, match));
        }
    }

    public static String doesItFit(int l, int w, int match) {
        if (match <= getDiaganol(l, w)) {
            return "DA";
        }

        return "NE";
    }

    private static double getDiaganol(int l, int w) {
        return Math.sqrt(Math.pow(l, 2.0) + Math.pow(w, 2.0));

    }
}

/*

its friday, friday, gotta get down on f
 */