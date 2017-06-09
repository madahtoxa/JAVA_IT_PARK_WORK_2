import java.util.Scanner;
	class Program {
	public static void main (String Args[]) {
	Scanner scanner = new Scanner(System.in);
		int a[] = new int [6];
		a[0] = 5;
		a[1] = 2;
		a[2] = 1;
		a[3] = 5;
		a[4] = 6;
		a[5] = 7;
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int c = a[i];
		a[i] = a[j];
		a[j] = c;
		
	i=0;
		while (i<6){
			System.out.println (a[i]);
			i++;
			
		}	
} 
}