package be.gestatech.core.validation;

/**
 * Created by amuri on 5/17/2017.
 */
public interface Validatable {
    <T>ValidationResult validate(T objectToValidate);
    <T>void validateThrowIfError(T objectToValidate);
}