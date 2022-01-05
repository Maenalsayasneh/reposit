package com.clubhouse.android.di.user;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.t.a.r.m.a1.a;
import n0.a.f0;

/* compiled from: UserModule.kt */
public final class UserModule$provideCoroutineScope$1$1 extends Lambda implements l<Throwable, i> {
    public final /* synthetic */ f0 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserModule$provideCoroutineScope$1$1(f0 f0Var) {
        super(1);
        this.c = f0Var;
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        a.n0(this.c, (CancellationException) null, 1);
        return i.a;
    }
}
