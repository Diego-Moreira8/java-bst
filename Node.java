public class Node {
    private int content;
    private Node left;
    private Node right;

    Node(int content) {
        this.content = content;
        this.left = null;
        this.right = null;
    }

    public int getContent() {
        return content;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
