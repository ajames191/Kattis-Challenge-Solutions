import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i:solve(scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt(),scan.nextInt())) {
            System.out.print(i + " ");
        }
    }

    public static int[] solve(int king, int queen, int rooks, int bishops, int knights, int pawns) {
        int[] ans = new int[6];

        ans[0] = 1 - king ;
        ans[1] = 1 - queen;
        ans[2] = 2 - rooks;
        ans[3] = 2 - bishops;
        ans[4] = 2 - knights;
        ans[5] = 8 - pawns;

        return ans;
    }
}
