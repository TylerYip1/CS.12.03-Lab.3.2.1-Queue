import java.util.Queue;

public class BreadthFirstSearch {

    /** bfs will take an Adjacency List as input and return an array containing the order of nodes traversed via a Breadth First Search.
     *
     * @param graph - an Adjacency List
     * @return - an array containing the order of nodes traversed via a Breadth First Search.
     */
    public static int[] bfs(int[][] graph) {
        CISQueue<Integer> queue = new CISQueue<Integer>(0);
        int length = graph.length;
        int[] visited = new int[length];
        // Create a Queue and add the first node (0) to it. Use your Queue class that you just created!
        // Create a visited array. This array will track whether we have visited a specific node.
        // Create a bfs path array and a bfs path index. This array will track the order that the nodes were visited.
        int[] bfsPathArray = new int[length];
        int bfsPathIndex = 0;
        // Add the first node (0) to the queue.

        // Record the first node (0) as visited.
        // Time to traverse the graph! While the queue is not empty ...
        while(!queue.isEmpty()){
            int currentNode = queue.dequeue();
            visited[currentNode] = 1;
            bfsPathArray[bfsPathIndex] = currentNode;
            bfsPathIndex++;
            for(int i = 0; i < graph[currentNode].length; i++){
                if(visited[graph[currentNode][i]] == 0){
                    visited[graph[currentNode][i]] = 1;
                    queue.enqueue(graph[currentNode][i]);
                }
            }
        }
            // Dequeue (poll) the queue and store this value in a variable called currentNode.

            // Record this node as visited.

            // Add this node to the path and update the path index.

            // Obtain an array of this node's neighbouring/adjacent nodes.
        
            // Explore the current nodes neighbouring nodes. For each neighbouring node ...

                // If a neighbour hasn't been visited before ...

                    // Record the neighbour as visited.
        
                    // Add the neighbour to the queue. 

        // Return bfs path.
        return bfsPathArray;
    }
}
