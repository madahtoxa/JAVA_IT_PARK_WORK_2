import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Введите колчество чисел");
        int n = scanner.nextInt();
        System.out.println("Введите числа");
        int min = scanner.nextInt();
        while (i < n) {
            int x = scanner.nextInt();
            if (x < min) {
                min = x;
            }
            i++;
        }
        System.out.println("Минимальное число: " + min);
    }
}
