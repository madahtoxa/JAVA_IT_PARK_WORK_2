
public class Program {
    public static void main(String[] args) {
        int mass[] = {1,2,3,4,5,66};
        int summ = 0;
        int x = 0;
        while (x < mass.length){
            summ += mass[x];
            x++;
        }
        double average = (double)summ/mass.length;
        System.out.println(average);
    }
}
