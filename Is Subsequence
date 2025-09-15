//Solved September 15
// again very similar to Java
bool isSubsequence(char* s, char* t) {
    if(strlen(s) > strlen(t)){
        return false;
    }
    int y = 0, x = 0;
    for(x = 0; x < strlen(t); x++){
        if(s[y] == t[x]){
            y++;
        }
    }
    if(y == strlen(s)){
        return true;
    }
    return false;
    
}