class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int cnt=0;
        for(int i=0;i<arr1.length;i++){
            int n=arr1[i];
            for(int j=0;j<arr2.length;j++){
                int temp=Math.abs(arr1[i]-arr2[j]);
                if(temp<=d){
                    break;
                }
                if(j==arr2.length-1){
                    cnt++;
                }
                
            }
        }
        return cnt;
        
    }
}