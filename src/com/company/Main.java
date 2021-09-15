package com.company;

public class Main {

    public static void main(String[] args) {
	    // Procedures

        // - EXAMPLES -

        //Ex. 2

        System.out.println(distance (-6, -4));

    }
    static int abs (int x) {
        if (x >= 0)
            return x;
        return (-x); //absolute value method (abs)
    }
    static int distance (int a, int b) {
        return abs (a - b);
    } // distance in abs
}
