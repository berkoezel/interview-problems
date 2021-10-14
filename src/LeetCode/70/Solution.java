class Solution{
	public static void main(String args[]){
		int n = 30;
		System.out.println(climbStairs(n));
		n = 3;
		System.out.println(climbStairs(n));
		n = 2;
		System.out.println(climbStairs(n));
		n = 5;
		System.out.println(climbStairs(n));
	}
	public static int climbStairs(int n) {
        int steps = 0;
				int n1 = 0;
				int n2 = 1;
				for(int i=1; i<=n; i++){
					steps = n1+n2;
					n1=n2;
					n2=steps;
				}

				return steps;
    }
}
