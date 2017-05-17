package be.gestatech.core.validation;

import java.util.Set;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

/**
 * Created by amuri on 5/17/2017.
 */
public class BasicValidator implements Validatable {

    @Inject
    private Validator validator;

    @Override
    public <T>ValidationResult validate(final T objectToValidate) {
        Set<ConstraintViolation<T>> violations = validator.validate(objectToValidate);
        return create(violations);
    }

    @Override
    public <T>void validateThrowIfError(final T objectToValidate) {
        ValidationResult result = validate(objectToValidate);
        if (result.hasErrors()) {
            throw new ValidationException(result);
        }
    }

    private <T>ValidationResult create(final Set<ConstraintViolation<T>> violations) {
        ValidationResult result = new ValidationResult();
        setErrors(result, violations);
        return result;
    }

    private <T>void setErrors(final ValidationResult result, final Set<ConstraintViolation<T>> violations) {
        for (ConstraintViolation<T> violation : violations) {
            result.addError(violation.getPropertyPath().toString(), violation.getMessage());
        }
    }
}
