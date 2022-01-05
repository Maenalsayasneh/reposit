package com.clubhouse.android.di;

import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import n0.c.l.c;
import n0.c.m.b;

/* compiled from: ApiModule.kt */
public final class ApiModule$provideJson$1 extends Lambda implements l<c, i> {
    public final /* synthetic */ b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ApiModule$provideJson$1(b bVar) {
        super(1);
        this.c = bVar;
    }

    public Object invoke(Object obj) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, "$this$Json");
        cVar.e = true;
        cVar.b = true;
        b bVar = this.c;
        m0.n.b.i.e(bVar, "<set-?>");
        cVar.k = bVar;
        cVar.a = true;
        return i.a;
    }
}
