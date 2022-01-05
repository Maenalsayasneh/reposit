package kotlin.reflect.jvm.internal.impl.utils;

import m0.n.b.i;

public class WrappedValues {
    public static final Object a = new a();

    public static class WrappedProcessCanceledException extends RuntimeException {
    }

    public static class a {
        public String toString() {
            return "NULL_VALUE";
        }
    }

    public static final class b {
        public final Throwable a;

        public b(Throwable th, a aVar) {
            if (th != null) {
                this.a = th;
            } else {
                a(0);
                throw null;
            }
        }

        public static /* synthetic */ void a(int i) {
            String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i != 1 ? 3 : 2)];
            if (i != 1) {
                objArr[0] = "throwable";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            }
            if (i != 1) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/WrappedValues$ThrowableWrapper";
            } else {
                objArr[1] = "getThrowable";
            }
            if (i != 1) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
        }

        public String toString() {
            return this.a.toString();
        }
    }

    public static <V> V a(Object obj) {
        b(obj);
        if (obj == a) {
            return null;
        }
        return obj;
    }

    public static <V> V b(Object obj) {
        if (!(obj instanceof b)) {
            return obj;
        }
        Throwable th = ((b) obj).a;
        if (th != null) {
            i.e(th, "e");
            throw th;
        }
        b.a(1);
        throw null;
    }
}
