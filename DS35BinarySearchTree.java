public class DS35BinarySearchTree {

    DS35Node root;

    public void insert(DS35Node node){
        root = insertHelper(root, node);
    }
    
    private DS35Node insertHelper(DS35Node root, DS35Node node){
        int data = node.data;
    
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }
        
        return root; // Return the root to maintain the correct tree structure
    }
    
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(DS35Node root){
        if(root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean search(int data){
        return searchHelper(root, data);

    }
    private boolean searchHelper(DS35Node root, int data){

        if(root == null){
            return false;
        }
        else if(root.data == data){
            return true;
        }
        else if(root.data > data){
            return searchHelper(root.left, data);
        }
        else{
            return searchHelper(root.right, data);
        }
    }
   
    public void remove(int data){
        if(search(data)){
            removeHelper(root, data);
        }
        else{
            System.out.println(data + " Could not be found");
        }
    }
    public DS35Node removeHelper(DS35Node root, int data){
        if(root == null){
            return root;
        }
        else if(data < root.data){
            root.left = removeHelper(root.left, data);
        }
        else if(data > root.data){
            root.right = removeHelper(root.right, data);
        }
        else{// Node found
            if(root.left == null && root.right == null){
                root = null;
            }
            else if(root.right != null){
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            }
            else{
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    private int successor(DS35Node root){ //Find the least value below the right child of this root node
        root = root.right;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
    private int predecessor(DS35Node root){//Find the greatest value below the right child of this root node
        root = root.left;
        while(root.left != null){
            root = root.left;
        }
        return root.data;
    }
}
