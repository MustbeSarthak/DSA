class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return merge(nums1, nums2);
    }

    private double merge(int[] left, int[] right) {
        int[] mix = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                mix[k] = left[i];
                i++;
            } else {
                mix[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            mix[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            mix[k] = right[j];
            j++;
            k++;
        }

        return median(mix);
    }

    private double median(int[] arr) {
        int n = arr.length;
        int mid = n / 2;

        if (n % 2 == 0) {
            return (arr[mid] + arr[mid - 1]) / 2.0;
        } else {
            return arr[mid];
        }
    }
}