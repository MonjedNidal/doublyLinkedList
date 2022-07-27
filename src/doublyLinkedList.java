public class doublyLinkedList {

    Item root;

    public doublyLinkedList() {
        root = null;
    }

    public void insertAtHead(Item item){
        if (root == null){
            root = item;
        }else {
            root.setPrev(item);
            item.setNext(root);
            root = item;
            root.setPrev(null);
        }
    }

    public void insertAtTail(Item item){
        Item current = root;

        if (root == null) {
            insertAtHead(item);
        }
        else{
            while (current.getNext() != null){
                current = current.getNext();
            }
            current.setNext(item);
            item.setPrev(current);
            item.setNext(null);
        }
    }

    public void insertInOrder(Item node){
        Item current = root;
        Item previous = null;

        while (current != null && current.getName().compareTo(node.getName()) < 0) {
            previous = current;
            current = current.getNext();
        }

        if (current == null && previous == null){
            root = node;
        }
        else if (current != null && previous == null){
            root = node;
            node.setNext(current);
            current.setPrev(node);
        }else if ( current == null){
            previous.setNext(node);
            node.setPrev(previous);
        }else{
            node.setNext(current);
            node.setPrev(previous);
            previous.setNext(node);
            current.setPrev(node);

        }

    }

    public void print() {
        Item current;
        for (current = root; current != null; current = current.getNext()) {
            System.out.println(current.getName());
        }
    }

}
