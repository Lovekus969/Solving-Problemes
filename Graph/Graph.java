import java.util.*;

public class Graph {
    private Map<Integer, List<Integer>> adj;

    public Graph() {
        adj = new HashMap<>();
    }

    public void addEdge(int u, int v) {
        adj.putIfAbsent(u, new ArrayList<>());
        adj.putIfAbsent(v, new ArrayList<>());
        adj.get(u).add(v);
        adj.get(v).add(u); // remove if directed
    }

    public void printGraph() {
        for (int node : adj.keySet()) {
            System.out.println(node + " -> " + adj.get(node));
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);

        g.printGraph();
    }
}
