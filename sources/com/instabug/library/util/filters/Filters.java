package com.instabug.library.util.filters;

import com.instabug.library.internal.storage.cache.db.userAttribute.UserAttributeCacheManager;
import i0.j.e.d1.d.g;
import i0.j.e.d1.d.h.a;
import i0.j.e.d1.d.h.b;
import java.util.Objects;

public class Filters<T> {
    private T t;

    private Filters(T t2) {
        this.t = t2;
    }

    public static <T> Filters<T> applyOn(T t2) {
        return new Filters<>(t2);
    }

    public Filters<T> apply(Filter<T> filter) {
        this.t = filter.apply(this.t);
        return this;
    }

    public void thenDo(a<T> aVar) {
        aVar.apply(this.t);
    }

    public <N> N thenDoReturn(b<T, N> bVar) {
        T t2 = this.t;
        Objects.requireNonNull((g) bVar);
        String str = (String) t2;
        if (str == null) {
            return null;
        }
        return UserAttributeCacheManager.retrieve(str);
    }

    public T thenGet() {
        return this.t;
    }
}
