class Solution {
public:
    vector<int> singleNumber(vector<int>& nums) {
        long long xorv = 0;
        for (int num : nums) xorv ^= num;
        long long diff = xorv & -xorv; 
        vector<int> result(2, 0);
        for (int num : nums) {
            if ((num & diff) == 0) {
                result[0] ^= num; 
            } else {
                result[1] ^= num; 
            }
        }
        return result;
    }
};