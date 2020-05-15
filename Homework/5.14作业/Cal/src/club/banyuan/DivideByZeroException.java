package club.banyuan;

class DivideByZeroException extends CalculatorException {
    public DivideByZeroException() {
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}