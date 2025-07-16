package javaz.jive;

public class Paket1 {
   public int x;

   public Paket1() {
   }

   public void Cetak1() {
      System.out.println("Selamat menggunakan paket ya");
   }

   public void Cetak2() {
      System.out.println("Asik kan bisa pake paket");
   }

   public static void main(String[] var0) {
      Paket1 var1 = new Paket1();
      var1.Cetak1();
      var1.Cetak2();
      var1.x = 10;
      System.out.println("Nilai x: " + var1.x);
   }
}
