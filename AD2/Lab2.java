/* Lab 2 - Graph - BFS, DFS, MST */

import java.util.*;

/* Q1 - Adjacency list representation of graph */
class Lab2 {
    int count;
    private LinkedList<LinkedList<Edge>> Adj;

    static class Edge {
        private int dest, cost;
        public Edge(int d, int c) {
            dest = d;
            cost = c;
        }
    }

    Lab2(int cnt) {
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
        Lab2 grp = new Lab2(4);
        grp.addDirectedEdge(0, 1, 1);
        grp.addDirectedEdge(0, 2, 1);
        grp.addDirectedEdge(1, 2, 1);
        grp.addDirectedEdge(2, 3, 1);
        grp.addDirectedEdge(3, 2, 1);
        grp.print();
    }
}

/* Q2 - DFS */
/* public static boolean dfsStack(Graph gph, int source, int target) {
    int count = gph.count;
    boolean[] visited = new boolean[count];
    Stack<Integer> stk = new Stack<Integer>();
    stk.push(source);
    visited[source] = true;
    while (!stk.isEmpty()) {
        int curr = stk.pop();
        LinkedList<Edge> adl = gph.Adj.get(curr);
        for (Edge adn : adl)
            if (visited[adn.dest] == false) {
                visited[adn.dest] = true;
                stk.push(adn.dest);
            }
    }
    return visited[target];
} */


/* Q3 - BFS */
/* public static boolean bfs(Graph gph, int source, int target) {
    int count = gph.count;
    boolean[] visited = new boolean[count];
    LinkedList<Integer> que = new LinkedList<Integer>();
    que.add(source);
    visited[source] = true;
    while (!que.isEmpty()) {
        int curr = que.remove();
        LinkedList<Edge> adl = gph.Adj.get(curr);
        for (Edge adn : adl) {
            if (visited[adn.dest] == false) {
                visited[adn.dest] = true;
                que.add(adn.dest);
            }
        }
    }
    return visited[target];
} */


/* Q4 - Example 12.8 Count all path DFS */
/* public static int countAllpathDFS(Graph gph, boolean[] visited, int source, int dest) {
    if(source == dest)
        return 1;
    int count = 0;
    visited[source] = true;
    LinkedList<Edge> adl = gph.Adj.get(source);
    for (Edge adn : adl) {
        if(visited[adn.dest] == false)
            count += countAllpathDFS(gph, visited, adn.dest, dest);
        visited[source] = false;
    }
    return count;
}
public static int countAllPaths(Graph gph, int source, int dest) {
    int count = gph.count;
    boolean[] visited = new boolean[count];
    return countAllpathDFS(gph, visited, source, dest);
} */


/* Q5 - Example 12.22 Prim's Algorithm (MST) */
/* public static void prims(Graph gph) {
    int count = gph.count;
    int[] prev = new int[count];
    int[] dist = new int[count];
    boolean[] visited = new boolean[count];
    int src = 1;
    for (int i = 0; i < count; i++) {
        prev[i] = -1;
        dist[i] = 999999;
    }
    dist[src] = 0;
    prev[src] = -1;
    EdgeComparator comp = new EdgeComparator();
    PriorityQueue<Edge> que = new PriorityQueue<Edge>(100, comp);
    Edge node = new Edge(src, 0);
    que.add(node);
    while (!que.isEmpty()) {
        node = que.peek();
        que.remove();
        visited[src] = true;
        src = node.dest;
        LinkedList<Edge> adl = gph.Adj.get(src);
        for (Edge adn : adl) {
            int dest = adn.dest;
            int alt = adn.cost;
            if (dist[dest] > alt && visited[dest] == false) {
                dist[dest] = alt;
                prev[dest] = src;
                node = new Edge(dest, alt);
                que.add(node);
            }
        }
    }
    for (int i = 0; i < count; i++) {
        if (dist[i] == Integer.MAX_VALUE)
            System.out.println("node id "+i+" prev "+prev[i]+" distance: Unreachable");
        else
            System.out.println("node id "+i+" prev "+prev[i]+" distance: "+dist[i]);
    }
}
static class EdgeComparator implements Comparator<Edge> {
    public int compare(Edge x, Edge y) {
        if(x.cost < y.cost)
            return -1;
        if(x.cost > y.cost)
            return 1;
        return 0;
    }
}
*/
