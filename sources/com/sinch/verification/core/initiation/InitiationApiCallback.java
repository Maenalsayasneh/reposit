package com.sinch.verification.core.initiation;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import i0.j.f.p.h;
import i0.n.c.a.d.a.b;
import i0.n.c.a.d.a.c;
import i0.n.c.a.e.a;
import i0.n.c.a.e.d.a;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;
import t0.v;

/* compiled from: InitiationApiCallback.kt */
public class InitiationApiCallback<T extends c> implements a<T> {
    public final i0.n.a.c a;
    public final b<T> b;
    public final i0.n.c.a.e.b c;
    public final p<T, v<T>, T> d;
    public final l<T, i> e;

    public InitiationApiCallback(b bVar, i0.n.c.a.e.b bVar2, p pVar, l<T, i> lVar, int i) {
        AnonymousClass1 r3 = (i & 4) != 0 ? AnonymousClass1.c : null;
        lVar = (i & 8) != 0 ? AnonymousClass2.c : lVar;
        m0.n.b.i.e(bVar, "listener");
        m0.n.b.i.e(bVar2, "statusListener");
        m0.n.b.i.e(r3, "dataModifier");
        m0.n.b.i.e(lVar, "successCallback");
        this.b = bVar;
        this.c = bVar2;
        this.d = r3;
        this.e = lVar;
        this.a = h.M2(this);
    }

    public void a(Object obj, v vVar) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, MessageExtension.FIELD_DATA);
        m0.n.b.i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        InitiationApiCallback$onSuccess$1 initiationApiCallback$onSuccess$1 = new InitiationApiCallback$onSuccess$1(this, cVar, vVar);
        if (!m0.n.b.i.a(this.c.a(), a.c.a)) {
            initiationApiCallback$onSuccess$1.invoke();
        }
    }

    public void onError(Throwable th) {
        m0.n.b.i.e(th, "t");
        InitiationApiCallback$onError$1 initiationApiCallback$onError$1 = new InitiationApiCallback$onError$1(this, th);
        if (!m0.n.b.i.a(this.c.a(), a.c.a)) {
            initiationApiCallback$onError$1.invoke();
        }
    }
}
