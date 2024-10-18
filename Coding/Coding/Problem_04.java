package Coding;

import java.util.*;

public class Problem_04 {
    public static String largestNumber(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            return "0";
        }

        List<String> numStrings = new ArrayList<>();
        for (Integer num : nums) {
            numStrings.add(String.valueOf(num));
        }

        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1); // Reverse order for descending sort
            }
        };

        Collections.sort(numStrings, comparator);

        if (numStrings.get(0).equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();
        for (String numString : numStrings) {
            result.append(numString);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(50, 2, 1, 9);
        System.out.println("Input: " + nums1);
        System.out.println("Largest number: " + largestNumber(nums1));

    }
}
