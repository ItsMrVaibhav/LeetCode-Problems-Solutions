class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        numsDictionary = {} # Dictionary to store the numbers and to access them faster
        
        for i, value in enumerate(nums):
            if (target - value) in numsDictionary.keys(): 
                return [i, numsDictionary[target - value]] # Return the required indices if they exist
            else:
                numsDictionary[value] = i # Otherwise, append the number as a key and its index as its value to the dictionary
