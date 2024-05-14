/* Lab 3 - Searching, Sorting & Dijkstra's */

import java.util.*;

public class Lab3 {
    /* Q1 - Bubble sort */
    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // record a swap
                    swapped = true;
                }
            }
            // If no two elements were swapped by inner loop, then the array is sorted.
            if (!swapped)
                break;
        }
    }

    /* Q2i - Linear search iterative - T(n) = 1, S(n) = 1 */
    static int linearSearchIte(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    /* Q2ii - Linear search recursive - T(n) = n, S(n) = n */
    static int linearSearchRec(int[] arr, int n, int x) {
        if (n <= 0)
            return -1;
        else if (arr[n - 1] == x)
            return n - 1;
        else
            return linearSearchRec(arr, n - 1, x);
    }

    /* Q3i - Compute a^n iterative - T(n) = n, S(n) = 1 */
    static int powIte(int a, int n) {
        int result = 1;
        for (int i = 1; i <= n; i++)
            result *= a;
        return result;
    }

    /* Q3ii - Compute a^n recursive - T(n) = log n, S(n) = log n */
    static int powRec(int a, int n) {
        if (n == 0)
            return 1;
        int res = powRec(a, n / 2);
        if (n % 2 == 0)
            return res * res;
        else
            return a * res * res;
    }

    public static void main(String[] args) {
        int[] arr = { 6, 2, 5, 4, 3 };

        System.out.println("Before sorting: "+Arrays.toString(arr));
        bubbleSort(arr, arr.length);
        System.out.println("After sorting: "+Arrays.toString(arr));

        System.out.println(linearSearchIte(arr, arr.length, 2));
        System.out.println(linearSearchRec(arr, arr.length, 2));
        
        System.out.println(powIte(5, 5));
        System.out.println(powRec(2, 3));
    }
}


/* Q4 - Dijkstra's Algorithm (shortest path)
 *
 * You need to write
 * dijkstra() & EdgeComparator class only
 */
class Graph2 {
    int count;
    private LinkedList<LinkedList<Edge>> Adj;

    static class Edge {
        int dest, cost;
        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }
    }

    Graph2(int cnt) {
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

    /* Write this */
    public static void dijkstra(Graph2 grp, int source) {
        int count = grp.count;
        int[] prev = new int[count];
        int[] dist = new int[count];
        boolean[] visited = new boolean[count];
        for(int i = 0; i < count; i++) {
            prev[i] = -1;
            dist[i] = 999999;
        }
        dist[source] = 0;
        prev[source] = -1;
        EdgeComparator comp = new EdgeComparator();
        PriorityQueue<Edge> que = new PriorityQueue<Edge>(100, comp);
        Edge node = new Edge(source, 0);
        que.add(node);
        while (!que.isEmpty()) {
            node = que.peek();
            que.remove();
            source = node.dest;
            visited[source] = true;
            LinkedList<Edge> adl = grp.Adj.get(source);
            for (Edge adn : adl) {
                int dest = adn.dest;
                int alt = adn.cost + dist[source];
                if(dist[dest] > alt && visited[dest] == false) {
                    dist[dest] = alt;
                    prev[dest] = source;
                    node = new Edge(dest, alt);
                    que.add(node);
                }
            }
        }
        for (int i = 0; i < count; i++) {
            if(dist[i] == Integer.MAX_VALUE)
                System.out.println("\nnode id "+i+" prev "+prev[i]+" distance: Unreachable");
            else
                System.out.println("\nnode id "+i+" prev "+prev[i]+" distance: "+dist[i]);
        }
    }
    /* & this */
    static class EdgeComparator implements Comparator<Edge> {
        public int compare(Edge x, Edge y) {
            if(x.cost < y.cost)
                return -1;
            else if(x.cost > y.cost)
                return 1;
            return 0;
        }
    }

    public static void main(String[] args) {
        Graph2 grp = new Graph2(4);
        grp.addDirectedEdge(0, 1, 1);
        grp.addDirectedEdge(0, 2, 1);
        grp.addDirectedEdge(1, 2, 1);
        grp.addDirectedEdge(2, 3, 1);
        grp.addDirectedEdge(3, 2, 1);
        grp.print();
        dijkstra(grp, 0);
    }
}
