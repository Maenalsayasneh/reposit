package n0.a;

import i0.j.f.p.h;
import java.lang.Thread;
import java.util.List;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import m0.l.e;
import m0.r.t.a.r.m.a1.a;

/* compiled from: CoroutineExceptionHandlerImpl.kt */
public final class e0 {
    public static final List<CoroutineExceptionHandler> a = SequencesKt___SequencesKt.j(a.X(a.a()));

    public static final void a(e eVar, Throwable th) {
        Throwable th2;
        for (CoroutineExceptionHandler handleException : a) {
            try {
                handleException.handleException(eVar, th);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
                if (th == th3) {
                    th2 = th;
                } else {
                    th2 = new RuntimeException("Exception while trying to handle coroutine exception", th3);
                    h.m(th2, th);
                }
                uncaughtExceptionHandler.uncaughtException(currentThread, th2);
            }
        }
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }
}
