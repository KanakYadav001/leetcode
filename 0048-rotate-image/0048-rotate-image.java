class Solution {
    public void rotate(int[][] matrix) {

        int size = matrix.length;

        for (int i = 0; i < size; i++) {

            for (int j = i + 1; j < size; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }

        for (int i = 0; i < size; i++) {

            int start = 0;
            int end = size - 1;

            while (start < end) {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;

                start++;
                end--;

            }

        }

        

    }
}