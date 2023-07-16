import java.util.ArrayList;

public class Vertice {
    private Paciente data;
    private Tratamiento dataT;
    private Doctor dataD;
    private String resultado;
    private ArrayList<Edge> edges;//lista de aristas
    private boolean visited;
    public Vertice(Paciente inputData){
        this.data=inputData;
        this.edges=new ArrayList<Edge>();
    }
    public Vertice(Doctor inputData){
        this.dataD=inputData;
        this.edges=new ArrayList<Edge>();
    }
    public Vertice(Tratamiento inputData){
        this.dataT=inputData;
        this.edges=new ArrayList<Edge>();
    }
    public Vertice(String resultado){
        this.resultado=resultado;
        this.edges=new ArrayList<Edge>();
    }
    public void addEdge(Vertice finalVertice,int weight){//solo el final porque el incial ya lo tengo
        this.edges.add(new Edge(this,finalVertice,weight));
    }
    public void removeEdge(Vertice finalVertice){
        this.edges.removeIf(edge -> edge.getFinalVertice().equals(finalVertice));
    }

    public Paciente getData() {
        return data;
    }

    public Tratamiento getDataT() {
        return dataT;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Doctor getDataD() {
        return dataD;
    }

    public ArrayList<Edge> getEdges(){
        return this.edges;
    }
    public String print(boolean showWeight){
        String message="";
        if (this.edges.size()==0 ){
            if (this.data !=null){
                message += this.data.toString()+"-->" ;
            }
            if (this.dataD !=null){
                message += this.dataD.toString()+"-->" ;
            }
            if (this.dataT !=null){
                message += this.dataT.toString()+"-->" ;
            }
            return message;
        }
        for (int i=0;i<this.edges.size();i++){
            if(i==0){
                message += this.edges.get(i).getInitialVertice().data.toString()+"-->";
                message += this.edges.get(i).getInitialVertice().dataD.toString()+"-->";
                message += this.edges.get(i).getInitialVertice().dataT.toString()+"-->";
            }
            message += this.edges.get(i).getFinalVertice().data.toString();
            message += this.edges.get(i).getFinalVertice().data.toString();
            message += this.edges.get(i).getFinalVertice().dataT.toString();
        }
        return message;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }
}
