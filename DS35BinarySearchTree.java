public class DS35BinarySearchTree {

    DS35Node root;

    public void insert(DS35Node node){
        root = insertHelper(root, node);
    }
    private DS35Node insertHelper(DS35Node root, DS35Node node){
        int data = node.data;

        if(root == null){
            root=node;
            return root;
        }else if(data < root.data){
            root.left = insertHelper(root.left, node);
        }
        
        return null;
    }
    public void display(){

    }
    private void displayHelper(DS35Node root){
        
    }
    public boolean search(int data){
        return false;

    }
    private boolean searchHelper(DS35Node root, int data){
        return false;
    }
    public void remove(int data){

    }
    public DS35Node removeHelper(DS35Node root, int data){
        return null;
    }
    private int successor(DS35Node root){
        return 0;
    }
    private int predecessor(DS35Node root){
        return 0;
    }
}
