//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

//Merge nums1 and nums2 into a single array sorted in non-decreasing order.

//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    int[] mergedArray = new int[m + n];
    System.arraycopy(nums1, 0, mergedArray, 0, m);
    System.arraycopy(nums2, 0, mergedArray, m, n);
    System.out.println("The merge array: "+Arrays.toString(mergedArray));
    Arrays.sort(mergedArray);
    System.out.println("The sorted array: "+Arrays.toString(mergedArray));

    //store the sorted array in nums1
    for (int i = 0; i < nums1.length; i++) {
      nums1[i]= mergedArray[i];
    }
    System.out.println("The sorted array in nums1: "+Arrays.toString(nums1));
  }
}

