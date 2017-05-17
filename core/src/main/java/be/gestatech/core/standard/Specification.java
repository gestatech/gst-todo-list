package be.gestatech.core.standard;

/**
 * Created by amuri on 5/17/2017.
 */
public interface Specification<T> {

    boolean isSatisfiedBy(T object);

    Specification<T> and(Specification<T> spec);

    Specification<T> or(Specification<T> spec);

    Specification<T> not(Specification<T> spec);

    Specification<T> xor(Specification<T> spec);

    Specification<T> nand(Specification<T> spec);

    Specification<T> nor(Specification<T> spec);
}
