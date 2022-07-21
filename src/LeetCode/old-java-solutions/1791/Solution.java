// 1791. Find Center of Star Graph

class Solution{
    public static void main(String args[]) {
        int edges[][] = { {1,2} ,{5,1}, {1,3}, {1,4} };
        System.out.println(findCenter(edges));
    }

    
    public static int findCenter(int[][] edges){
        for(int i : edges[0])
            for(int j: edges[1])
                if (i == j) return i;
        return -1;
    }
}
