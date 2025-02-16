package Leetcode.ArrayString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids {

    // 1431. Kids With the Greatest Number of Candies - Easy

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();
        int maxCandy = 0;

        for(int candy : candies) {
            // Find the current maximum number of candies among all kids
            maxCandy = Math.max(maxCandy, candy);
        }

        // For each kid, check if giving them extraCandies makes their total >= maxCandy
        for (int candy : candies) {
            if ( candy + extraCandies >= maxCandy)
                result.add(true);
            else
                result.add(false);
        }
        return result;
    }


    // Main method to validate the solution
    public static void main (String[] args) {

        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;

        // Create an instance of the Solution class to call the method
        Kids kids = new Kids();
        List<Boolean> result = kids.kidsWithCandies(candies, extraCandies) ;

        // Print input and output
        System.out.println("Input Candies: " + Arrays.toString(candies));
        System.out.println("Extra Candies: " + extraCandies);
        System.out.println("Output: " + result);
    }
}
