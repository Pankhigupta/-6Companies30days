class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int steps=0;
       int mid=nums[nums.length/2];
       for(int num:nums) steps+=Math.abs(mid-num);
       return steps;
    }
}
// class Solution {
//     public int minMoves2(int[] nums) {
//         int n=0,sum=0;
//         for(int i=0; i<nums.length;i++){
//             sum+=nums[i];
//         }
//         n=sum/nums.length;
//         int steps=0;
//         for(int i=0; i<nums.length;i++){
//             steps+=Math.max(nums[i],n)-Math.min(nums[i],n);
//         }
//         return steps;
//     }
// }
