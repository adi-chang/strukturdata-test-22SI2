package nomor_2;

public class Demo {

   private static int getTotal10IndexPrimaPertama(int...data) {
      int total = 0;
      // write your code
      return total;
   }

   private static MaximumValueAndFrekuensi getMaximumValueAndFrekuensi(int...data) {
      // write your code
      return null;
   }  
   
   private static IndexAndValue getIndexAndValueByNim(String nim, int...data) {
      // write your code
      return null;
   }

   public static void main(String[] args) {
      
      int[] data = {2, 4, 100, 25, 100, 81, 54, 50, 7, 59, 41, 17, 26, 56, 52, 59, 47, 15, 45, 24, 5, 6, 36, 40, 90, 76, 31, 13, 95, 88, 18, 28, 64, 16, 48, 14, 9, 100, 78, 18, 42, 79, 39, 100, 51, 55, 29, 68, 48, 63, 44, 33, 5, 31, 21, 3, 16, 63, 92, 46, 8, 41, 17, 1, 38, 34, 40, 43, 97, 57, 55, 95, 55, 37, 20, 30, 35, 49, 25, 22, 19, 58, 27, 53, 85, 54, 11, 14, 100, 12, 37, 24, 58, 32, 23, 56, 70, 67, 25, 56};

      int c = 0;
      int total = 0;

      System.out.println("Data:");
      for (int x : data) {
         total += x;
         System.out.print(String.format("%3d ", x));
         if (++c == 20) {
            System.out.println();
            c = 0;
         }
      }
      System.out.println();

      System.out.println(String.format("Total Jumlah Data = %,d", total));

      // test 
      // write your code to test your function (working or not) 
      
   }
}

class MaximumValueAndFrekuensi {
   private int max;
   private int frek;
   public MaximumValueAndFrekuensi(int m, int f) { 
      max = m; frek = f; 
   }
   public int getMax() {
      return max;
   }
   public int getFrek() {
      return frek;
   }
}

class IndexAndValue {
   private int index;
   private int value;
   public IndexAndValue(int index, int value) {
      this.index = index;
      this.value = value;
   }
   public int getIndex() {
      return index;
   }
   public int getValue() {
      return value;
   }
}
