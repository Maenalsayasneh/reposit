package m0.r.t.a.r.e.b.t;

import m0.r.t.a.r.e.b.t.a;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class c extends a.b {
    public final /* synthetic */ a.c b;

    public c(a.c cVar) {
        this.b = cVar;
    }

    public void e(String[] strArr) {
        if (strArr != null) {
            a.this.i = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
        }
    }
}
