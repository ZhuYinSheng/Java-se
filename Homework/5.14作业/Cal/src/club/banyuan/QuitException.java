package club.banyuan;

class QuitException extends CalculatorException {
    public QuitException() {

    }

    public QuitException(String message) {
        super(message);
    }
}
