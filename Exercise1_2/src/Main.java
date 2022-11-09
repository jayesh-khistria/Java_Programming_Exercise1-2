import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        //System.out.print("Enter Numbers :-  " + a );
        int b = scan.nextInt();
        //System.out.print("Enter Numbers :-  " + b );
        int c = scan.nextInt();
        //System.out.print("Enter Numbers :-  " + c );
        double x = scan.nextDouble();
        //System.out.print("Enter Numbers :-  " + x );

        double a1 = a;
        double b1 = b;
        double c1 = c;

        double x1 = x * x * x;
        double x2 = x * x;

        double sum = ((a1+b1)/2)* x1 + (a1+b1)*(a1+b1) * x2 + (a1 + b1 + c1);
       // double sum = ((a + b) / 2) * (x1) + ((a + b) * (a + b)) * x2 + a + b + c;

        System.out.println("Your Answer is :- " + sum);
    }
}


