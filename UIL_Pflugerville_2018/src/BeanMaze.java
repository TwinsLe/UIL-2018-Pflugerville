import java.util.*;
import java.io.*;
public class BeanMaze {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new File("beanmaze.dat"));
        int n = Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String[] dims = sc.nextLine().split(" ");
            int rows = Integer.parseInt(dims[0]);
            int cols = Integer.parseInt(dims[1]);
            String[][] grid = new String[rows][cols];
            int start_row = -1;
            int start_col = -1;
            int end_row = -1;
            int end_col = -1;
            for(int j=0;j<rows;j++){
                String s = sc.nextLine();
                for(int k=0;k<s.length();k++){
                    grid[j][k] = s.substring(k,k+1);
                    if(s.substring(k,k+1).equals("S")){
                        start_row = j;
                        start_col = k;
                    }
                    else if(s.substring(k,k+1).equals("B")){
                        end_row = j;
                        end_col = k;
                    }
                }
            }
            //System.out.println(Arrays.deepToString(grid));
            //System.out.println(start_row+" "+start_col+" "+end_row+" "+end_col);
            boolean flag = false;
            Queue<Integer> positions = new LinkedList<>();
            positions.add(start_row);positions.add(start_col);
            while(!positions.isEmpty()){
                int r = positions.poll(); int c = positions.poll();
                if (0 <= r && r < rows && 0 <= c && c < cols && !grid[r][c].equals("#")) {
                    if(r==end_row && c==end_col){
                        System.out.println("POSSIBLE");
                        flag = true;
                        break;
                    }
                    grid[r][c] = "#";
                    positions.add(r+1);positions.add(c);
                    positions.add(r-1);positions.add(c);
                    positions.add(r);positions.add(c+1);
                    positions.add(r);positions.add(c-1);
                }
            }
            if(!flag){
                System.out.println("NOT POSSIBLE");
            }
        }
    }
}
