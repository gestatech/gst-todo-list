package be.gestatech.core.standard.domain;

import be.gestatech.core.standard.shared.DataObject;

/**
 * Created by amuri on 5/17/2017.
 */
public interface DomainEvent<T extends DomainEvent<T>> extends DataObject {

    boolean sameEventAs(T other);
}
