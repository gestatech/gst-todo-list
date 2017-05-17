package be.gestatech.core.validation;

import java.util.*;

/**
 * Created by amuri on 5/17/2017.
 */
public class ValidationResult {

    private Map<String, List<String>> errorsByField = new HashMap<>();

    public void addError(final String field, final String error) {
        List<String> errors = errorsByField.get(field);
        if (Objects.isNull(errors)) {
            errors = new ArrayList<>();
            errorsByField.put(field, errors);
        }
        errors.add(error);
    }

    public Map<String, List<String>> getErrors() {
        return errorsByField;
    }

    public boolean hasErrors() {
        return !errorsByField.isEmpty();
    }
}
