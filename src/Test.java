import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DigitsSum sum1 = new DigitsSum();
        System.out.println("Podaj liczbę");
        sum1.setNumber(input.nextInt());

        sum1.sumOfDigits();

        System.out.println("Suma cyfr tej liczby to: " + sum1.getResult());

    }
}
