import java.util.Stack;

public class ques6 {
    public static void main(String[] args) {
        int graph[][] = {

                { 0, 1, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 1, 0 },
                { 1, 0, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 1, 1 },
                { 0, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 1, 1, 0 }
        };
        int start = 0;
        dfs(graph, start);
    }

    public static void dfs(int[][] graph, int start) {
        
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[graph.length];
        stack.add(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            
            int node = stack.pop();
            System.out.print(node + " ");

            for (int i = 0; i < visited.length; i++) {
                
                if (!visited [i] && graph [node][i] == 1 ){
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}
