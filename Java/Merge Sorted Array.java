//solved october 1st 2025
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int z;
        for(z = m+n-1; m > 0 && n > 0; z--){
            if(nums1[m-1] > nums2[n-1]){
                nums1[z] = nums1[m-1];
                m--;
            } else{
                nums1[z] = nums2[n-1];
                n--;
            }            
        }
        while(n > 0){
            nums1[z] = nums2[n-1];
            n--;
            z--;
        }
    }
}