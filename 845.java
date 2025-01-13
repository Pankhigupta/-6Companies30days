class Solution {
    public int longestMountain(int[] arr) {
        int ans=0;
        for(int i=1; i<arr.length-1; i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                int left=i-1;
                int right=i+1;

                while(left>0 && arr[left-1]<arr[left]){
                    left--;
                }
                while(right<arr.length-1 && arr[right+1]<arr[right]){
                    right++;
                }
                System.out.println(left+" "+right);
                ans=Math.max(ans, right-left+1);
            }
        }        
        return ans;
    }
}
