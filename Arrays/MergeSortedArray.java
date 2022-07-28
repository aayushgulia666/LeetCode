package LeetCode.Array;

/**
 * @author aayush gulia
 * @email aayushgulia07@outlook.com
 * Dated 25-07-2022
 * website https://www.aayushgulia.com
 *
 * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
 * representing the number of elements in nums1 and nums2 respectively.
 *
 * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
 *
 * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
 * To accommodate this, nums1 has a length of m + n,
 * where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
 */

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] A = {1,4,5,6,7,12,15,16,17};
        int[] B = {1,1,1,2,2,2,3,3,3};

        int m = A.length; int n = B.length;
        int o = m+n;

        int[] C = new int[o];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i<m && j<n){
            if (A[i] < B[j]){
                C[k] = A[i];
                k++;
                i++;
            }
            else{
                C[k] = B[j];
                k++;
                j++;
            }

        }
        for (;i<m;i++){
            C[k] = A[i];
            k++;
        }

        for (;j<n;j++){
            C[k] = B[j];
            k++;
        }

        for (int num : C){
            System.out.print(num + " ");
        }

    }

}
