package m0.r.t.a.r.e.b.t;

import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import m0.r.t.a.r.e.b.t.a;

/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class d extends a.b {
    public final /* synthetic */ a.d b;

    public d(a.d dVar) {
        this.b = dVar;
    }

    public void e(String[] strArr) {
        if (strArr != null) {
            a.this.h = strArr;
        } else {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{MessageExtension.FIELD_DATA, "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
        }
    }
}
