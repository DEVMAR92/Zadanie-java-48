public class DigitsSum {

    private int result = 0;
    private int number;

    int sumOfDigits() {
        result = 0;
        while (number != 0) {
            result = result + number % 10;
            number = number / 10;
        }
        return result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
