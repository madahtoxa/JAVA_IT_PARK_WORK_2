import java.util.Scanner;
class Program {
	public static void main(String args[]) {
	
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(); 
		// пока i больше 0	
		while (a >= 0) {
			// выводим i
			if (a % 2 == 0) { 
			System.out.println(a); 
			} else 
				{
				System.out.println (" ");
				}
			// уменьшаем на 1
			a = a - 1; // i -= 1; i--;
		}
	}
}