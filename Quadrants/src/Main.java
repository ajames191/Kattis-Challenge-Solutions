import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var1 = scan.nextInt();
        int var2 = scan.nextInt();

        System.out.println(solve(var1, var2));
    }

    public static int solve(int x, int y) {
        if (x >= 0 && y >= 0) {
            return 1;
        }
        if ( x < 0 && y >= 0) {
            return 2;
        }
        if (x < 0 && y < 0) {
            return 3;
        }
        return 4;
    }
}
