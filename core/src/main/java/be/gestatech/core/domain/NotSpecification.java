package be.gestatech.core.domain;

/**
 * Created by amuri on 5/17/2017.
 */
public class NotSpecification<T> extends AbstractSpecification<T> {

    private final Specification<T> specification;

    public NotSpecification(final Specification<T> specification) {
        this.specification = specification;
    }

    @Override
    public boolean isSatisfiedBy(final T object) {
        return !this.specification.isSatisfiedBy(object);
    }
}
