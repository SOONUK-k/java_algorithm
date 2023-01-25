import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int from = 0;
        int to =2;
        int[][] matrix = new int[][]
                {
                        {0, 1, 0, 0},
                        {0, 0, 1, 0},
                        {0, 0, 0, 1},
                        {0, 1, 0, 0}
                };

        //if(from==to) return true;
        int size = matrix.length;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[size];

        queue.add(from);

        while(!queue.isEmpty()){
            int num = queue.poll();
            //해당 숫자를 이미 탐험했으면 패스
            if(visited[num]==true) continue;
            visited[num] = true;

            if(matrix[num][to]==1) return true;
            for(int i=0; i<size; i++){
                if(matrix[from][i]==1){
                    queue.add(i);
                }
            }

        }
    }
}