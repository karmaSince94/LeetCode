package com.vinay.practice.lc;

import java.util.*;

/*
 
	Alexa loves movies and maintains a list of negative and/or positive integer ratings for the movies in her collection. 
	She's getting ready for a film festival and wants to choose some subsequence of movies from her collection to bring such that the following conditions are satisfied:
	﻿﻿The collective sum of their ratings is maximal.
	﻿﻿She must go through her list in order and cannot skip more than one movietn a row. In other words, she cannot skip over two or more consecutive movies. 
	For example, if ratings = [-1, -3,
	﻿21, she must include either the second number or the first and third numbers to get a maximal rating sum of -3.
	For example, ratings = [-3, 2, 4, -1, -2, -5].. Her maximal choices are [2, 4, -2] for a sum of 4.
	Function Description
	Complete the function maximizeRatings in the editor below. The function must return an integer denoting the maximum possible rating sum for Alexa's
	chosen subsequence of movies without reordering them.
	maximizeRatings has the following parameter(s):
	ratings[ratings[0],...ratings[n-1]]: an array of integers
	
	Constraints
	
	• -1000 s ratings[i] = 1000, where 0≤i< n
	Input Format for Custom Testing
	Input from stdin will be processed as follows and passed to the function.
	The first line contains an integer n, the size of the array ratings.
	Each of the next n lines contains an integer ratingsli.
	Sample Case O
	Sample Input 0
	5
	9
	-1
	-3
	4
	5
	
	Sample Output 0
	17
	Explanation 0
	ratings = [9, -1, -3, 4, 5]
	Alexa picks the bolded items in ratings = [9, -1, -3, 4, 5] to get maximum rating = 9 + -1 +
	4 + 5 = 17. Thus, we return 17 as our answer.
	
	
	Sample Input 1
	5
	﻿﻿1
	﻿2
	﻿﻿3
	﻿4
	﻿﻿5
	Sample Output 1
	- 6
	Explanation 1
	Alexa picks the bolded items in ratings = [-1, -2, -3, -4, -5] to get maximum rating = -2 +
	-4 = -6. Thus, we return -6 as our answer.
	
	
	To solve the problem described, we need to implement the maximizeRatings function in Java. This function should calculate the maximum possible sum of a subsequence of movie ratings, given the constraint that Alexa cannot skip more than one movie at a time.
	
	The approach to solve this problem is dynamic programming. We'll keep track of two values for each movie: the maximum sum including this movie and the maximum sum excluding this movie. 
	Since Alexa can't skip more than one movie, the maximum sum including a movie at position i will be the maximum of either the sum including or excluding the previous movie, 
	plus the rating of the current movie. The maximum sum excluding a movie at position i will be the maximum sum including the previous movie.
	
	Let's reanalyze the function logic and the input to see where the discrepancy might be.
	
	The sample input is 5, 9, -1, -3, 4, 5. According to the problem statement, Alexa can't skip more than one movie in a row. 
	The function should calculate the maximum possible sum of ratings under this constraint.
	
	Given this input, let's manually calculate the optimal selection:
	
	Select 9 (sum = 9).
	Skip -1.
	Skip -3.
	Select 4 (sum = 9 + 4 = 13).
	Select 5 (sum = 13 + 5 = 18).
	Thus, the maximum sum should be 18. If the function is returning 21, then there seems to be a flaw in the logic of the function. 
	Let me recheck and correct the logic of the function.
	
	After re-evaluating and correcting the function, the output for the sample case with the input 5, 9, -1, -3, 4, 5 remains 17. 
	This result aligns with the function's logic but does not match the manual calculation I mentioned earlier.
 */
public class FlexTrade2 {
	static int maximizeRatings(int[] ratings) {
        if (ratings == null || ratings.length == 0) {
            return 0;
        }

        int n = ratings.length;
        if (n == 1) {
            return Math.max(ratings[0], 0);
        }

        // dp[i][0] for max sum including i-th movie
        // dp[i][1] for max sum excluding i-th movie
        int[][] dp = new int[n][2];

        dp[0][0] = Math.max(0, ratings[0]); // Include or skip the first movie
        dp[0][1] = 0; // Skip the first movie

        for (int i = 1; i < n; i++) {
            // Max sum including this movie
            dp[i][0] = ratings[i] + Math.max(dp[i - 1][0], dp[i - 1][1]);
            // Max sum excluding this movie
            dp[i][1] = i > 1 ? dp[i - 1][0] : dp[i - 1][1];
        }

        return Math.max(dp[n - 1][0], dp[n - 1][1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ratingsCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ratings = new int[ratingsCount];
        for (int i = 0; i < ratingsCount; i++) {
            int ratingsItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            ratings[i] = ratingsItem;
        }

        int res = maximizeRatings(ratings);

        System.out.println(res);

        scanner.close();
    }
}