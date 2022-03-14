package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	/*

	 Two Sum

     Given an array of integers nums and an integer target, return indices of the two numbers
     such that they add up to target.
     You may assume that each input would have exactly one solution, and you may not use the
     same element twice.
     You can return the answer in any order.

     Example 1:
     Input: nums = [2,7,11,15], target = 9
     Output: [0,1]
     Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

     Example 2:
     Input: nums = [3,2,4], target = 6
     Output: [1,2]
     Example 3:
     Input: nums = [3,3], target = 6
     Output: [0,1]

     Example 4:
     Input: nums = [9,7,5,8],target = 14
     Output: [0,2]

	 */

        int[] arr = {4,9,2,6,3};
        int[] ans = Twosum(arr,7);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] Twosum(int[] nums, int target){
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        // if the condition is not found then return {-1,-1}
        return new int[]{-1,-1};
    }
}
