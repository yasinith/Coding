package Coding;

import java.util.ArrayList;
import java.util.List;

public class Problem_05 {
    private static final String DIGITS = "123456789";
    private static final int TARGET = 100;

    public static List<String> generateExpressions() {
        List<String> results = new ArrayList<>();
        backtrack(0, "", 0, 0, results);
        return results;
    }

    private static void backtrack(int index, String currentExpr, long currentValue, long lastNum, List<String> results) {
        if (index == DIGITS.length()) {
            if (currentValue == TARGET) {
                results.add(currentExpr);
            }
            return;
        }

        for (int i = index; i < DIGITS.length(); i++) {
            long currNum = Long.parseLong(DIGITS.substring(index, i + 1));
            String strNum = DIGITS.substring(index, i + 1);

            if (index == 0) {
                backtrack(i + 1, strNum, currNum, currNum, results);
            } else {
                // Add '+'
                backtrack(i + 1, currentExpr + "+" + strNum, currentValue + currNum, currNum, results);

                // Add '-'
                backtrack(i + 1, currentExpr + "-" + strNum, currentValue - currNum, -currNum, results);

                // Add nothing (concatenate)
                long newLastNum = lastNum * 10 + (lastNum > 0 ? currNum : -currNum);
                long newValue = currentValue - lastNum + newLastNum;
                backtrack(i + 1, currentExpr + strNum, newValue, newLastNum, results);
            }
        }
    }

    public static void main(String[] args) {
        List<String> expressions = generateExpressions();
        System.out.println("Found " + expressions.size() + " expressions that sum to 100:");
        for (String expr : expressions) {
            System.out.println(expr + " = 100");
        }
    }
}
