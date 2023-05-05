import java.util.*;

public class ques5 {
    
       public static void main(String[] args) {
              int[][] graph = {

                            { 0, 1, 1, 0, 0, 0 },
                            { 1, 0, 0, 1, 1, 0 },
                            { 1, 0, 0, 0, 1, 0 },
                            { 0, 1, 0, 0, 1, 1 },
                            { 0, 1, 1, 1, 0, 1 },
                            { 0, 0, 0, 1, 1, 0 }

              };
              bfs(graph, 0);
       }
       
       public static void bfs(int[][] graph, int start) {
              
              ArrayDeque<Integer> deque = new ArrayDeque<>();
              boolean visited[] = new boolean[graph.length];
              deque.add(start);
              visited[start] = true;
                     
              while (!deque.isEmpty()) {
                     
                     int node = deque.remove();
                     System.out.println(node + " ");

                     for (int i = 0; i < graph.length; i++) {
                            
                            if (!visited[i] && graph[node][i] == 1) {
                                   
                                   deque.add(i);
                                   visited[i] = true;
                            }
                     }
              }
       }
}
