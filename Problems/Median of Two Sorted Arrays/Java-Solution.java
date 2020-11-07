class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = nums1.length + nums2.length;
        int [] newArray = new int [length];
        int index = 0;
        int firstIndex = 0, secondIndex = 0;
        
        while (firstIndex < nums1.length && secondIndex < nums2.length) {
            if (nums1[firstIndex] <= nums2[secondIndex]) {
                newArray[index] = nums1[firstIndex];
                index++;
                firstIndex++;
            } else {
                newArray[index] = nums2[secondIndex];
                index++;
                secondIndex++;
            }
        }
        
        if (firstIndex < nums1.length && secondIndex == nums2.length) {
            for (int i = firstIndex ; i < nums1.length ; i++) {
                newArray[index] = nums1[i];
                index++;
            }
        } else if (secondIndex < nums2.length && firstIndex == nums1.length) {
            for (int i = secondIndex ; i < nums2.length ; i++) {
                newArray[index] = nums2[i];
                index++;
            }
        }
        
        for (int x : newArray) {
            System.out.println(x);
        }        
        if (length % 2 == 1) {
            return newArray[length / 2];
        } else {
            return ((double)(newArray[(length / 2) - 1] + newArray[(length / 2)])) / 2;
        }
    }
}
