import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    int numVertices;
    LinkedList<Integer>[] adjLists;
    boolean[] visited;

    Graph(int numVertices) {
        this.numVertices = numVertices;
        adjLists = new LinkedList[numVertices];
        visited = new boolean[numVertices];
        for (int i = 0; i < numVertices; i++) {
            adjLists[i] = new LinkedList<>();
        }
    }

    public void addEdge(int src, int dest) {
        adjLists[src].add(dest);
        adjLists[dest].add(src); 
    }

    public void DFS(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " "); 
        for (int adj : adjLists[vertex]) {
            if (!visited[adj]) {
                DFS(adj);
            }
        }
    }

    public void BFS(int s) {
        Queue<Integer> queue = new LinkedList<>();
        visited[s] = true;
        queue.add(s);
        while (!queue.isEmpty()) {
            s = queue.poll();
            System.out.print(s + " "); 
            for (int i : adjLists[s]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }

    public void resetVisited() {
        for (int i = 0; i < numVertices; i++) {
            visited[i] = false;
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("BFS starting from 0:");
        graph.BFS(0);
        
        graph.resetVisited(); 
        System.out.println("\nDFS starting from 0:");
        graph.DFS(0);
    }
}
