public class Main {

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();

        Item a = new Item("monjed");
        Item b = new Item("nidal");
        Item c = new Item("maswadeh");


        list.insertAtTail(a);
        list.insertAtTail(b);
        list.insertAtTail(c);

        list.print();
    }



}
