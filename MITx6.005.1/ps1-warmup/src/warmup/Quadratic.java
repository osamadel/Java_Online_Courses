package warmup;

import java.util.HashSet;
import java.util.Set;

public class Quadratic {

    /**
     * Find the integer roots of a quadratic equation, ax^2 + bx + c = 0.
     * @param a coefficient of x^2
     * @param b coefficient of x
     * @param c constant term.  Requires that a, b, and c are not ALL zero.
     * @return all integers x such that ax^2 + bx + c = 0.
     */
    public static Set<Integer> roots(int a, int b, int c) {
        assert ((b*b) - (4*a*c)) >= 0;   // Check for complex numbers.
        Set<Integer> solutions = new HashSet<Integer>();
        int x1 = (int)(-b + Math.sqrt((b*b)-(4*a*(long)c))) / (2*a);
        int x2 = (int)(-b - Math.sqrt((b*b)-(4*a*(long)c))) / (2*a);
        // Check if the integer part of x1 solves the equation.
        if (a * x1 * x1 + b * x1 + c == 0)
            solutions.add(x1);
        // Check if the integer part of x2 solves the equation.
        if (a * x2 * x2 + b * x2 + c == 0)
            solutions.add(x2);
        return solutions;
    }

    
    /**
     * Main function of program.
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        int r1 =  45_000; // a root ~45,000 means c is ~2,000,000,000, which is close to the maximum integer 2^31 - 1
        int r2 = -45_000;
        System.out.println("For the equation x^2 - 4x + 3 = 0, the possible solutions are:");
        Set<Integer> result = roots(1, -r1-r2, r1*r2);
        System.out.println(result);
    }

    /* Copyright (c) 2016 MIT 6.005 course staff, all rights reserved.
     * Redistribution of original or derived work requires explicit permission.
     * Don't post any of this code on the web or to a public Github repository.
     */
}
