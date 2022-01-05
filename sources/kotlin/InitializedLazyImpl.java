package kotlin;

import java.io.Serializable;
import m0.c;

/* compiled from: Lazy.kt */
public final class InitializedLazyImpl<T> implements c<T>, Serializable {
    public final T c;

    public InitializedLazyImpl(T t) {
        this.c = t;
    }

    public T getValue() {
        return this.c;
    }

    public String toString() {
        return String.valueOf(this.c);
    }
}
