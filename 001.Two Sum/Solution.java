public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //先排序
        int n=nums.length;
        for(int i=0;i<n;i++){
			for(int j=0;j<n-i-1;j++){
				if(nums[j]<=nums[j+1]){
					//换位置
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		
		}
        
        int i=0,j=n-1;
        int addsum=nums[i]+nums[j];
        int[] arr=new int [2];
        while(i<j){
            
            if(addsum>target){
                i++;
                addsum=nums[i]+nums[j];
            }if(addsum<target){
                j--;
                addsum=nums[i]+nums[j];
            }else{
                arr[0]=i;
                
            }
            
               
        }
        
        return [0,0];
        
    }
}
