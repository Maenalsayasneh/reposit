package kotlin.reflect.jvm.internal.impl.descriptors;

import m0.n.b.f;

/* compiled from: Modality.kt */
public enum Modality {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;
    
    public static final a Companion = null;

    /* compiled from: Modality.kt */
    public static final class a {
        public a(f fVar) {
        }

        public final Modality a(boolean z, boolean z2, boolean z3) {
            if (z) {
                return Modality.SEALED;
            }
            if (z2) {
                return Modality.ABSTRACT;
            }
            if (z3) {
                return Modality.OPEN;
            }
            return Modality.FINAL;
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
    }
}
