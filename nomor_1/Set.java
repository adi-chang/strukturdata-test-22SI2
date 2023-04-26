package nomor_1;

public class Set {
   
   private Node head;
   private Node tail;
   private int count;

   public Set() { 
      head = tail = null;
      count = 0;
   }

   public Node getHead() {
      return head;
   }

   public Node getTail() {
      return tail;
   }

   public int getCount() {
      return count;
   }

   public boolean isEmpty() {
      // write your code 
      return false;
   }

   public int count() { 
      // write your code
      return 0; 
   }

   public boolean contain(int value) {
      // write your code
      return false;
   }

   public void add(int value) {
      // write your code
   }

   public boolean remove(int value) {
      // write your code
      return false;
   }

   public Set intersection(Set anotherSet) {
      // write your code
      return null;
   }

   public Set union(Set anotherSet) {
      // write your code
      return null;
   }

   public boolean isSubset(Set anotherSet) {
      // write your code
      return false;
   }

   public boolean isSuperset(Set anotherSet) {
      // write your code
      return false;
   } 

   public boolean isDisjoint(Set anotherSet) {
      // write your code
      return false;
   }

   public void clear() {
      // write your code
   }

   public void print() {
      if (!isEmpty()) {
         Node p = head;
         while (p != null) {
            System.out.print(String.format("%d, ", p.getData()));
            p = p.getNext();
         }
         System.out.println();
      }
      else {
         System.out.println("Empty SET");
      }
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      if (!isEmpty()) {
         Node p = head;
         while (p != null) {
            sb.append(String.format("%d, ", p.getData()));
            p = p.getNext();
         }
      }
      return sb.toString();
   }

}
