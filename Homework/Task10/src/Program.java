import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Введите колчество чисел");
        int n = scanner.nextInt();
        System.out.println("Введите"+" "+n+" "+"числа");
        int max = scanner.nextInt();
        while (i < n) {
            int a = scanner.nextInt();
            if (a > max) {
                max = a;
            }
            i++;
        }
        System.out.println("Min numbers: " + max);
    }
}
