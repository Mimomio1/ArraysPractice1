package com.practice.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysPractice {
	public static void main(String[] args)
	{
		int[] newArray = {2,5,7,10};
		int [] resultArray = twoSum(newArray, 2);
		System.out.println(Arrays.toString(resultArray));
	}
	
	public static int[] twoSum(int[] nums, int target) {

		int size = nums.length;

		// initialize hashmap to store the complement. It will store the complement and its index as key value pair
		Map<Integer, Integer> complementMap = new HashMap<>();
		
		// iterates from start to end
		for(int i = 0; i < size; i++)
		{
			int result = target - nums[i];
			// if it contains the element
			if(complementMap.containsKey(result))
			{
				return new int[] {i, complementMap.get(result)};
			}
			complementMap.put(nums[i], i);
		}		
		return new int[0];
	}
}
