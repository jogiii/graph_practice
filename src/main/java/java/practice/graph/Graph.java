package java.practice.graph;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph(boolean inputIsWeighted, boolean inputIsDirected){
        this.isDirected = inputIsDirected;
        this.isWeighted = inputIsWeighted;
        this.vertices = new ArrayList<Vertex>();
    }

    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }
}
