package binary.search.tree;

public class Main {

    public static void main(String[] args) {

        Tree intTree = new Tree();


        System.out.println(intTree.min());
        System.out.println(intTree.max());


        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);

        intTree.traverseInOrder();

        System.out.println();

        System.out.println(intTree.get(27));
        System.out.println(intTree.get(42));
        System.out.println(intTree.get(22));

        System.out.println();
        System.out.println(intTree.min());
        System.out.println(intTree.max());

    }
}
