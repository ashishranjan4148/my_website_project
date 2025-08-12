import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s);
        }

        sc.close();
    }
}

