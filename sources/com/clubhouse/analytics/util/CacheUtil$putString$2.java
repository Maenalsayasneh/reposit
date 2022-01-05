package com.clubhouse.analytics.util;

import i0.j.f.p.h;
import i0.k.a.a;
import java.io.OutputStreamWriter;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;
import n0.a.f0;

@c(c = "com.clubhouse.analytics.util.CacheUtil$putString$2", f = "CacheUtil.kt", l = {}, m = "invokeSuspend")
/* compiled from: CacheUtil.kt */
public final class CacheUtil$putString$2 extends SuspendLambda implements p<f0, m0.l.c<? super a.c>, Object> {
    public final /* synthetic */ a c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CacheUtil$putString$2(a aVar, String str, String str2, m0.l.c<? super CacheUtil$putString$2> cVar) {
        super(2, cVar);
        this.c = aVar;
        this.d = str;
        this.q = str2;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        return new CacheUtil$putString$2(this.c, this.d, this.q, cVar);
    }

    public Object invoke(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        return new CacheUtil$putString$2(this.c, this.d, this.q, (m0.l.c) obj2).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        OutputStreamWriter outputStreamWriter;
        a.c cVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        a aVar = this.c;
        String str = this.d;
        synchronized (aVar) {
            aVar.b();
            aVar.z(str);
            a.d dVar = aVar.e2.get(str);
            outputStreamWriter = null;
            if (dVar == null) {
                dVar = new a.d(str, (a.C0194a) null);
                aVar.e2.put(str, dVar);
            } else if (dVar.d != null) {
                cVar = null;
            }
            cVar = new a.c(dVar, (a.C0194a) null);
            dVar.d = cVar;
            aVar.d2.write("DIRTY " + str + 10);
            aVar.d2.flush();
        }
        String str2 = this.q;
        Objects.requireNonNull(cVar);
        try {
            OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(cVar.b(0), i0.k.a.c.b);
            try {
                outputStreamWriter2.write(str2);
                i0.k.a.c.a(outputStreamWriter2);
                if (cVar.c) {
                    a.a(a.this, cVar, false);
                    a.this.v(cVar.a.a);
                } else {
                    a.a(a.this, cVar, true);
                }
                return cVar;
            } catch (Throwable th) {
                th = th;
                outputStreamWriter = outputStreamWriter2;
                i0.k.a.c.a(outputStreamWriter);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i0.k.a.c.a(outputStreamWriter);
            throw th;
        }
    }
}
