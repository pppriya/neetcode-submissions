class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer,Set<Integer>> rows = new HashMap<>();
        Map<Integer,Set<Integer>> cols = new HashMap<>();
        Map<String,Set<Integer>> grid = new HashMap<>();

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.')continue;
                String pos = (i/3) + "," + (j/3);
                if(!rows.containsKey(i))rows.put(i, new HashSet<>());
                if(!cols.containsKey(j))cols.put(j, new HashSet<>());
                if(!grid.containsKey(pos))grid.put(pos, new HashSet<>());

                int num = board[i][j] - '0';
                if( rows.get(i).contains(num) || 
                    cols.get(j).contains(num)||
                    grid.get(pos).contains(num))return false;
                
                rows.get(i).add(num);
                cols.get(j).add(num);
                grid.get(pos).add(num);

            }
        }
        return true;
    }
}
