import java.util.Scanner;
public class Main {
    public static double calcFutureVal(double pv, double r , int n){
        if(n == 0){
            return pv;
        }
        return calcFutureVal(pv * (1+r), r, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the present value: ");
        double presentValue = sc.nextDouble();
        System.out.println("Enter the interest rate (as decimal value)");
        double rate = sc.nextDouble(); // 5% interest rate
        System.out.println("Enter the number of years: ");
        int n = sc.nextInt();  // For 3 years
        double futureValue = calcFutureVal(presentValue,rate,n);
        System.out.println("Future Value: " + futureValue);
    }
}