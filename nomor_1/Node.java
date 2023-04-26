package nomor_1;

public class Node {

   private int data;
   private Node next;
   private Node prev;

   public Node(int value) {
      this.data = value;
      this.prev = this.next = null;
   }

   public int getData() {
      return data;
   }

   public Node getNext() {
      return next;
   }

   public Node getPrev() {
      return prev;
   }

   public void setData(int data) {
      this.data = data;
   }

   public void setNext(Node next) {
      this.next = next;
   }

   public void setPrev(Node prev) {
      this.prev = prev;
   }

   @Override
   public String toString() {
      return String.format("%d", data);
   }

}