import java.util.Scanner;

public class Task2 {
    static int sumArray(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt(); // ввод

        double avg = (double) sumArray(arr, n) / n;
        System.out.println(avg);
    }
}
