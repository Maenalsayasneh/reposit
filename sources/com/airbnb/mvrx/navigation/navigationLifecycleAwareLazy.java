package com.airbnb.mvrx.navigation;

import h0.q.f;
import h0.q.p;
import h0.q.r;
import i0.b.b.l0.b;
import java.io.Serializable;
import java.util.Objects;
import m0.c;
import m0.n.a.a;
import m0.n.b.i;

/* compiled from: navigationLifecycleAwareLazy.kt */
public final class navigationLifecycleAwareLazy<T> implements c<T>, Serializable {
    public a<? extends T> c;
    public volatile Object d = b.a;
    public final navigationLifecycleAwareLazy<T> q = this;

    public navigationLifecycleAwareLazy(p pVar, a<? extends T> aVar) {
        i.e(pVar, "owner");
        i.e(aVar, "initializer");
        this.c = aVar;
        pVar.getLifecycle().a(new f(this) {
            public final /* synthetic */ navigationLifecycleAwareLazy c;

            {
                this.c = r1;
            }

            public void onStart(p pVar) {
                i.e(pVar, "owner");
                try {
                    if (!(this.c.d != b.a)) {
                        this.c.getValue();
                    }
                    r rVar = (r) pVar.getLifecycle();
                    rVar.d("removeObserver");
                    rVar.b.k(this);
                } catch (IllegalStateException e) {
                    Objects.requireNonNull(this.c);
                    throw new IllegalNavigationStateException("NavController is not always accessible before onViewCreated.\n\nDuring device re-configuration or launch after process death the NavController is not accessible and thus any\nNav Graph ViewModel is also not accessible. You will need to moving any ViewModel access to onViewCreated or later \nin the fragment views lifecycle to ensure the ViewModel can be accessed. ", e);
                }
            }
        });
    }

    public T getValue() {
        T t;
        T t2 = this.d;
        T t3 = b.a;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.q) {
            t = this.d;
            if (t == t3) {
                try {
                    a aVar = this.c;
                    i.c(aVar);
                    t = aVar.invoke();
                    this.d = t;
                    this.c = null;
                } catch (Throwable th) {
                    throw new IllegalNavigationStateException("NavController is not always accessible before onViewCreated.\n\nDuring device re-configuration or launch after process death the NavController is not accessible and thus any\nNav Graph ViewModel is also not accessible. You will need to moving any ViewModel access to onViewCreated or later \nin the fragment views lifecycle to ensure the ViewModel can be accessed. ", th);
                }
            }
        }
        return t;
    }

    public String toString() {
        return this.d != b.a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
