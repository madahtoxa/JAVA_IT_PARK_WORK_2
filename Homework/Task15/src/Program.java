
public class Program {
    public static void main(String[] args) {
        int mass[] = {1,2,3,4,5,66};
        int j = 0;
        int x = 0;
        for (j = 0; x < mass.length; x++){
            if (mass[x] % 2 == 0) {
                System.out.println(mass[x]);
            };
        }
    }
}
