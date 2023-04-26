package nomor_1;

// READONLY  
// JANGAN UBAH CODE YANG ADA DI FILE INI 

public class Demo {
   
   public static void main(String[] args) {
      
      Set s1 = new Set();
      Set s2 = new Set();

      // cek kondisi awal
      System.out.println("set1 is empty ? " + (s1.isEmpty() ? "YA" : "TIDAK"));
      System.out.println("set2 is empty ? " + (s2.isEmpty() ? "YA" : "TIDAK"));

      // print kondisi awal
      System.out.print("set1: ");
      s1.print();
      System.out.print("set2: ");
      s2.print();

      // add item to set1
      s1.add(1);
      s1.add(1);
      s1.add(2);
      s1.add(2);
      s1.add(3);
      s1.add(4);
      s1.add(5);

      System.out.println("set1: " + s1);
      System.out.println("item count set1: " + s1.count());
      
      // add item to set2
      s2.add(5);
      s2.add(6);
      s2.add(7);
      s2.add(8);
      s2.add(9);
      s2.add(0);

      System.out.println("set2: " + s2);
      System.out.println("item count set2: " + s2.count());

      // cek kondisi setelah set1 dan set2 ditambah data 
      System.out.println("set1 is empty ? " + (s1.isEmpty() ? "YA" : "TIDAK"));
      System.out.println("set2 is empty ? " + (s2.isEmpty() ? "YA" : "TIDAK"));

      // intersection
      Set s3 = s1.intersection(s2);
      System.out.println("set1 intersection s2: " + s3);
      System.out.println("banyak item hasil intersection: " + (s3 != null ? s3.count() : 0));

      // union
      Set s4 = s1.union(s2);
      System.out.println("set1 union s2: " + s4);
      System.out.println("banyak item hasil union: " + (s4 != null ? s4.count() : 0));

      // issubset 
      System.out.println("set1 subset dari set4 ? " + (s1 != null && s4 != null && s1.isSubset(s4) ? "YA" : "TIDAK"));
      System.out.println("set2 subset dari set4 ? " + (s2 != null && s4 != null && s2.isSubset(s4) ? "YA" : "TIDAK"));
      System.out.println("set1 subset dari set2 ? " + (s1 != null && s2 != null && s1.isSubset(s2) ? "YA" : "TIDAK"));

      // issuperset
      System.out.println("set4 superset dari s1 ? " + (s1 != null && s4 != null && s4.isSuperset(s1) ? "YA" : "TIDAK"));
      System.out.println("set4 superset dari s2 ? " + (s2 != null && s4 != null && s4.isSuperset(s2) ? "YA" : "TIDAK"));
      System.out.println("set1 superset dari s2 ? " + (s1 != null && s2 != null && s1.isSuperset(s2) ? "YA" : "TIDAK"));

      // isdisjoint
      System.out.println("set1 disjoint set2 ? " + (s1.isDisjoint(s2) ? "YA" : "TIDAK"));

      // remove item 5 dari set2
      if (s2.remove(5)) 
         System.out.println("item 5 berhasil dihapus dari set2");

      // cek isdisjoint kembali
      System.out.println("set1 disjoint set2 ? " + (s1.isDisjoint(s2) ? "YA" : "TIDAK"));

      // clear (hapus semua) item set1 dan set2
      s1.clear();
      s2.clear();

      // cek isi set1 dan set2
      System.out.print("set1: ");
      s1.print();
      System.out.print("set2: ");
      s2.print();
      
   }
}
