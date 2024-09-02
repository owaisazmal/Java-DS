import java.util.ArrayList;

public class DS33Graph {
    //Adjacency Matrix: A 2D array to store 1's/0's to represent edges
    //                  # of rows = # unique nodes
    //                  # of columns = # of unique nodes\

    ArrayList<DS33Node> nodes;
    int[][] matrix;

    DS33Graph(int size){
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }
    public void addNode(DS33Node node){
        nodes.add(node);
    }

    public void addEdge(int src, int dst){
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst){
        if(matrix[src][dst] == 1){
            return true;
        }
        else{
            return false;
        }
    }

    public void print(){
        System.out.print("  "); 
        for(DS33Node node: nodes){
            System.out.print(node.data + " ");
        }
        System.out.println();

        for(int i = 0; i<matrix.length; i++){
            System.out.print(nodes.get(i).data + " ");
            for(int j = 0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();

        }
    }

    public void depthFirstSearch(int src){
        boolean[] visited = new boolean[matrix.length];
        DFSHelper(src, visited);
    }

    public void DFSHelper(int src, boolean[] visited){
        if(visited[src] == true){
            return;
        }
        else{
            visited[src] = true;
            System.out.println(nodes.get(src).data + " = visited");
        }
        for(int i = 0; i<matrix[src].length; i++){
            if(matrix[src][i] == 1){
                DFSHelper(i, visited);
            }
        }return;
    }

}
