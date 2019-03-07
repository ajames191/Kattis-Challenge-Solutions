import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        outputSpells(chant(new Scanner(System.in).nextInt()));
    }

    private static void outputSpells(ArrayList<String> chant) {
        for (String s:chant) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> chant(int input) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i = 1; i <= input; i++) {
            arrayList.add(i + " Abracadabra");
        }
        return arrayList;
    }
}
