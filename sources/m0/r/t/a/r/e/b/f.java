package m0.r.t.a.r.e.b;

import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import m0.n.b.i;

/* compiled from: methodSignatureMapping.kt */
public abstract class f {
    public static final f a = null;
    public static final c b = new c(JvmPrimitiveType.BOOLEAN);
    public static final c c = new c(JvmPrimitiveType.CHAR);
    public static final c d = new c(JvmPrimitiveType.BYTE);
    public static final c e = new c(JvmPrimitiveType.SHORT);
    public static final c f = new c(JvmPrimitiveType.INT);
    public static final c g = new c(JvmPrimitiveType.FLOAT);
    public static final c h = new c(JvmPrimitiveType.LONG);
    public static final c i = new c(JvmPrimitiveType.DOUBLE);

    /* compiled from: methodSignatureMapping.kt */
    public static final class a extends f {
        public final f j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(f fVar) {
            super((m0.n.b.f) null);
            i.e(fVar, "elementType");
            this.j = fVar;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class b extends f {
        public final String j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super((m0.n.b.f) null);
            i.e(str, "internalName");
            this.j = str;
        }
    }

    /* compiled from: methodSignatureMapping.kt */
    public static final class c extends f {
        public final JvmPrimitiveType j;

        public c(JvmPrimitiveType jvmPrimitiveType) {
            super((m0.n.b.f) null);
            this.j = jvmPrimitiveType;
        }
    }

    public f() {
    }

    public String toString() {
        return h.a.a(this);
    }

    public f(m0.n.b.f fVar) {
    }
}
