class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list  = new ArrayList<>();

        int startingRow  = 0 ;
        int startingCol = 0;
        int endingRow   = matrix.length-1;
        int endingCol  = matrix[0].length-1;

        while( startingRow <=endingRow && startingCol <=endingCol){

            for(int col  = startingCol ; col <=  endingCol ; col++){
                list.add(matrix[startingRow][col]);
            }
        startingRow++;
          for(int row = startingRow ; row<=endingRow  ; row++){
               list.add(matrix[row][endingCol]);
          }
          endingCol--;

          if( startingRow <=endingRow ){

          for(int col = endingCol ; col >= startingCol ; col-- ){
            list.add(matrix[ endingRow][col]);
          }



          endingRow--;
          }

      if( startingCol <=endingCol){
          for(int row = endingRow ; row >= startingRow  ; row-- ){
            list.add(matrix[row][ startingCol]);
          }


            startingCol++;

      }

        }
        return list;
    }
}