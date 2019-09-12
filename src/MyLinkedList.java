public class MyLinkedList {
    private Node head;
    public int numNodes = 0;

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public MyLinkedList() {
    }

    public MyLinkedList(Object data) {
        head = new Node(data);
        head.next = null;
        this.numNodes++;
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;

    }

    public void addLast(Object data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        numNodes++;

    }

    public void remove(int index) {
        if (head == null)
            return;
        Node temp = head;
        if (index == 0) {
            head = temp.next;
            return;
        }
        for (int i = 0; temp != null && i < index - 1; i++)
            temp = temp.next;
        if (index > numNodes - 1)
            temp.next = temp.next.next;

    }


    public Node get(int index) {
        if(index == 0){
            return head;
        }
        Node temp = head.next;
        for (int i = 1; i < index; i++)
            temp = temp.next;
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public boolean contain(Object data) {
        boolean result = false;
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(data)) {
                result = true;
                break;
            } else {
                temp = temp.next;
            }
        }
        return result;
    }

    public int indexOf(Object data) {
        int index = 0;
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.data.equals(data)) {
                break;
            } else {
                temp = temp.next;
                index++;
                if (index>numNodes-1)
                    index = -1;
            }
        }
        return index;
    }
    public void clear(){
        head = null;
    }
    public Node getFirst(){
        return head;
    }

}

