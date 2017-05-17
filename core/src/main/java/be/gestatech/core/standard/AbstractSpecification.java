package be.gestatech.core.standard;

/**
 * Created by amuri on 5/17/2017.
 */
public abstract class AbstractSpecification<T> implements Specification<T> {

    @Override
    public abstract boolean isSatisfiedBy(T object);

    @Override
    public Specification<T> and(final Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    @Override
    public Specification<T> or(final Specification<T> specification) {
        return new OrSpecification<>(this, specification);
    }

    @Override
    public Specification<T> not(final Specification<T> specification) {
        return new NotSpecification<>(specification);
    }

    @Override
    public Specification<T> xor(final Specification<T> specification) {
        return new XorSpecification<>(this, specification);
    }

    @Override
    public Specification<T> nand(final Specification<T> specification) {
        return new NandSpecification<>(this, specification);
    }

    @Override
    public Specification<T> nor(final Specification<T> specification) {
        return new NorSpecification<>(this, specification);
    }
}