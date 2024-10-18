package Coding;

public class Problem_01 {
    // For-loop
    public static int sumForLoop(int[] numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }

    // While-loop
    public static int sumWhileLoop(int[] numbers) {
        int total = 0;
        int i = 0;
        while (i < numbers.length) {
            total += numbers[i];
            i++;
        }
        return total;
    }

    // Recursion
    public static int sumRecursive(int[] numbers, int index) {
        if (index == numbers.length) {
            return 0;
        }
        return numbers[index] + sumRecursive(numbers, index + 1);
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        System.out.println("Sum using for-loop: " + sumForLoop(numbers));
        System.out.println("Sum using while-loop: " + sumWhileLoop(numbers));
        System.out.println("Sum using recursion: " + sumRecursive(numbers, 0));
    }
}
