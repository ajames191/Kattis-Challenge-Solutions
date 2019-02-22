import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int var1 = scan.nextInt();
        int var2 = scan.nextInt();

        System.out.println(solve(var1, var2));
    }

    public static int solve(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                return 1;
            }
            return 4;
        }
        else {
            if (y > 0) {
                return 2;
            }
            return 3;
        }
    }
}
