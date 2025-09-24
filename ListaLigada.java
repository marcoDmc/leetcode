
public class ListaLigada {
    private Node tail;
    private Node head;
    private int length;

    public class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }

    }

    public ListaLigada(int value) {
        Node node = new Node(value);
        head = node;
        tail = node;
        this.length = 1;
    }

    public void append(int value) {
        Node node = new Node(value);

        if (length == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        length++;

    }

    public Node removeLast() {
        Node temp = head;
        Node pre = head;

        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;
        return temp;
    }

    public void prepend(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;

        }
        length++;

    }

    public Node removeFirst() {
        if (length == 0)
            return null;
        Node temp = head;
        head = head.next;
        temp.next = null;
        length--;
        if (length == 0)
            return tail = null;
        return temp;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length)
            return null;
        if (index == 0)
            return removeFirst();
        if (index == length - 1)
            return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;
        Node after = temp.next;
        Node before = null;
        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }

    public Node findKthFromEnd(int k) {
        if (k == 0)
            return null;

        Node slow = head;
        Node fast = head;

        for (int i = 0; i < k - 1; i++) {
            if (fast == null || fast.next == null)
                return null;
            fast = fast.next;
        }

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }

    public Node get(int index) {
        if (index < 0 || index >= length)
            return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length)
            return false;

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node node = new Node(value);
        Node temp = get(index - 1);
        node.next = temp.next;
        temp.next = node;
        length++;

        return true;
    }

    public boolean set(int index, int value) {
        Node node = get(index);
        if (node != null) {
            node.value = value;
            return true;
        }
        return false;
    }

    public void printlist() {
        Node temp = head;
        while (temp != null) {
            System.out.println("valores da lista --> " + temp.value);
            temp = temp.next;
        }
    }

    public Node findMiddleNode() {
        int count = 0;
        Node slow = head;
        Node fast = head;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        if (count == 0 || head == null)
            return null;

        if (count == 1)
            return slow;

        for (int i = 0; i < count; i++) {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;

            if (fast == null || fast.next == null)
                return slow;

        }
        return slow;
    }

    public boolean hasLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                return true;
        }
        return false;
    }

    public void getHead() {
        System.out.println("valor da cabeça --> " + head.value);
    }

    public void getTail() {
        System.out.println("valor da calda -->" + tail.value);
    }

    public void getLength() {
        System.out.println("tamanho da lista -->" + length);
    }

    public void removeDuplicates() {
        Node current = head;

        while (current != null) {
            Node runner = current;

            while (runner.next != null) {
                if (runner.next.value == current.value) {
                    runner.next = runner.next.next;
                    length--;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}