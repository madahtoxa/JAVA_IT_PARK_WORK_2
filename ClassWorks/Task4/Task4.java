import java.util.Scanner; 

	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in); 
		int number = 13;
		int userNumber = scanner.nextInt();

		if (userNumber == number) {
			System.out.println("U right!");
		}
else (userNumber > number) {
	System.out.println("it >");
} 
else(userNumber < number) {
System.out.println("it <");
}
System.out.println("Not right");
}
	}
}