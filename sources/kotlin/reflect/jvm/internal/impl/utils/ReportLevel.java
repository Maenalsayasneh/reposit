package kotlin.reflect.jvm.internal.impl.utils;

import m0.n.b.f;

/* compiled from: JavaTypeEnhancementState.kt */
public enum ReportLevel {
    IGNORE("ignore"),
    WARN("warn"),
    STRICT("strict");
    
    public static final a Companion = null;
    private final String description;

    /* compiled from: JavaTypeEnhancementState.kt */
    public static final class a {
        public a(f fVar) {
        }
    }

    /* access modifiers changed from: public */
    static {
        Companion = new a((f) null);
    }

    private ReportLevel(String str) {
        this.description = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean isIgnore() {
        return this == IGNORE;
    }

    public final boolean isWarning() {
        return this == WARN;
    }
}
