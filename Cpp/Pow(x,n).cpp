class Solution {
public:
    double myPow(double x, int n) {
        long long exp = n;
        if(n < 0){
            exp = -exp;
            return 1/powHelper(x,exp);
        } else{
            return powHelper(x,n);
        }
    }
private: 
    double powHelper(double x, long n){
        if(n == 0) return 1;
        double half = myPow(x,n/2);
        if(n%2 == 0){
            return half*half;
        }
        else{
            return x*half*half;
        }
    }
};