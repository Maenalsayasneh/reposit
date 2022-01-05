package m0.l.f.a;

import m0.l.c;
import m0.l.e;

/* compiled from: ContinuationImpl.kt */
public final class a implements c<Object> {
    public static final a c = new a();

    public e getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public void resumeWith(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    public String toString() {
        return "This continuation is already complete";
    }
}
