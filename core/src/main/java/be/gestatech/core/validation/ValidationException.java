package be.gestatech.core.validation;

import javax.ejb.ApplicationException;

/**
 * Created by amuri on 5/17/2017.
 */
@ApplicationException(rollback = true)
public class ValidationException extends RuntimeException {

    private static final long serialVersionUID = -5639227266352431482L;
    private ValidationResult result;

    public ValidationException(ValidationResult result) {
        this.result = result;
    }

    public ValidationResult getResult() {
        return result;
    }
}