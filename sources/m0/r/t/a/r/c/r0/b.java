package m0.r.t.a.r.c.r0;

/* compiled from: AnnotatedImpl */
public class b implements a {
    public final f c;

    public b(f fVar) {
        if (fVar != null) {
            this.c = fVar;
        } else {
            D(0);
            throw null;
        }
    }

    public static /* synthetic */ void D(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        if (i != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i != 1) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public f getAnnotations() {
        f fVar = this.c;
        if (fVar != null) {
            return fVar;
        }
        D(1);
        throw null;
    }
}
