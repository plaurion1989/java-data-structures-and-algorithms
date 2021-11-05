package codechallenges.graph;

import java.util.*;

public class Graph<T extends Comparable<? super T>>
{

    private int size = 0;

    public Graph() {
        this.adjacencyListMap = LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>>();
    }

    private LinkedHashMap<Vertex<T>, LinkedList<Edge<T>>> adjacencyListMap;

    Vertex<T> addVertex(T value)
    {
        Vertex<T> newVertex = new Vertex<>(value);
        LinkedList<Edge<T>> newAdjacencyList = new LinkedList<>();
        adjacencyListMap.put(newVertex, newAdjacencyList);
        size ++;
        return newVertex;
    }

    Set<Vertex<T>> getNodes()
    {
       return adjacencyListMap.keySet();
    }

    List<Edge<T>> getNeighbors(Vertex<T> sourceVertex)
    {
        //TODO: implement me
        return null;
    }

    void addEdge(Vertex<T> sourceVertex, Vertex<T> destinationVertex, int weight)
    {
        Edge<T> newEdge = new Edge<>(destinationVertex, weight);
        LinkedList<Edge<T>> adjacencyList = adjacencyListMap.get(sourceVertex);
        adjacencyList.add(newEdge);
    }

    int size()
    {
        return this.size;
    }
    @Override
    public String toString()
    {
        Set<Vertex<T>> vertices = adjacencyListMap.keySet();
        String graphString = "";
        for (Vertex<T> vertex : vertices)
        {
            LinkedList<Edge<T>> adjacencyList = adjacencyListMap.get(vertex);
            System.out.println(vertex + ": ");
            for(Edge<T> edge : adjacencyList)
            {
                graphString += edge.destination.value + " weight: " + edge.weight + ") ->");
                graphString += "\n";
            }
        }return graphString;
    }
}
