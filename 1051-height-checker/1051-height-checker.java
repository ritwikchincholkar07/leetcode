class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        Integer[] res = new Integer[heights.length];
        for(int i = 0 ; i < heights.length ; i++){
            res[i] = heights[i];
        }
        Arrays.sort(res);
        for(int j = 0 ; j < heights.length ; j++ ){
            if(res[j] != heights[j]){
                count++;
            }
        }
        return count;
    }
}