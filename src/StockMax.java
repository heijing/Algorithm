import java.util.Scanner;


public class StockMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int numberOfCase = sc.nextInt();
         
        for (int i = 0; i < numberOfCase; i++) {
            int number = sc.nextInt();
            int[] price = new int[number];
            for (int j = 0; j < number; j++) {
                price[j] = sc.nextInt();
            }
             
            int[] max = new int[number];
            int localmax = Integer.MIN_VALUE;
            for (int j = number-1; j >= 0; j--) {
                localmax = Math.max(localmax, price[j]);
                max[j] = localmax;
                
            }
             
            long profit = 0;
            for (int j = 0; j < number; j++) {
                
                    profit += max[j] - price[j];
    
            }
             
            System.out.println(profit);
        }
    }
}