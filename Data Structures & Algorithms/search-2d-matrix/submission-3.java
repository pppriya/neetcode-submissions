class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int row = 0;
        //row traverse
        while(row < m){
            if(matrix[row][0] <= target && target <= matrix[row][n-1])
                break;
            row++;
        }
        if(row == m)return false;

        int start = 0, end = n-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(matrix[row][mid] == target)return true;
            else if(matrix[row][mid] < target)start = mid+1;
            else end = mid -1;
        }
        return false;
    }
}
