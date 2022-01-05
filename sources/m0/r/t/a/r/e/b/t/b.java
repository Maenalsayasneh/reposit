package m0.r.t.a.r.e.b.t;

import m0.r.t.a.r.e.b.t.a;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class b extends a.b {
    public final /* synthetic */ a.c b;

    public b(a.c cVar) {
        this.b = cVar;
    }

    public void e(String[] strArr) {
        if (strArr != null) {
            a.this.h = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
        }
    }
}
