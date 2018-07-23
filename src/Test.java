import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DigitsSum sum1 = new DigitsSum();
        System.out.println("Podaj liczbę");

        int result1 = sum1.sumOfDigits(input.nextInt());

        System.out.println("Suma cyfr tej liczby to: " + result1);

    }
}
