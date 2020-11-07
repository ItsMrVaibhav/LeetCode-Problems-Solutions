import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> numsMap = new HashMap <Integer, Integer> (); // Creating a HashMap in order to store and access values faster
        
        for (int i = 0 ; i < nums.length ; i++) {
            if (numsMap.containsKey(target - nums[i]) && numsMap.get(target - nums[i]) != i) { // Checking if the difference exists inside the HashMap and if it's not current number's index
                return new int [] {i, numsMap.get(target - nums[i])};
            } else {
                numsMap.put(nums[i], i); // Adding the number as a key and its index as its value to the HashMap
            }
        }
        
        return null;
    }
}
