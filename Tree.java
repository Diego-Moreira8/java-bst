import java.util.Arrays;

public class Tree {
    private Node root;

    Tree(int[] numbersArray) {
        Arrays.sort(numbersArray);
        this.root = buildTree(numbersArray);
    }

    public Node getRoot() {
        return root;
    }

    public Node buildTree(int[] array) {
        if (array.length == 1) {
            return new Node(array[0]);
        } else if (array.length == 2) {
            Node newNode = new Node(array[0]);
            newNode.setRight(new Node(array[1]));
            return newNode;
        } else {
            int middleIndex = array.length / 2;
            int[] leftArray = Arrays.copyOfRange(array, 0, middleIndex);
            int[] rightArray = Arrays.copyOfRange(array, middleIndex + 1, array.length);

            Node root = new Node(array[middleIndex]);
            root.setLeft(this.buildTree(leftArray));
            root.setRight(this.buildTree(rightArray));

            return root;
        }
    }

    public void prettyPrint(Node node, String prefix, boolean isLeft) {
        // Prints the tree in a structured format.
        if (node.getRight() != null) {
            prettyPrint(node.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }
        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.getContent());
        if (node.getLeft() != null) {
            prettyPrint(node.getLeft(), prefix + (isLeft ? "    " : "│   "), true);
        }
    }

    public void insert(int content) {
        this.root = insertRecursive(this.root, content);
    }

    private Node insertRecursive(Node root, int content) {
        if (root == null) {
            root = new Node(content);
            return root;
        }

        if (content < root.getContent()) {
            root.setLeft(insertRecursive(root.getLeft(), content));
        } else if (content > root.getContent()) {
            root.setRight(insertRecursive(root.getRight(), content));
        }

        return root;
    }
}
