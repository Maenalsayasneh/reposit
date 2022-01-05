package n0.a.h2;

import i0.j.f.p.h;
import kotlin.Result;

/* compiled from: StackTraceRecovery.kt */
public final class s {
    public static final String a;
    public static final String b;

    static {
        Object obj;
        Object obj2;
        try {
            obj = Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName();
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        if (Result.a(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        a = (String) obj;
        try {
            obj2 = Class.forName("n0.a.h2.s").getCanonicalName();
        } catch (Throwable th2) {
            obj2 = h.l0(th2);
        }
        if (Result.a(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        b = (String) obj2;
    }
}
