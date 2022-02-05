package com.shoaib.bazlur.chap6;

public class BracketBalancedCheckerDemo {
    public static void main(String[] args) {
        String[] brackets = {
                "()",
                "()))",
                "((()",
                "((()))",
                "((())))"
        };

        BracketBalancedChecker checker = new BracketBalancedChecker();

        for (String bracket : brackets) {
            if (checker.isBalanced(bracket)) {
                System.out.println(bracket + " is balanced");
            } else {
                System.out.println(bracket + " is not balanced");
            }
        }
    }
}
