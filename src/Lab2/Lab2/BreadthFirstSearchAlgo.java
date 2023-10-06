package Lab2.Lab2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class BreadthFirstSearchAlgo implements ISearchAlgo {
    @Override
    public Node execute(Node root, String goal) {
        Queue<Node> queue = new LinkedList<>();
        Set<Node> visited= new HashSet<>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.getLabel().equals(goal)){
                return current;
            }

            visited.add(current);
            for(Node neighbor: current.getChildrenNodes()){
                if(!visited.contains(neighbor)){
                    queue.add(neighbor);
                }
            }
        }

        return null;
    }

    @Override
    public Node execute(Node root, String start, String goal) {
        return null;
    }
}
