import java.util.HashMap;

class Solution{
	public static void main(String args[]){
		int[] nums = new int[]{3,3,4};
		System.out.println(majorityElement(nums));

		
	}

	public static int majorityElement(int[] nums){
		int majorNum = nums[0];
		int majorCount = 0;
		HashMap<Integer, Integer> numsMap = new HashMap<>();
		for(int i : nums){
			
			if(numsMap.get(i) != null) numsMap.put(i, numsMap.get(i)+1);
			
			else numsMap.put(i, 1);


		}
		
	for(int i: numsMap.keySet()){
		if(numsMap.get(i) > majorCount){
			majorCount = numsMap.get(i);
			majorNum = i;
		}
	}	

	return majorNum;

	}
}
