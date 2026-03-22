import java.util.Scanner;

public class Task8 {
    static boolean allDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return allDigits(s, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (allDigits(s, 0)) System.out.println("Yes");
        else System.out.println("No");
    }
}
