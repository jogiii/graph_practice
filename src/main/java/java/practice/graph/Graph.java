package java.practice.graph;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;


    public Graph(boolean inputIsWeighted, boolean inputIsDirected){
        this.isWeighted = inputIsWeighted;
        this.isDirected = inputIsDirected;
        vertices = new ArrayList<Vertex>();
    }

    public Vertex addVertex(String data){
        Vertex vertex = new Vertex(data);
        this.vertices.add(vertex);
        return vertex;
    }

    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight){
    if(!this.isWeighted){
        weight = null;
    }
    vertex1.addEdge(vertex2,weight);

    if(this.isDirected){
        vertex2.addEdge(vertex1,weight);
    }



    }

    public void removeEdge(graph.datastructure.Vertex vertex1, graph.datastructure.Vertex vertex2){
        vertex1.removeEdge(vertex2);
        if(!this.isDirected){
            vertex2.removeEdge(vertex1);
        }
    }

    public void removeVertex(graph.datastructure.Vertex vertex){
        this.vertices.remove(vertex);
    }

    public ArrayList<Vertex> getVertices(){
        return  this.vertices;
    }

    public boolean isWeighted() {
        return this.isWeighted;
    }

    public boolean isDirected() {
        return this.isDirected;
    }


}
