class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows) {
            return s;
        }

        int n = s.length();
        char matrix[][] = new char[numRows][n];
        int row = 0, col = 0, index = 0;

        while(index < n) {
            while(row < numRows && index < n) {
                matrix[row][col] = s.charAt(index++);
                row++;
            }

            row -= 2;
            col++;

            while(row > 0 && index < n) {
                matrix[row][col] = s.charAt(index++);
                row--; col++;
            }
        }

        StringBuilder response = new StringBuilder();

        for(int i = 0; i < numRows; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] != '\u0000') {
                    response.append(matrix[i][j]);
                }
            }
        }

        return response.toString();
    }
}