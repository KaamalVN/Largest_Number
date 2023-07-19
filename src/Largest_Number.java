import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println(largest(array));
    }

    static int largest(int[] array) {
        String[] nums = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            nums[i] = String.valueOf(array[i]);
        }
        Comparator<String> comparator = (a, b) -> (b + a).compareTo(a + b);
        Arrays.sort(nums, comparator);
        if (nums[0].equals("0")) {
            return 0;
        }
        StringBuilder sb = new StringBuilder();
        for (String num : nums) {
            sb.append(num);
        }
        return Integer.valueOf(String.valueOf(sb));

    }
}
