package m0.r.t.a.r.e.a.x;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import m0.n.b.i;
import m0.r.t.a.r.c.r0.f;
import m0.r.t.a.r.e.a.q;
import m0.r.t.a.r.g.b;

/* compiled from: typeEnhancement.kt */
public final class l {
    public static final b a;
    public static final b b;

    /* compiled from: typeEnhancement.kt */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            MutabilityQualifier.values();
            int[] iArr = new int[2];
            iArr[MutabilityQualifier.READ_ONLY.ordinal()] = 1;
            iArr[MutabilityQualifier.MUTABLE.ordinal()] = 2;
            a = iArr;
            NullabilityQualifier.values();
            int[] iArr2 = new int[3];
            iArr2[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            iArr2[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            b = iArr2;
        }
    }

    static {
        b bVar = q.o;
        i.d(bVar, "ENHANCED_NULLABILITY_ANNOTATION");
        a = new b(bVar);
        b bVar2 = q.p;
        i.d(bVar2, "ENHANCED_MUTABILITY_ANNOTATION");
        b = new b(bVar2);
    }

    public static final <T> c<T> a(T t) {
        return new c<>(t, (f) null);
    }
}
