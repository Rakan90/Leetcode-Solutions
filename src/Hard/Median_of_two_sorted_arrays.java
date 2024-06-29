package Hard;

public class Median_of_two_sorted_arrays {
    //Given two sorted arrays nums1 and nums2 of size m and n respectively,
    // return the median of the two sorted arrays.
    //Example 1:
    //Input: nums1 = [1,3], nums2 = [2]
    //Output: 2.00000
    //Explanation: merged array = [1,2,3] and median is 2.
    //Example 2:
    //Input: nums1 = [1,2], nums2 = [3,4]
    //Output: 2.50000
    //Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.



    //The overall run time complexity of my code is O(n + m)
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length + nums2.length ];

        for (int i = 0, j = 0, k = 0; k < nums1.length + nums2.length ; i++, j++, k++) {
            if (i < nums1.length && ( j >= nums2.length || nums1[i] <= nums2[j])) {
                nums[k] = nums1[i];
                j--;
            }else if (j < nums2.length && ( i >= nums1.length || nums2[j] < nums1[i])) {
                nums[k] = nums2[j];
                i--;
            }

        }

        if (nums1.length % 2 == nums2.length % 2) {

            return (double)(nums[nums.length / 2 - 1] + nums[nums.length / 2]) / 2.0;
        }

        return nums[(nums.length / 2)];
    }

}
