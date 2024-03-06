import java.util.*;

public class Graph {
    int count;
    private LinkedList<LinkedList<Edge>> Adj;

    class Edge {
        private int dest, cost;
        public Edge(int d, int c) {
            dest = d;
            cost = c;
        }
    }

    Graph(int cnt) {
        count = cnt;
        Adj = new LinkedList<LinkedList<Edge>>();
        for (int i = 0; i < cnt; i++)
            Adj.add(new LinkedList<Edge>()); // Initializing each list with an empty list
    }

    private void addDirectedEdge(int source, int dest, int cost) {
        Edge edge = new Edge(dest, cost);
        Adj.get(source).add(edge);
    }

    void addDirectedEdge(int source, int dest) {
        addDirectedEdge(source, dest, 1);
    }

    void addUndirectedEdge(int source, int dest, int cost) {
        addDirectedEdge(source, dest, cost);
        addDirectedEdge(dest, source, cost);
    }

    void addUndirectedEdge(int source, int dest) {
        addUndirectedEdge(source, dest, 1);
    }

    static boolean dfsStack(Graph gph, int source, int target) {
        int count = gph.count;
        boolean[] visited = new boolean[count];
        Stack<Integer> stk = new Stack<Integer>();
        stk.push(source);
        visited[source] = true;
        while (!stk.isEmpty()) {
            int curr = stk.pop();
            LinkedList<Edge> adl = gph.Adj.get(curr);
            for (Edge adn : adl)
                if (!visited[adn.dest]) {
                    visited[adn.dest] = true;
                    stk.push(adn.dest);
                }
        }
        return visited[target];
    }

    void print() {
        for (int i = 0; i < count; i++) {
            LinkedList<Edge> ad = Adj.get(i);
            System.out.print("\n Vertex " + i + " is connected to: ");
            for (Edge adn : ad)
                System.out.print("(" + adn.dest + ", " + adn.cost + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Graph grp = new Graph(4);
        grp.addDirectedEdge(0, 1, 1);
        grp.addDirectedEdge(0, 2, 1);
        grp.addDirectedEdge(1, 2, 1);
        grp.addDirectedEdge(2, 3, 1);
        grp.addDirectedEdge(3, 2, 1);
        grp.print();
        System.out.println(dfsStack(grp, 1, 2));
    }
}

// WAP to represent a graph in a adjacency list repesentation.
// Stack based implementation of DFS.
// HW - Queue based BFS, Example 12.8, 12.22
