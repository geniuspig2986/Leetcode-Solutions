//Solved 9/15/2025
//Going back to rewrite some of my java code in C
//Damn C is fast
//Not functionally any different from Java. No pointers/memory allocations etc.
void moveZeroes(int* nums, int numsSize) {
    int y = 0;
    int x;
    for(x = 0; x < numsSize; x++){
        if(nums[x] != 0){
            int temp = nums[y];
            nums[y] = nums[x];
            nums[x] = temp;
            y++;
        }
    }
}