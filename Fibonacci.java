// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).
class Fibonacci {
   Fibonacci() {
   }

   public static void main(String[] var0) {
      byte var1 = 10;
      int var2 = 0;
      int var3 = 1;

      for(int var4 = 1; var4 <= var1; ++var4) {
         System.out.println(var2);
         int var5 = var2 + var3;
         var2 = var3;
         var3 = var5;
      }

   }
}
