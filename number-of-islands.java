import java.util.*;
class Solution {
    public int numIslands(char[][] grid) {
        return findAllIslands(grid);
    }
    public int findAllIslands(char[][] grid){
        int numIslands = 0;
        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{1,0}, {0,1}, {0,-1}, {-1,0}};

        Queue<int[]> queue = new ArrayDeque<>();
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == '1'){
                    numIslands++;
                    queue.offer(new int[]{i,j});
                }
                while(!queue.isEmpty()){
                    int[] curr = queue.poll();
                    int x = curr[0];
                    int y = curr[1];

                    if(x<0 || y<0 || x>=m || y>=n || grid[x][y] != '1'){
                        continue;
                    }

                    grid[x][y] = '0';
                    for(int[] dir: directions){
                        int nx = x + dir[0];
                        int ny = y + dir[1];
                        if(nx >= 0 && nx<m && ny >= 0 && ny<n && grid[nx][ny] == '1'){
                            queue.offer(new int[]{nx, ny});
                        }
                    }
                }

            }
        }
        return numIslands;
    }
}