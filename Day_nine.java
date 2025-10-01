//two pointers solution
class Day_nine {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int j = k + 1; j < nums.length; j++){
            if(nums[j] != nums[k]){
                k++;
                nums[k] = nums[j];
            }
        }
        return k + 1;
    }

    public static void main(String[] args){
        Day_nine  dup = new Day_nine();
        int[] nums = {0,0,1,1,2,2,3};
        System.out.println(dup.removeDuplicates(nums));
    }
}