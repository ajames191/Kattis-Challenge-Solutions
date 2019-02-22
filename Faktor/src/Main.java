import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(solve(scan.nextInt(),scan.nextInt()));
    }

    public static int solve(int numArticles, int requiredImpactFactor) {

        double value = requiredImpactFactor - 1 + 0.01;
        return (int) roundUp(value * numArticles);

    }

    private static double roundUp(double v) {
        return Math.ceil(v);
    }
}

// For those reading my GitHub profile, I hated this challenge :D | D:

