package graph.datastructure;

import java.util.ArrayList;

public class Graph {

    // Array list of Vertexes
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;


    public Graph(boolean inputIsWeighted, boolean inputIsDirected){
        this.vertices = new ArrayList<Vertex>();
        this.isDirected = inputIsDirected;
        this.isWeighted  = inputIsWeighted;
    }

    // add vertex method create new Vertex and add to the array list
    public Vertex addVertex(String data){
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    // connect one vertex to another
    public void addEdge(Vertex vertex1, Vertex vertex2, Integer weight){
        if(!this.isWeighted){
            weight = null;
        }

        vertex1.addEdge(vertex2, weight);
        if(!this.isDirected){
            // connecting both sides
            vertex2.addEdge(vertex1,weight);
        }
    }

    public void removeEdge(Vertex vertex1, Vertex vertex2){
        vertex1.removeEdge(vertex2);
        if(!this.isDirected){
            vertex2.removeEdge(vertex1);
        }
    }

    public void removeVertex(Vertex vertex){
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

    public Vertex getVertexByValue(String value){
        for(Vertex v : this.vertices){
            if(v.getData() == value){
                return v;
            }
        }
        return null;
    }


    public void print(){
        for (Vertex v : this.vertices){
            v.print(isWeighted);
        }
    }

    public static void main(String[] args) {
        Graph busNetwork = new Graph(true, false);
        Vertex cliftonStation = busNetwork.addVertex("Clifton");
        Vertex capeMayStation = busNetwork.addVertex("Cape May");
        Vertex badliStation = busNetwork.addVertex("Badli");
        Vertex rohiniStation = busNetwork.addVertex("Rohini");
        Vertex sec16Station = busNetwork.addVertex("Sec 16");
        Vertex sec18Station = busNetwork.addVertex("Sec 18");

        busNetwork.addEdge(cliftonStation, capeMayStation, 1000);

        busNetwork.addEdge(badliStation, rohiniStation, 50);
        busNetwork.addEdge(rohiniStation,sec18Station, 100);
        busNetwork.addEdge(rohiniStation, sec16Station, 150);


        busNetwork.print();
    }
}
