package com.airbnb.mvrx;

import i0.b.b.f;
import i0.b.b.j;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: MavericksViewModel.kt */
public final class MavericksViewModel$execute$2 extends Lambda implements l<S, S> {
    public final /* synthetic */ p c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MavericksViewModel$execute$2(p pVar) {
        super(1);
        this.c = pVar;
    }

    public Object invoke(Object obj) {
        j jVar = (j) obj;
        i.e(jVar, "$receiver");
        return (j) this.c.invoke(jVar, new f((Object) null, 1));
    }
}
