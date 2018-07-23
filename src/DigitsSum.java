public class DigitsSum {


    int sumOfDigits(int number) {
        int result = 0;
        while (number != 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }
}
