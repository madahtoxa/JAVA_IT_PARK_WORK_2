import java.util.Scanner;

class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 1;
        System.out.println("Введите количество чисел");
        int n = scanner.nextInt();
        System.out.println("Введине числа");
        int min = scanner.nextInt();
        int summa = min;
        while (i < n) {
            int a = scanner.nextInt();
            summa = summa+a;
            i++;
        }
        int average = summa / n;
        System.out.println("Среднее число " + average);
    }

}