package kotlinx.coroutines;

import m0.l.e;

/* compiled from: CoroutineExceptionHandler.kt */
public interface CoroutineExceptionHandler extends e.a {
    public static final /* synthetic */ int j = 0;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a implements e.b<CoroutineExceptionHandler> {
        public static final /* synthetic */ a c = new a();
    }

    void handleException(e eVar, Throwable th);
}
