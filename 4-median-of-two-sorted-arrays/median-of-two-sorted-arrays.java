class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length, i = 0, j = 0, index = 0;
        int result[] = new int[n + m];

        if(n == 0 && m == 0)
            return 0;
       
       if(n == 0)
            return calculateMedian(nums2);
       
       if(m == 0)
            return calculateMedian(nums1);

        while(i < n && j < m) {
            if(nums1[i] < nums2[j]) {
                result[index] = nums1[i];
                index++; i++;
            } else if(nums1[i] > nums2[j]) {
                result[index] = nums2[j];
                index++; j++;
            } else {
                result[index++] = nums1[i];
                result[index] = nums2[j];
                i++; j++; index++;
            }
        }

        if(i < n) {
            while(i < n) {
                result[index] = nums1[i];
                index++; i++;
            }
        } else if(j < m) {
            while(j < m) {
                result[index] = nums2[j];
                index++; j++;
            }
        }

        for(i = 0; i < result.length; i++) {
            System.out.print(result[i] + " - ");
        }
        return calculateMedian(result);
    }

    public double calculateMedian(int[] arr) {
        int size = arr.length, mid = size / 2;

        if(size % 2 == 0) {
            return (arr[mid - 1] + arr[mid]) / 2.0;
        } else {
            return arr[mid];
        }
    }
}