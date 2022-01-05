package m0.r.t.a.r.e.a.x;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: typeQualifiers.kt */
public final class e {
    public static final e a = null;
    public static final e b = new e((NullabilityQualifier) null, (MutabilityQualifier) null, false, false, 8);
    public final NullabilityQualifier c;
    public final MutabilityQualifier d;
    public final boolean e;
    public final boolean f;

    public e(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2) {
        this.c = nullabilityQualifier;
        this.d = mutabilityQualifier;
        this.e = z;
        this.f = z2;
    }

    public e(NullabilityQualifier nullabilityQualifier, MutabilityQualifier mutabilityQualifier, boolean z, boolean z2, int i) {
        z2 = (i & 8) != 0 ? false : z2;
        this.c = nullabilityQualifier;
        this.d = mutabilityQualifier;
        this.e = z;
        this.f = z2;
    }
}
