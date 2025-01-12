class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int ans=0;
        
        int i;
        
        for( i=0;i<arr1.length;i++){
            int f=0;
            for(int j=0;j<arr2.length;j++){

                    int n=Math.max(arr1[i],arr2[j])-Math.min(arr1[i],arr2[j]);
                    System.out.println(n);

                    if(n<=d ){

                        f=1;
                        break;
                        // ans+=1;
                    }
                    
            }
            if(f==0){
                ans+=1;
            }
        }
        return ans;
    }
}
