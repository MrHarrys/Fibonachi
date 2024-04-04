import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Enter size of Fibonachi series: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        try {
            System.out.printf(processFibonachi(size, "0"));
        } catch (Exception e) {
            System.out.printf("Exception " + e);
        }
    }

    private static String processFibonachi(int size, String series){
        long previous = 0; long current = 1;
        for (int i = 0; i < size; i++){
            long oldPrevious = previous;
            previous = current;
            current = oldPrevious + current;
            series += ", " + previous;
        }
        return series;
    }
}