class MyLinkedList {

    static class Node{
        int val;
        Node next;
        Node prev;
        Node(int x){
            this.val = x;
            this.next = null;
        }
    }
    private Node head, tail;
    private int size;
    
    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        Node current;
        if (index < size / 2) {
            current = head;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
        } else {
            current = tail;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
        }
        return current.val;
    }
    
    public void addAtHead(int val) {
        Node headNode = new Node(val);
        headNode.next = head;
        if (head != null) {
            head.prev = headNode;
        } else {
            tail = headNode;
        }
        head = headNode;
        size++;
    }
    
    public void addAtTail(int val) {
        Node tailNode = new Node(val);
        tailNode.prev = tail;
        if (tail != null) {
            tail.next = tailNode;
        } else {
            head = tailNode;
        }
        tail = tailNode;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index <= 0) {
            addAtHead(val);
        } else if (index == size) {
            addAtTail(val);
        } else {
            Node newNode = new Node(val);
            Node current;
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index - 1; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size; i > index; i--) {
                    current = current.prev;
                }
            }
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
            newNode.prev = current;
            size++;
        }
    }
    
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            if (head.next != null) {
                head = head.next;
                head.prev = null;
            } else {
                head = tail = null;
            }
        } else if (index == size - 1) {
            if (tail.prev != null) {
                tail = tail.prev;
                tail.next = null;
            } else {
                head = tail = null;
            }
        } else {
            Node current;
            if (index < size / 2) {
                current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }
            } else {
                current = tail;
                for (int i = size - 1; i > index; i--) {
                    current = current.prev;
                }
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size--;
    }
}
