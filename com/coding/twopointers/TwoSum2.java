package com.coding.twopointers;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        if(numbers == null)
            return null;
        int left=0, right=numbers.length-1;
        while(left < right) {
            if(numbers[left] + numbers[right] == target)
                return new int[]{left+1, right+1};
            if(numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        return null;
    }
}
