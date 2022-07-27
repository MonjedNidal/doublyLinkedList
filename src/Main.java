public class Main {

    public static void main(String[] args) {
        doublyLinkedList list = new doublyLinkedList();

        Item a = new Item("monjed");
        Item b = new Item("nidal");
        Item c = new Item("maswadeh");
        Item d = new Item("maswadeh");

        list.insertInOrder(a);
        list.insertInOrder(b);
        list.insertInOrder(c);

        list.delete(b);
//        list.delete(c);
//        list.insertInOrder(d);

        list.print();
    }
}
