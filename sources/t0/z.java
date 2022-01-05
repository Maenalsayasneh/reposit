package t0;

import i0.d.a.a.a;
import java.lang.annotation.Annotation;

/* compiled from: SkipCallbackExecutorImpl */
public final class z implements y {
    public static final y a = new z();

    public Class<? extends Annotation> annotationType() {
        return y.class;
    }

    public boolean equals(Object obj) {
        return obj instanceof y;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return a.Y(y.class, a.P0("@"), "()");
    }
}
