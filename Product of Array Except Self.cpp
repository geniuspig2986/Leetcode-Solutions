class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        int prefprod = 1;
        int sufprod = 1;
        vector<int> res(n);
        res[0] = 1;
        for(int i = 1; i < n; ++i){
            prefprod *= nums[i-1];
            res[i] = prefprod;
        }
        for(int i = n-1; i >= 0; --i){
            res[i] *= sufprod;
            sufprod *= nums[i];
        }
        return res;
    }
};