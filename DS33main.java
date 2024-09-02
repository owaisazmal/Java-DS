public class DS33main {
    public static void main(String[] args) {
        DS33Graph graph = new DS33Graph(5);

        graph.addNode(new DS33Node('A'));
        graph.addNode(new DS33Node('B'));
        graph.addNode(new DS33Node('C'));
        graph.addNode(new DS33Node('D'));
        graph.addNode(new DS33Node('E'));

        //Refer Diagram from notes (Directed graph)
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
        System.out.println(graph.checkEdge(0, 1)); //to check if it has edge.
        graph.depthFirstSearch(1);
    } 
}
