package com.google.android.play.core.ktx;

import i0.h.a.d.a.j.p;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: TaskUtils.kt */
public final class TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ a c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskUtilsKt$runTask$$inlined$suspendCancellableCoroutine$lambda$1(a aVar, p pVar) {
        super(1);
        this.c = aVar;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.c.invoke();
        return i.a;
    }
}
