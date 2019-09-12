public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast("d");
        list.addLast("e");
        list.addLast("f");


        list.printList();
        System.out.println(list.contain(3));
        System.out.println(list.numNodes);
        System.out.println(list.indexOf(1));
        System.out.println(list.indexOf("d"));
        System.out.println(list.indexOf("g"));

        list.clear();
        list.printList();
        System.out.println(list.get(2));

    }
}
