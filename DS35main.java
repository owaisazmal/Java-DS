public class DS35main {
    public static void main(String[] args) {
        DS35BinarySearchTree tree = new DS35BinarySearchTree();

        tree.insert(new DS35Node(5));
        tree.insert(new DS35Node(4));
        tree.insert(new DS35Node(2));
        tree.insert(new DS35Node(3));
        tree.insert(new DS35Node(8));
        tree.insert(new DS35Node(12));
        tree.insert(new DS35Node(6));
        tree.insert(new DS35Node(16));

        tree.remove(2);
        tree.display();
        System.out.println(tree.search(5));
    }
}
