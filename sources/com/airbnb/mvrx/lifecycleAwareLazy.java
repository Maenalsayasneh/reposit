package com.airbnb.mvrx;

import h0.q.f;
import h0.q.p;
import h0.q.r;
import i0.b.b.h0;
import java.io.Serializable;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: lifecycleAwareLazy.kt */
public final class lifecycleAwareLazy<T> implements c<T>, Serializable {
    public a<? extends T> c;
    public volatile Object d = h0.a;
    public final lifecycleAwareLazy<T> q = this;
    public final p x;

    public lifecycleAwareLazy(p pVar, a<? extends T> aVar) {
        i.e(pVar, "owner");
        i.e(aVar, "initializer");
        this.x = pVar;
        this.c = aVar;
        pVar.getLifecycle().a(new f(this) {
            public final /* synthetic */ lifecycleAwareLazy c;

            {
                this.c = r1;
            }

            public void onCreate(p pVar) {
                i.e(pVar, "owner");
                if (!(this.c.d != h0.a)) {
                    this.c.getValue();
                }
                r rVar = (r) pVar.getLifecycle();
                rVar.d("removeObserver");
                rVar.b.k(this);
            }
        });
    }

    public T getValue() {
        T t;
        T t2 = this.d;
        T t3 = h0.a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.q) {
            t = this.d;
            if (t == t3) {
                a aVar = this.c;
                i.c(aVar);
                t = aVar.invoke();
                this.d = t;
                this.c = null;
            }
        }
        return t;
    }

    public String toString() {
        return this.d != h0.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
