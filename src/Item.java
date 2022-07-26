
public class Item {
    private String name;
    private Item next,prev;

    public Item(String name){
        this.name=name;
    }

    public void setname(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public void setNext(Item next){
        this.next=next;
    }

    public Item getNext(){
        return next;
    }

    public Item getPrev() {
        return prev;
    }

    public void setPrev(Item prev) {
        this.prev = prev;
    }
}