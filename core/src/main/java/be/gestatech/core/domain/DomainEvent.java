package be.gestatech.core.domain;

import be.gestatech.core.shared.DataObject;

/**
 * Created by amuri on 5/17/2017.
 */
public interface DomainEvent<T extends DomainEvent<T>> extends DataObject {

    boolean sameEventAs(T other);
}
