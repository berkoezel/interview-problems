class Solution{
	public static void main(String args[]){
		int[] nums = new int[]{0,1,0,3,12};
		moveZeroes(nums);
		for(int i : nums) System.out.print(i + " ");
	}

	public static void moveZeroes(int[] nums){
		int[] newNums = new int[nums.length];
		int i = 0;
		for(int j : nums) 
			if(j != 0) {
				newNums[i] = j;
				i++;
			}

		for(int k = 0; k<nums.length; k++)
			nums[k] = newNums[k];


	}
}
