import java.util.ArrayList;
import java.util.Arrays;

public class DFS_Traversal {


    static ArrayList<Integer> dfs(int node,ArrayList<ArrayList<Integer>>graph,ArrayList<Integer>ans,boolean visited[]){
        visited[node]=true;
        ans.add(node);
        
        for(int i=0;i<graph.get(node).size();i++){
            int neigh=graph.get(node).get(i);
            if(!visited[neigh]){
                ans=dfs(neigh, graph, ans, visited);
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
        graph.get(0).addAll(Arrays.asList(1,3,2));
        graph.get(1).addAll(Arrays.asList(0,7,4));
        graph.get(2).addAll(Arrays.asList(0,5));
        graph.get(3).addAll(Arrays.asList(0));
        graph.get(4).addAll(Arrays.asList(1,5));
        graph.get(5).addAll(Arrays.asList(4,6,2));
        graph.get(6).addAll(Arrays.asList(5));
        graph.get(7).addAll(Arrays.asList(1));

        boolean visited[]=new boolean[v];
        ArrayList<Integer>ans=new ArrayList<>();
        System.out.println(dfs(0, graph, ans, visited));
        System.out.println(dfs(1, graph, ans, visited));
        System.out.println(dfs(0, graph, ans, visited));



    }
}