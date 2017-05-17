package be.gestatech.core.domain;

/**
 * Created by amuri on 5/17/2017.
 */
public class OrSpecification<T> extends AbstractSpecification<T> {

    private final Specification<T> specification1;

    private final Specification<T> specification2;

    public OrSpecification(final Specification<T> specification1, final Specification<T> specification2) {
        this.specification1 = specification1;
        this.specification2 = specification2;
    }

    @Override
    public boolean isSatisfiedBy(final T object) {
        return this.specification1.isSatisfiedBy(object) || this.specification2.isSatisfiedBy(object);
    }
}
