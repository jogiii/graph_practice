package java.practice.graph;

public class Edge {

    private Vertex end;
    private Vertex start;
    Integer weight;


    public Edge(Vertex startV, Vertex endV, Integer inputWeight){
        this.end = endV;
        this.start = startV;
        this.weight = inputWeight;
    }

    public Vertex getStart(){
        return this.start;
    }

    public Vertex getEnd(){
        return  this.end;
    }

    public Integer getWeight(){
        return this.weight;
    }





}
