class Solution 
{
    public int countBattleships(char[][] board) 
    {
        int m = board.length;
        int n = board[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (board[i][j] == 'X') 
                {
                    countbattle(board, i, j, m, n);
                    count++;
                }
            }
        }
        return count;
    }
    public void countbattle(char[][] board, int i, int j, int m, int n)
    {
        if(i<0 || j<0 || i>=m || j>=n || board[i][j]!='X') return;

        board[i][j]='.';
        countbattle(board, i+1,j,m,n);
        countbattle(board, i-1,j,m,n);
        countbattle(board, i,j+1,m,n);
        countbattle(board, i,j-1,m,n);
    }
}
