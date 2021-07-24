package com.ds.algos;

import java.util.*;

//Design and implement Dijkstra's algorithm which allows us to find the shortest
// path between any two vertices of a graph in Time Complexity O(Edge Log(Vertices))
public class DijkstraAlgo {
    private int dist[];
    private Set<Integer> set;
    private PriorityQueue<Node> priorityQueue;
    private int vertex;
    List<List<Node> > adj;
    public DijkstraAlgo(int vertex){
        this.vertex = vertex;
        dist = new int[vertex];
        set = new HashSet<Integer>();
        priorityQueue = new PriorityQueue<Node>(vertex,new Node());
    }

    public static void main(String[] args)
    {
        int vertex = 5;
        int source = 0;
        List<List<Node> > adj = new ArrayList<List<Node> >();
        for(int i = 0 ;i< vertex ;i++){
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }
        adj.get(0).add(new Node(1, 9));
        adj.get(0).add(new Node(2, 6));
        adj.get(0).add(new Node(3, 5));
        adj.get(0).add(new Node(4, 3));
        adj.get(2).add(new Node(1, 2));
        adj.get(2).add(new Node(3, 4));


        DijkstraAlgo Lecture = new DijkstraAlgo(vertex);
        Lecture.dijkstraProblem(adj, source);

        //Print the shortest path to all the nodes from the source node
        System.out.println("The shorted path from node :");
        for (int i = 0; i < Lecture.dist.length; i++)
            System.out.println(source + " to " + i + " is "
                    + Lecture.dist[i]);
    }

    public void dijkstraProblem(List<List<Node>> adj, int source) {
        this.adj = adj;
        for(int i = 0; i< vertex ;i++){
            dist[i] = Integer.MAX_VALUE;
        }
        priorityQueue.add(new Node(source,0));
        dist[source] = 0;
        while(set.size() != vertex){
            int u = priorityQueue.remove().node;
            set.add(u);
            findNeighbours(u);
        }

    }

    private void findNeighbours(int u) {
        int edgeDistance = -1;
        int newDistance = -1;

        for(int i = 0; i<adj.get(u).size();i++){
            Node v = adj.get(u).get(i);

            if(!set.contains(v.node)){
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                if(newDistance < dist[v.node]){
                    dist[v.node] = newDistance;
                }
                priorityQueue.add(new Node(v.node,dist[v.node]));
            }
        }

    }

    static class Node implements Comparator<Node>{
        public int cost;
        public int node;
        public Node(){

        }
        public Node(int node , int cost){
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compare(Node node1, Node node2) {
            if(node1.cost < node2.cost)
                return -1;
            if(node1.cost > node2.cost)
                return 1;
            return 0;
        }
    }
}
