package club.banyuan;

class IllegalInputException extends CalculatorException {
    public IllegalInputException() {
    }

    public IllegalInputException(String message) {
        super(message);
    }
}