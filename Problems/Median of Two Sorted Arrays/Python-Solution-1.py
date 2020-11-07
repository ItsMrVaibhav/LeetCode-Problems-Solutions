class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        
        length = len(nums1) + len(nums2)
        firstIndex, secondIndex, newArray = 0, 0, []
        
        while firstIndex < len(nums1) and secondIndex < len(nums2):
            if nums1[firstIndex] <= nums2[secondIndex]:
                newArray.append(nums1[firstIndex])
                firstIndex += 1
            else:
                newArray.append(nums2[secondIndex])
                secondIndex += 1
                
        if (firstIndex < len(nums1) and secondIndex == len(nums2)):
            for value in nums1[firstIndex : ]:
                newArray.append(value)
                
        if (secondIndex < len(nums2) and firstIndex == len(nums1)):
            for value in nums2[secondIndex : ]:
                newArray.append(value)
                
        for value in newArray:
            print(value)
            
        if (length % 2 == 1):
            return newArray[length // 2]
        else:
            return (newArray[length // 2 - 1] + newArray[length // 2]) / 2.0
        
