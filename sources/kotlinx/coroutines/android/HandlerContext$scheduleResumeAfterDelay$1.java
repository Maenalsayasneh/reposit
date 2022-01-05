package kotlinx.coroutines.android;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HandlerDispatcher.kt */
public final class HandlerContext$scheduleResumeAfterDelay$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ HandlerContext c;
    public final /* synthetic */ Runnable d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HandlerContext$scheduleResumeAfterDelay$1(HandlerContext handlerContext, Runnable runnable) {
        super(1);
        this.c = handlerContext;
        this.d = runnable;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.d.removeCallbacks(this.d);
        return i.a;
    }
}
