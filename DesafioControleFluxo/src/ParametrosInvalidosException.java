public class ParametrosInvalidosException extends Exception {
    @Override
    public String getMessage() {
        return "Parâmetro 1 não pode ser MAIOR que o 2!";
    }
}
