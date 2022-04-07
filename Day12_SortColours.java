class Solution {
    public void sortColors(int[] nums) {
        
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++){
                
                if (nums[i] >= nums[j]){
                    swap(nums, i, j);
                }
            }
        }
    }
    
    public void swap(int[] numArr, int a, int b){
        int temp = numArr[a];
        numArr[a] = numArr[b];
        numArr[b] = temp;
    }
}