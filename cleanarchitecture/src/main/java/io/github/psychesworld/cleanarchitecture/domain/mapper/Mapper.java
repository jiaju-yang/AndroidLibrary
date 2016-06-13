package io.github.psychesworld.cleanarchitecture.domain.mapper;

import java.util.ArrayList;
import java.util.Collection;

public abstract class Mapper<FROM, TO> {
    public abstract TO transform(FROM from);

    public Collection<TO> transform(Collection<FROM> fromCollection) {
        Collection<TO> toCollection = new ArrayList<>();
        for (FROM t1 : fromCollection) {
            toCollection.add(transform(t1));
        }
        return toCollection;
    }
}
