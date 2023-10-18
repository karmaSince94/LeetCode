package com.vinay.practice.lc;


/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

// https://leetcode.com/problems/guess-number-higher-or-lower/submissions/

/* 
class GuessNumber {
    public int guessNumber(int n) {
        
        //O(n) starts
        for(int i=0; i<n; i++){
            if(guess(i) == 0){
                return i;
            }
        }
        return n;
        //  O(n) ends
        

        int start = 0;
        int end = n-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(guess(mid) == -1){
                end = mid - 1;
            } else if(guess(mid) == 1) {
                start = mid+1;
            } else{
                return mid;
            }
        }
        return n;

    }
}

*/

