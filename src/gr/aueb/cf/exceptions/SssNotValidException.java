package gr.aueb.cf.exceptions;

public class SssNotValidException extends Exception {

    public static final long serialVersionUId = 1L;

    public SssNotValidException(String ssn) {
        super("Ssn "+ ssn + " is not valid" );
    }
}
