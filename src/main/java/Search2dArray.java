public class Search2dArray {
    /**
     * Receive a 2d array of ints. (That's an array of arrays!)
     * Your task is to search the array for a matching value, return true if found false otherwise.
     * You'll need to use a for loop within a for loop - each for loop handles searching in a particular dimension.
     * I recommend reasoning through this problem on pencil and paper.
     *
     * @param nums a two dimensional array - meaning, an array of arrays.
     * @param target a value that may be contained within nums.
     * @return true if nums contains target, and false otherwise.
     */
    public boolean search(int[][] nums, int target){

        // aside: https://stackoverflow.com/questions/31822020/in-java-what-does-the-symbol-mean

        // initialize iterator i for outer loop (of arrays)
        int i = 0;
        // iterate through array of arrays
        while(i < nums.length){
            // initialize iterator j for inner loop array of int
            int j = 0;
            // iterate through each individual array of elements
            while(j < nums[i].length){
                // if 'target' int value is found within the array of int
                if(nums[i][j] == target){
                    // return boolean true (implies operation over -- exit)
                    return true;
                }
                // increment inner loop by 1 -- continue search for 'target'
                ++j;
            }
            // increment outer loop by 1 -- onto next array in array of arrays
            ++i;
        }
        // return false if 'target' int not found as requested
        return false;
    }
}
