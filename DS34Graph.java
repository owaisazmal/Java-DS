import java.util.ArrayList;
import java.util.LinkedList;

public class DS34Graph {
    
    ArrayList<LinkedList<DS33Node>> alist;

    DS34Graph(){
        alist = new ArrayList<>();
    }

    public void addNode(DS33Node node){
        LinkedList<DS33Node> currentList = new LinkedList<>();
        currentList.add(node);
        alist.add(currentList);
    }

    public void addEdge(int src, int dst){
        LinkedList<DS33Node> currentList = alist.get(src);
        DS33Node dstNode = alist.get(dst).get(0);
        currentList.add(dstNode);
    }

    public boolean checkEdge(int src, int dst){
        LinkedList<DS33Node> currentList = alist.get(src);
        DS33Node dstNode = alist.get(dst).get(0);

        for(DS33Node node: currentList){
            if(node == dstNode){
                return true;
            }
        }
        return false;
    }
    public void print(){
        for(LinkedList<DS33Node> curreList: alist){
            for(DS33Node node: curreList){
                System.out.print(node.data + "->");
            }
            System.out.println();
        }
    }
}
