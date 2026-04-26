import java.util.*;
public class Functions {

    public static void reverse(int[] arr) {
        int n = arr.length;
        int[] rev_arr = new int[n];

        for (int i = 0; i < n; i++) {
            rev_arr[i] = arr[n-1-i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = rev_arr[i];
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr);
    }
}
