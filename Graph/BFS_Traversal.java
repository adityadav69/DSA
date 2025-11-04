import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS_Traversal {

    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> graph,int v,int start){
        ArrayList<Integer>ans=new ArrayList<>();
        boolean visited[]=new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start]=true;
        while (!q.isEmpty()) {
            int node=q.poll();
            ans.add(node);

            for(int i=0;i<graph.get(node).size();i++){
                int neigh=graph.get(node).get(i);
                if(!visited[neigh]){
                    q.add(neigh);
                    visited[neigh]=true;
                }
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>();
        int v=9;
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
        graph.get(0).addAll(Arrays.asList(1,2));
        graph.get(1).addAll(Arrays.asList(0,5,7));
        graph.get(2).addAll(Arrays.asList(0,3,4));
        graph.get(3).addAll(Arrays.asList(2));
        graph.get(4).addAll(Arrays.asList(2));
        graph.get(5).addAll(Arrays.asList(1,6));
        graph.get(6).addAll(Arrays.asList(5,8));
        graph.get(7).addAll(Arrays.asList(1,8));
        graph.get(8).addAll(Arrays.asList(7,6));


        ArrayList<Integer>ans=bfs(graph,v,0);
        System.out.println(ans);
        

    }
}
