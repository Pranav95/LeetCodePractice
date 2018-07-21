class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        if(matrix.length == 0 )
            return false ; 
        if(matrix[0].length == 0 )
            return false ; 
        
        int rows = matrix.length;
        int columns = matrix[0].length ;
        if(rows == 0 || columns == 0)
            return false;
        
        int i = 0 ;
        int j = columns - 1 ;

        while( j>=0 && i<= rows-1 )
        {
            
            if(target == matrix[i][j])
                return true;

            else if(target > matrix[i][j])
            {
                i = i+1 ;  //move one column down
            }
            else
            {
                j = j - 1 ; //move on the left side 
            }
        }       

        return false;

    }
}