//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Scanner;

class Program {
    Program() {
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        int var2 = 2;
        int var3 = 0;
        System.out.println("enter the number of numbers: ");
        int var4 = var1.nextInt();
        System.out.println("enter " + var4 + " numbers");
        int var5 = var1.nextInt();

        for(int var6 = var1.nextInt(); var2 < var4; ++var2) {
            int var7 = var1.nextInt();
            if(var6 > var5 && var6 > var7) {
                ++var3;
                var5 = var6;
                var6 = var7;
            } else {
                var5 = var6;
                var6 = var7;
            }
        }

        System.out.println("number of local max: " + var3);
    }
}
