class Solution {
    public int[][] transpose(int[][] matrix) {

        if(matrix == null || matrix.length==0 ){
               return new int[0][0];
        }

        int matrixRow = matrix.length ;
        int matrixCol  =  matrix[0].length ;

        int newMatrixCol =  matrixRow;
        int newMatrixRow = matrixCol ;

        int[][] array = new int[ newMatrixRow][newMatrixCol];

        for(int  i = 0  ; i < matrixRow ;i++){
            for(int j = 0 ; j<matrixCol  ; j++){
                array[j][i] = matrix[i][j];
            }
        }
        

        return array ;
    }
}