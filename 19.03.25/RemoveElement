class Solution {
    public int removeElement(int[] nums, int val) {


        for(int i=0;i<nums.length;i++) {
			if(nums[i] == val) {
				nums[i] = 101;
			}
		}
		
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 101) {
				for(int j=i+1;j<nums.length;j++) {
					if(nums[j] != 101) {
						int temp = nums[j];
						nums[j] = nums[i];
						nums[i] = temp;
					}
				}
			}
		}

        int count = 0;

        for(int i=0;i<nums.length;i++) {
			if(nums[i] != 101) {
				count++;
			}
		}
		
		return(count);
    }
}
