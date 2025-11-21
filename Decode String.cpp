class Solution {
private:
    int i = 0;
public:
    string decodeString(string s) {
        string res = "";
        while(i < s.length() && s[i] != ']'){
            char c = s[i];
            if (isdigit(c)) {
                int k = 0;
                while (i < s.length() && isdigit(s[i])) {
                    k = k * 10 + (s[i] - '0');
                    i++;
                }
                i++;
                string dsubstr = decodeString(s);
                while (k > 0) {
                    res += dsubstr;
                    k--;
                }
                i++;
            } else{
                res += c;
                i++;
            }
        }
        return res;
    }
};