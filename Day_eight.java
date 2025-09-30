//two-sum
// it can be done with two methods
// 1. Bruteforce method:
// we have to use two loops where the code will go through every pair of array to find the correct pair who's sum is equal to the given target
// 2. Optimized method:
// we would use the hashmap instead which will keep on saving the complement of the target with every array value and keep on saving in the hashmap array while in the meantime also keep on checking if complement exists in the hashmap
// import java.util.HashMap;

// class Day_eight {
//     public int[] twoSum(int[] nums, int target) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i = 0; i < nums.length; i++){
//             int compliment = target - nums[i];
//             if(map.containsKey(compliment)){
//                 return new int[]{map.get(compliment), i};
//             }
//             map.put(nums[i], i);
//         }
//         return new int [0];
//     }
//     public static void main(String[] args){
//         Day_eight sol = new Day_eight();
//         int nums[] = {2,7,11,15};
//         int target = 9;
//         System.out.println(sol.twoSum(nums, target));
//     }
// }

//two-pointer technique
/*
it is a technique where two pointers are independently interate through a sorted array to find what is asked,
for example:
we need to find indexes of that pair from the array who's sum is equal to the target.
int[] nums1 = {2,3,4,5,6}
int leftPointer = 0;
int rightPointer = nums1.length - 1;
for loop to iterate through array{
//if condition which checks
if(leftPointer + rightPointer == target){
//print out the indexes of leftPointer and rightPointer
} else {
leftPointer++;
righPointer--;
}
}

so it would be like;
int left = 0;
int right = nums1.length - 1;
while(left < right){
int sum = nums1[left] + nums1[right];
if(sum == target){
return new int[] {left + 1, right +1 };
}
else if(sum < target){
left++;
}
else {
right--;

}
}

*/
class Day_eight {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == target){
                return new int[]{left + 1, right + 1};
            } else if(sum < target){
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
    public static void main(String[] args){
        Day_eight twoPointer = new Day_eight();
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(twoPointer.twoSum(numbers, target));
    }
}