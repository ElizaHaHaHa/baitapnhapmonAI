package Lab2.Lab2;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class DepthFirstSearchAlgo implements ISearchAlgo {

    @Override
    public Node execute(Node root, String goal) {
        Stack<Node> stack = new Stack<>();
        Set<Node> explore= new HashSet<>();
        stack.push(root);

        while(!stack.isEmpty()) {
            Node children = stack.pop();

            if (children.getLabel().equals(goal)) {
                return children;
            }
            explore.add(children);
            for (Node neighbor : children.getChildrenNodes()) {
                if (explore.contains(neighbor)) {
                    stack.add(neighbor);
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
