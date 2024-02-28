public class Index {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 3, 1, 10, 0, -1, -100, 23243 };
        Tree myTree = new Tree(arr);
        myTree.prettyPrint(myTree.getRoot(), "", true);
        myTree.insert(40);
        myTree.insert(-40);
        myTree.prettyPrint(myTree.getRoot(), "", true);
    }
}
