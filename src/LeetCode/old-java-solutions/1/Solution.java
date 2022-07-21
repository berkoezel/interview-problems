// 1 - Two Sum
class Solution{
	public static void main(String args[]){
		int[] nums = {3,2,4};
		int target = 6;
		int[] solution = twoSum(nums, target);
		for(int i: solution){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static int[] twoSum(int[] nums, int target){
		for(int i=0; i<nums.length; i++){
				for(int j=0; j<nums.length; j++){
					if(i==j) continue;
					if(nums[i] + nums[j] == target) return new int[] {i, j};
				}
		}
		return new int[] {0,0};
	}
}
